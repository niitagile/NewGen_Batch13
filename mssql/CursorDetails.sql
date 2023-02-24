--Declare cursor
--DECLARE cursor_name CURSOR FOR select_statement;
--OPEN cursor_name;
--FETCH NEXT FROM cursor_name INTO variable_list;
--WHILE @@FETCH_STATUS = 0  
  --  BEGIN
    --    FETCH NEXT FROM cursor_name;  
    --END;

--@@FETCH_STATUS is predefined function which tells the status of records in cursor
--close cursor_name
--DEALLOCATE cursor_name;

DECLARE 
    @product_name VARCHAR(50), 
    @list_price   DECIMAL;
DECLARE cursor_product CURSOR FOR SELECT product_name, list_price FROM production.products;
OPEN cursor_product;
FETCH NEXT FROM cursor_product INTO @product_name,@list_price;
WHILE @@FETCH_STATUS = 0
BEGIN
        PRINT @product_name + CAST(@list_price AS varchar);
        FETCH NEXT FROM cursor_product INTO  @product_name, @list_price;
END;

CLOSE cursor_product;
DEALLOCATE cursor_product;


--Update values cursor in sql server 
-- declare a cursor


DECLARE update_cursor CURSOR FOR 
SELECT Order_ID,quantity from Sales.Order_items WHERE Order_ID=110

-- open cursor and fetch first row into variables
OPEN update_cursor
FETCH FROM update_cursor

-- check for a new row
WHILE @@FETCH_STATUS=0
BEGIN
-- do update operation
UPDATE Sales.Order_items SET quantity=100 WHERE CURRENT OF update_cursor 
-- get next available row into variables
FETCH NEXT FROM update_cursor
END
close update_cursor
Deallocate update_cursor

select * from sales.order_items where order_id =110



