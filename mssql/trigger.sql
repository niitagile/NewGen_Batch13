CREATE TABLE production.product_audits(
    change_id INT IDENTITY PRIMARY KEY,
    product_id INT NOT NULL,
    product_name VARCHAR(255) NOT NULL,
    brand_id INT NOT NULL,
    category_id INT NOT NULL,
    model_year SMALLINT NOT NULL,
    list_price DEC(10,2) NOT NULL,
    updated_at DATETIME NOT NULL,
    operation CHAR(3) NOT NULL,
    CHECK(operation = 'INS' or operation='DEL')
);
CREATE TRIGGER production.trg_product_audit
ON production.products
AFTER INSERT
AS
BEGIN
INSERT INTO production.product_audits(product_id, product_name, brand_id,category_id, model_year, list_price, updated_at,operation)
SELECT i.product_id, product_name,brand_id, category_id, model_year,i.list_price,GETDATE(),'INS'
FROM inserted i
End
    
INSERT INTO production.products( product_name,brand_id, category_id, model_year, list_price)
VALUES ('Test product', 1, 1, 2018, 599);
select * from production.products;
select * from production.product_audits;

CREATE TRIGGER production.trg_product_audit1
ON production.products
AFTER Delete
AS
BEGIN
INSERT INTO production.product_audits(product_id, product_name, brand_id,category_id, model_year, list_price, updated_at,operation)
SELECT i.product_id, product_name,brand_id, category_id, model_year,i.list_price,GETDATE(),'DEL'
FROM deleted i
End

delete from production.products where product_name='Test product';
***********************************************************************************************************************************
create table Student(Rollno int ,name varchar(20));
create table Student_log(chageid int identity,Rollno int, name varchar(20), modifydate smalldatetime, operation char(3));

create trigger Student_insert_log on Student
After insert
as begin
insert into Student_log (rollno, name, modifydate, operation)
select i.rollno, name, getdate(),'ins' from inserted i
end

insert into Student values(1, 'Manisha');

select * from student;
select * from Student_log

create trigger Student_delete_log on Student
After delete
as begin
insert into Student_log (rollno, name, modifydate, operation)
select i.rollno, name, getdate(),'del' from deleted i
end
delete from student where rollno=1

select * from student
select * from Student_log


alter trigger Student_delete_log on Student
After delete
as begin
insert into Student_log (rollno, name, modifydate, operation)
select i.rollno, name, getdate(),'del' from deleted i
end


insert into Student values(2, 'Manisha');
delete from student where rollno=2

-- trigger for update values and store new and old values
alter trigger Student_update_log on Student
After update
as begin
insert into Student_log1 (rollno, oldname, new_name,modifydate, operation)
select i.rollno, d.name,i.name, getdate(),'upd' from inserted i inner join deleted d on i.rollno=d.rollno
end

select * from student
insert into Student values(2, 'Manisha');
update student set name='mahendra' where name='Makesh'

create table Student_log1(chageid int identity,Rollno int, oldname varchar(20), new_name varchar(20),modifydate smalldatetime, operation char(3));

select * from student_log1