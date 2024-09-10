create table student6(
	rno int primary key,
	name varchar(50),
	branch varchar(50),
)

create table result(
	rno int primary key,
	spi decimal(1,1)
)

create table employee6(
	employeeno int primary key,
	name varchar(50),
	managerno varchar(50),
)

insert into student6 values
(101,'raju','ce'),
(102,'amit','ce'),
(103,'sanjay','me'),
(104,'neha','ec'),
(105,'meera','ee'),
(106,'mahesh','me')

insert into result values
(101,8.8),
(102,9.2),
(103,7.6),
(104,8.2),
(105,7.0),
(106,8.9)

insert into employee6 values
(01,'tarun',null),
(02,'rohan',02),
(03,'priya',03),
(04,'milan',04),
(05,'jay',05),
(06,'anjana',06)

select * from student6
select * from result
select * from employee6

--1
select *
from student6 as s
join result as r
on s.rno = r.rno

--2
select s.rno,s.name,s.branch,r.spi
from student6 as s
join result as r
on s.rno = r.rno

--3
select s.rno,s.name,s.branch,r.spi
from student6 as s 
join result as r
on s.rno = r.rno where s.branch ='ce'

--4
select s.rno,s.name,s.branch,r.spi
from student6 as s 
join result as r
on s.rno = r.rno where s.branch ='ec'

--5
select s.branch, AVG(r.spi) as avg_spi
from result AS r
JOIN student6 AS s 
on r.rno = s.rno
group by s.branch

--6
select s.branch, AVG(r.spi) as avg_spi 
from result AS r
JOIN student6 AS s 
on r.rno = s.rno
group by s.branch
order by avg_spi asc

--7
select s.branch,AVG(r.spi) as avg_spi
from student6 as s 
join result as r
on s.rno = r.rno
where s.branch in ('ce','me')
group by s.branch

--8
SELECT s.rno, s.name, s.branch, r.spi
FROM student6 AS s
LEFT OUTER JOIN result AS r 
ON s.rno = r.rno

--9
SELECT s.rno, s.name, s.branch, r.spi
FROM student6 AS s
RIGHT OUTER JOIN result AS r 
ON s.rno = r.rno

--10
SELECT s.rno, s.name, s.branch, r.spi
FROM student6 AS s
FULL OUTER JOIN result AS r 
ON s.rno = r.rno

--11
SELECT e.name AS EmployeeName, m.name AS ManagerName
FROM employee6 AS e
LEFT JOIN employee6 AS m ON e.managerno = m.employeeno;




































