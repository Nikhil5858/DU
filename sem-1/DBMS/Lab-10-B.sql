create table company_master(
	com_id int,
	com_name varchar(50)
)

create table emp_department(
	dept_code int primary key,
	dpt_name varchar(50),
	dpt_allotment int
)

create table emp_details(
	emp_idno int,
	emp_fname varchar(50),
	emp_lname varchar(50), 
	emp_dept int,
)

create table item_master(
	pro_id int primary key,
	pro_name varchar(50),
	pro_price int,
	pro_com int 
)

insert into company_master values 
(11,'samsung'),
(12,'iball'),
(13,'epsion'),
(14,'zebronics'),
(15,'asus'),
(16,'frontech')

insert into item_master values 
(101,'Mother Board',3200,15),
(102,'Key Board',450,16),
(103,'Zip Drive',250,14),
(104,'Speaker',550,16),
(105,'Moniter',5000,11),
(106,'DVD Driver',900,12),
(107,'CD Driver',800,12),
(108,'Printer',2600,13),
(109,'Refill cartridge',350,13),
(110,'Mouse',250,12)

insert into emp_details values (127323 ,'Michale', 'Robbin', 57),
(526689 ,'Carlos', 'Snares', 63),
(843795 ,'Enric', 'Dosio' ,57),
(328717 ,'Jhon' ,'Snares' ,63),
(444527, 'Joseph' ,'Dosni', 47),
(659831 ,'Zanifer' ,'Emily', 47),
(847674, 'Kuleswar', 'Sitaraman' ,57),
(748681 ,'Henrey', 'Gabriel', 47),
(555935 ,'Alex', 'Manuel', 57),
(539569, 'George' ,'Mardy', 27),
(733843 ,'Mario', 'Saule', 63),
(631548 ,'Alan', 'Snappy' ,27),
(839139 ,'Maria' ,'Foster', 57)

insert into emp_department values 
(57 ,'IT', 65000),
(63 ,'Finance', 15000),
(47 ,'HR', 240000),
(27 ,'RD', 55000),
(89 ,'QC', 75000)


--1
select c.com_name ,avg(i.pro_price)
from company_master as c
join item_master as i
on c.com_id = i.pro_com
group by c.com_name

--2
select c.com_name ,avg(i.pro_price)
from company_master as c
join item_master as i
on c.com_id = i.pro_com
where i.pro_price>350
group by c.com_name


--------------------------------------------------
--3
select c.com_name,max(i.pro_name),i.pro_price
from company_master as c
join item_master as i
on c.com_id = i.pro_com
group by c.com_name

--4
select e.emp_idno,e.empfname,e.emp_lname,ed.dpt_name
from emp_details as e
WHERE e.emp_lname IN ('Gabriel', 'Dosio')

























