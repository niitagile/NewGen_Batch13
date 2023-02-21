		Database					Student			
NAME	ROLL_NO	LOCATION	PHONE_NUMBER			NAME	ROLL_NO	SECTION		
Ram	101	Chennai		9988775566			Ravi	104	A		
Raj	102	Coimbatore	8877665544			Sumathi	105	B		
Sasi	103	Madurai		7766553344			Raj	102	A		
Ravi	104	Salem		8989898989							
Sumathi	105	Kanchipuram	8989856868							
										
										
										
										
		Student1					Student2			
										
NAME	ROLL_NO	LOCATION	PHONE_NUMBER			NAME	ROLL_NO	LOCATION	PHONE_NUMBER	
Ram	101	chennai		9988773344			Raj	111	chennai		8787878787	
Raju	102	coimbatore	9090909090			Sai	112	mumbai		6565656565	
Ravi	103	salem		8989898989			Sri	113	coimbatore	7878787878	
										
										
										
To display NAME, LOCATION, PHONE_NUMBER of the students from DATABASE table whose section is A


select name, location , phone_number from database
where name in
(select name from student where section ='A')


To insert Student2 into Student1 table:

insert into student1
select * from student2

To delete students from Student2 table whose rollno is same as that in Student1 table and having location as chennai

DELETE FROM Student2 
WHERE ROLL_NO IN ( SELECT ROLL_NO 
                   FROM Student1 
                   WHERE LOCATION = ’chennai’);

To update name of the students to geeks in Student2 table whose location is same as Raju,Ravi in Student1 table


update student2 set name='geeks' where location in
(select location from student1 where name in('Ravi', 'Raju');



**************************************************


SELECT product_name, list_price
FROM
    production.products
WHERE
    list_price >= ANY (
        SELECT
            AVG (list_price)
        FROM
            production.products
        GROUP BY
            brand_id
    )
