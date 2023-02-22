--cluster index
select * into production.products1 from production.products
select * from production.products1;
select product_id, product_name from production.products1 where product_id >7
create clustered index ix_product_id on production.products1(product_id);
drop index ix_product_id on production.products1;
alter index all on production.products1 disable -- disable cluster will not allow user to access data

alter index all on production.products1 rebuild;
--Non-Cluster index
SELECT 
    customer_id, 
    city
FROM 
    sales.customers
WHERE 
    city = 'Atwater';

	CREATE INDEX ix_customers_city
ON sales.customers(city);


SELECT 
    customer_id, 
    first_name, 
    last_name
FROM 
    sales.customers
WHERE 
    last_name = 'Berg' AND 
    first_name = 'Monika';

CREATE nonclustered INDEX ix_customers_name 
ON sales.customers(last_name, first_name);

-- filter index
select customer_id,phone from sales.customers
SELECT 
    SUM(CASE
            WHEN phone IS NULL
            THEN 1
            ELSE 0
        END) AS [Has Phone], 
    SUM(CASE
            WHEN phone IS NULL
            THEN 0
            ELSE 1
        END) AS [No Phone]
FROM 
    sales.customers;

CREATE INDEX ix_cust_phone
ON sales.customers(phone)
WHERE phone IS NOT NULL;

SELECT    
    first_name,
    last_name, 
    phone
FROM    
    sales.customers
WHERE phone = '(281) 363-3309';


-- View

SELECT
    product_name, 
    brand_name, 
    list_price
FROM
    production.products p
INNER JOIN production.brands b 
        ON b.brand_id = p.brand_id;

CREATE VIEW sales.product_info
AS
SELECT
    product_name, 
    brand_name, 
    list_price
FROM
    production.products p
INNER JOIN production.brands b 
        ON b.brand_id = p.brand_id;



select * from sales.product_info

-- rename a view
EXEC sp_rename 
    @objname = 'sales.product_info',
    @newname = 'product_list';

	--drop view
	drop view sales.product_list

-- Stored Procedure

SELECT 
	product_name, 
	list_price
FROM 
	production.products
ORDER BY 
	product_name;


CREATE PROCEDURE uspProductList
AS
BEGIN
    SELECT 
        product_name, 
        list_price
    FROM 
        production.products
    ORDER BY 
        product_name;
END;

--run procedures
exec uspProductList

--alter procedure
ALTER PROCEDURE [dbo].[uspProductList]
AS
BEGIN
    SELECT 
        product_name, 
        list_price,model_year
    FROM 
        production.products
    ORDER BY 
        product_name;
END;

--drop procedure
drop procedure uspProductList

-- how to pass parameters in procedures
Create PROCEDURE uspFindProducts(@min_list_price AS DECIMAL)
AS
BEGIN
    SELECT
        product_name,
        list_price
    FROM 
        production.products
    WHERE
        list_price >= @min_list_price
    ORDER BY
        list_price;
END;

exec  uspFindProducts 200

alter PROCEDURE uspFindProducts(@min_list_price AS DECIMAL,@max_list_price AS DECIMAL)
AS
BEGIN
    SELECT
        product_name,
        list_price
    FROM 
        production.products
    WHERE
        list_price between @min_list_price and @max_list_price
    ORDER BY
        list_price;
END;

exec  uspFindProducts 100,200
--pass String
ALTER PROCEDURE uspFindProducts(
    @min_list_price AS DECIMAL
    ,@max_list_price AS DECIMAL
    ,@name AS VARCHAR(50)
)
AS
BEGIN
    SELECT
        product_name,
        list_price
    FROM 
        production.products
    WHERE
        list_price between @min_list_price and @max_list_price and
        product_name LIKE '%' + @name + '%'
    ORDER BY
        list_price;
END;

EXECUTE uspFindProducts 
    @min_list_price = 900, 
    @max_list_price = 1000,
    @name = 'Trek';


	-- Default parameters/Optional Parameters
	ALTER PROCEDURE uspFindProducts(
    @min_list_price AS DECIMAL=100
    ,@max_list_price AS DECIMAL=200
    ,@name AS VARCHAR(50),
	
)
AS
BEGIN
    SELECT
        product_name,
        list_price
    FROM 
        production.products
    WHERE
        list_price between @min_list_price and @max_list_price and
        product_name LIKE '%' + @name + '%'
    ORDER BY
        list_price;
END;

EXECUTE uspFindProducts 
    @name = 'Trek';

	EXECUTE uspFindProducts 
	 @min_list_price = 900, 
    @max_list_price = 1000,
    @name = 'Trek';

-- how to declare variables in procedures
CREATE  PROC uspGetProductList1(@model_year SMALLINT) 
AS 
BEGIN
    DECLARE @product_list VARCHAR(100);

    SET @product_list = '';

    SELECT
        @product_list = @product_list + product_name 
                        + CHAR(10)
    FROM 
        production.products
    WHERE
        model_year = @model_year
    ORDER BY 
        product_name;

    PRINT @product_list;
END;

EXEC uspGetProductList1 2018
--Output parameter
--finds products by model year and returns the number of products via the @product_count output parameter

CREATE PROCEDURE uspFindProductByModel (
    @model_year SMALLINT,
    @product_count INT OUTPUT
) AS
BEGIN
    SELECT 
        product_name,
        list_price
    FROM
        production.products
    WHERE
        model_year = @model_year;

    SELECT @product_count = @@ROWCOUNT;--@@ROWCOUNT is a system variable that returns the number of rows read by the previous statement.
END;

--print ouptut parameter
DECLARE @count INT;

EXEC uspFindProductByModel
    @model_year = 2018,
    @product_count = @count OUTPUT;

SELECT @count AS 'Number of products found';