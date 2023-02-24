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


