create table employee(
	empno int primary key,
	emapname varchar(50),
	joiningdate datetime,
	salary int,
	city varchar(50)
)

insert into employee values 
(101,'keyur','05-jan-2002',12000,'rajkot'),
(102,'hardik','15-feb-2004',14000,'Ahmedabad'),
(103,'kajal','14-mar-2006',15000,'Baroda'),
(104,'bhoomi','23-jun-2005',12500,'Ahmedabad'),
(105,'harmit','15-feb-2004',14000,'rajkot')


select emapname from employee where (salary > 13000) and (city in ('rajkot','baroda'));
select emapname from employee order by emapname asc
select distinct city from employee
update employee set city = null where empno in (101,104)
select emapname from employee where city is null
delete from employee where salary >= 14000
delete from employee where city = 'rajkot'
delete from employee where joiningdate > '2007-01-01'
truncate table employee
drop table employee
truncate table deposit
drop table deposit
drop table branch
drop table customers
drop table borrow



































