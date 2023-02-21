select * from sales.orders;

--to find the sales orders of the customers located in New York
select customer_id, order_id,order_date from sales.orders
where customer_id in(select customer_id from sales.customers where city='New York')
order by order_date;

---Nested Query
--Display prodct name and list prict of those product which are under brand 'Strider' or 'Trek' 
--and their list_price is greater than brand average listprice
SELECT   product_name, list_price FROM production.products
WHERE list_price > (SELECT AVG (list_price) FROM production.products  WHERE brand_id IN
(SELECT brand_id FROM production.brands WHERE brand_name = 'Strider' OR brand_name = 'Trek')
);

-- show product_name,list_price whose list_price is greater than or less than average list_price of any brand
select avg(list_price) from production.products group by brand_id
-- all means compare list_price with all results of avg(list_price)and any one of the results must be satisfied the condition
select product_name, list_price from production.products where list_price >=any
(select avg(list_price) from production.products group by brand_id)
-- all means compare list_price with all results of avg(list_price)and all results must be satisfied the condition
select product_name, list_price from production.products where list_price >=all
(select avg(list_price) from production.products group by brand_id)


-- exist operator checks whether sub query providing some result or not
--finds the customers who bought products in 2017:

SELECT customer_id,first_name,last_name,city
FROM sales.customers c
WHERE EXISTS (
(SELECt customer_id FROM sales.orders o WHERE o.customer_id = c.customer_id AND YEAR (order_date) = 2017)


-- not exist operator checks whether sub query providing some result or not
--finds the customers who did not buy any products in 2017:

SELECT customer_id,first_name,last_name,city
FROM sales.customers c
WHERE not EXISTS (
(SELECt customer_id FROM sales.orders o WHERE o.customer_id = c.customer_id AND YEAR (order_date) = 2017)
