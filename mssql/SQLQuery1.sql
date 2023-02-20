create database newgen;
drop database newgen;
use newgen;
select @@VERSION;
select SERVERPROPERTY('ResourceVersion');
create table books(bookid char(5) primary key, bookname varchar(30), authorname varchar(30),price float,publishdate datetime,
publishname varchar(30), category varchar(20), booklang varchar(20));
sp_help books;
insert into books(bookid,bookname,authorname,price, publishdate,publishname,category,booklang) values(
'B110','C++','Yashwant', 123.5,'12.01.2000','BPB Publication', 'Techincal', 'English');

insert into books(bookid,bookname,authorname,price, publishdate,publishname,category,booklang) values(
'B1101','C','Yashwant', 125.5,'12.01.1980','BPB Publication', 'Techincal', 'English');

select * from books;

select * from books where bookid='b1101';
select GETDATE();


insert into BOOKS(bookid,bookname,authorname,price, publishdate,publishname,category,booklang)values('B1100','IDOLS','S.M GAVASKAR',450.00,'05.08.1987','RUPA', 'AUTOBIOGRAPHY', 'English');
insert into books(bookid,bookname,authorname,price, publishdate,publishname,category,booklang) values('B1145','Theree muskitiers','Alexander Duma', 290,'06.18.1988','Ananda Publishers', 'Novel', 'English');
insert into BOOKS(bookid,bookname,authorname,price, publishdate,publishname,category,booklang)values('B1290','Learning C','E. Balaguruswamy',290.00,'10.10.1995','Tata McgrawHills', 'Programming Language', 'English'); insert into BOOKS(bookid,bookname,authorname,price, publishdate,publishname,category,booklang)values('B1293','Rishtey','Sandeep Ahlawat',610.00,'10.25.2009','Tata McgrawHills', 'Novel', 'English'); insert into BOOKS(bookid,bookname,authorname,price, publishdate,publishname,category,booklang)values('B1361','College Days','Seema Avasthi',620.00,'09.12.2010','Tata McgrawHills', 'Story Book', 'Marathi'); insert into books(bookid,bookname,authorname,price, publishdate,publishname,category,booklang) values('B1145','Theree muskitiers','Alexander Duma', 290,'06.18.1988','Ananda Publishers', 'Novel', 'English');insert into BOOKS(bookid,bookname,authorname,price, publishdate,publishname,category,booklang)values('B1419','Punjabi Rasoi','Khushwant Singh',670.00,'08.09.2002','Tata McgrawHills', 'Biography', 'Punjabi');
insert into BOOKS(bookid,bookname,authorname,price, publishdate,publishname,category,booklang)values('B1420','Indian Politics','Jaswant Sinha',540.00,'04.04.2012','Ananda Publishers', 'Storybook', 'Hindi'); 
insert into BOOKS(bookid,bookname,authorname,price, publishdate,publishname,category,booklang)values('B1422','The Emergency','K.Nair',670.00,'08.09.2002','Rupa', 'Storybook', 'English'); 
insert into BOOKS(bookid,bookname,authorname,price, publishdate,publishname,category,booklang)values('B1424','The Tall Man','E. Bhargava',790.00,'11.16.2016','BPB', 'Storybook', 'MARATHI'); 

select * from books;
select bookid,bookname,booklang from books;
select * from books where price > 650 and publishname= 'Tata McgrawHills';
select * from books where price > 650 or publishname= 'Tata McgrawHills';
select bookname  'Name of book',publishname  'publisher name' from books;
select bookname, price, price*.1 'Discount'  from books;
select * from books where year(publishdate) between 2010 and 2015 
select * from books where publishdate between '1.1.2010' and '12.31.2015'
select * from books where month(publishdate)=10;
select * from books where bookname like 'I%';
select * from books where bookname like '%e%';
select * from books where bookname like '_e%';
select * from books where bookname like '[cp]%';
select * from books where bookname like '[c-p]%';
select * from books where bookname like '[^cp]%';
select * from books where bookname like'c%p';
insert into BOOKS(bookid,bookname,authorname,price, publishdate,publishname,category,booklang)values('B1109','Java','Herbert',null,'05.08.1987','RUPA', 'Programming Language', 'English');
select bookname from books where price is null;
select * from books;
select bookname, price, price*.1 'Discount' from books;
select bookname, price, isnull(price,1)*.1 'Discount' from books;
select * from books order by bookname;
select * from books order by publishname desc;
select * from books order by publishname desc, bookname asc;
select sum(price) from books;
select publishname, sum(price) ' Total Expenditure' from books group by publishname;
select publishname, sum(price) ' Total Expenditure' from books group by publishname having sum(price) > 800;
select top 5 * from books;

select * from books order by bookname offset 5 rows;
select left(bookname,4) from books;
select right(bookname,4) from books;
select len(bookname) from books;
select len('Megha') ;
select ltrim ('   Megha   ');
select rtrim('    Megha    ');
select bookname, reverse(bookname) from books;
select bookname,upper(bookname), lower(bookname), substring(bookname, 2,5) from books;
select concat(bookname,price) from books;  


select getdate();
select day(getdate());
select day(publishdate) from books;
select datename(month,publishdate) from books;
select datediff(month,'12.01.2022','10.01.2023');
select dateadd(month,3,'12.01.2022');


select ceiling(14.25);
select floor(14.25);
select round(14.25,1);
select exp(14.25);
select power(2,3);
select round(14.25,0);
select round(14.65,0);
select choose(2,'Trigger','view','table');
select iif(45>78,'78 is greater','45 is lesser');

select host_id();
select host_name();
select USER_NAME();
select user_id('dbo');

select * from books;

SELECT 'TotalPrice' as TotalPrice, 
[RUPA],[BPB Publication] 
FROM
(SELECT publishname, price
 FROM books) AS SourceTable
PIVOT
(
 sum(price)
 FOR publishname IN ([RUPA], [BPB Publication])
) AS UnPivotTable;


select publishname, authorname ,count(bookname) from books group by rollup(publishname, authorname);

select publishname, authorname ,count(bookname) from books group by cube(publishname, authorname);
select * from books;
delete from books where bookid='b1104';


create table Person(
pid int primary key,
pname varchar(20) not null,
city varchar(20) default 'Delhi',
age int check(age>0),
phone char(10) unique,
rec_no int identity
);

insert into Person(pid,pname,age, phone) values (101,'Abhay', 10, 7865436);

select * from Person;

create table result(
pid int foreign key references person(pid),
total int 
);

insert into result(pid, total) values(null,67);
insert into result(pid, total) values(102,68);
insert into result(pid, total) values(101,65);
select * from result;