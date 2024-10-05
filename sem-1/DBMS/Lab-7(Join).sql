create table department(
	departmentid int primary key,
	departmentname varchar(100) not null unique,
	departmentcode varchar(50) not null unique,
	location varchar(50) not null
)

create table person(
	personid int primary key,
	personname varchar(100) not null,
	departmentid int,
	salary decimal(8,2) not null,
	joiningdate date not null,
	city varchar(50) not null,
	foreign key (departmentid) references department(departmentid)
)

insert into department values
(1,'admin','adm','A-Block'),
(2,'computer','ce','C-Block'),
(3,'civil','ci','G-Block'),
(4,'electrical','ee','E-Block'),
(5,'mechanical','me','B-Block')

insert into person values
(101,'rahul tripathi',2,56000,'01-jan-2000','rajkot'),
(102,'Hardik Pandya',3,18000,'25-sep-2001','Ahmedabad'),
(103,'Bhavin Kanani',4,25000,'14-may-2000','Baroda'),
(104,'Bhoomi Vaishnav',1,39000,'08-feb-2005','rajkot'),
(105,'Rohit Topiya',2,17000,'23-july-2001','jamnagar'),
(106,'Priya Menpara',null,9000,'18-oct-2000','Ahmedabad'),
(107,'Neha Sharma',2,34000,'25-dec-2002','rajkot'),
(108,'Nayan Goswami',3,25000,'01-july-2001','rajkot'),
(109,'Mehul Bhundiya',4,13500,'09-jan-2005','Baroda'),
(110,'Mohit Maru',5,14000,'25-may-2000','jamnagar')


--1
select p.personname,d.departmentcode
from person as p
join department as d
on p.departmentid = d.departmentid

--2
select p.personname,d.location
from person as p
join department as d
on p.departmentid = d.departmentid
where location = 'C-Block'

--3
select p.personname,p.salary,d.departmentname,p.city
from person as p
join department as d
on p.departmentid = d.departmentid
where city = 'jamnagar'

--4
select p.personname,p.salary,d.departmentname,p.city
from person as p
join department as d
on p.departmentid = d.departmentid
where city != 'rajkot'

--5
select p.personname,d.departmentcode
from person as p
join department as d
on p.departmentid = d.departmentid
where d.departmentname = 'civil'
and p.joiningdate > '1-Aug-2001'

--6
select p.personname,p.salary,p.joiningdate,p.city,d.departmentname,d.departmentcode,d.location
from person as p
join department as d
on p.departmentid = d.departmentid
where d.departmentname = 'computer'

--7
select p.personname,d.departmentname
from person as p
join department as d
on p.departmentid = d.departmentid
WHERE DATEDIFF(day, p.joiningdate, GETDATE()) > 365;

--8
SELECT d.departmentname, COUNT(p.personid) AS person_count
FROM department AS d
LEFT JOIN person AS p
ON d.departmentid = p.departmentid
GROUP BY d.departmentname

--9
select d.departmentname,MIN(p.salary) AS Minimun_Salary,MAX(p.salary) AS Maximum_Salary
from department as d
join person as p
on d.departmentid = p.departmentid
group by d.departmentname

--10
select p.city,MIN(p.salary) AS Minimun_Salary,MAX(p.salary) AS Maximum_Salary,SUM(p.salary) AS Total_Salary,AVG(p.salary) AS Average_Salary
from department as d
join person as p
on d.departmentid = p.departmentid
group by p.city

--11
SELECT AVG(p.salary) AS Average_salary
FROM department AS d
JOIN person AS p
ON d.departmentid = p.departmentid
WHERE p.city = 'Ahmedabad';

--12
select p.personname +' lives in '+p.city+ ' and works in '+d.departmentname+' Department '
from department as d
join person as p
on d.departmentid = p.departmentid

--13
SELECT p.personname + ' earns ' + FORMAT(p.salary, 'N2') + ' from ' + d.departmentname + ' department monthly.' AS Person_Info
FROM department AS d
JOIN person AS p
ON d.departmentid = p.departmentid;

--14

SELECT 
  p.city,
  d.departmentname,
  SUM(p.salary) AS Total_Salary,
  AVG(p.salary) AS Average_Salary,
  MAX(p.salary) AS Maximum_Salary
FROM 
  department AS d
  JOIN person AS p ON d.departmentid = p.departmentid
GROUP BY 
  p.city, d.departmentname

--15
SELECT * 
FROM person 
WHERE departmentid IS NULL




















































