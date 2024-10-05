create table salesman(
	salesmanid int primary key,
	name varchar(50) not null,
	city varchar(50) not null,
	commission decimal(2,2)
)

create table customer(
	customerid int primary key,
	customername varchar(50) not null,
	city varchar(50) not null,
	grade int not null,
	salesmanid int,
	foreign key (salesmanid) references salesman(salesmanid)
)

create table orders(
	orderno int,
	pur_amount int not null,
	ord_date date not null,
	customerid int not null,
	salesmanid int not null,
	foreign key (customerid) references customer(customerid),
	foreign key (salesmanid) references salesman(salesmanid)
)

insert into salesman values 
(5001,'James Hoog','New York',0.15),
(5002,'Nail Knite','Paris',0.13),
(5005,'Pit Alex','London',0.11),
(5006,'Mc Lyon','Paris',0.14),
(5007,'Paul Adam','Rome',0.13),
(5003,'Lauson Hen','San Jose',0.12)

insert into customer values 
(3002,'Nick Rimando','New York',100,5001),
(3007,'Brad Davis','New York',200,5001),
(3005,'Graham Zusi','California',200,5002),
(3008,'Julian Green','London',300,5002),
(3004,'Fabian Johnson','Paris',300,5006),
(3009,'Geoff Cameron','Berlin',100,5003),
(3003,'Jozy Altidor','Moscow',200,5007),
(3001,'Brad Guzan','London',200,5005)

insert into orders values
(7001,150.5,'05-oct-2012',3005,5002),
(7009,270.65,'10-sep-2012',3001,5005),
(7002,65.26,'05-oct-2012',3002,5001),
(7004,110.5,'17-aug-2012',3009,5003),
(7007,948.5,'10-sep-2012',3005,5002),
(7005,2400.6 ,'27-jul-2012',3007,5001),
(7008,5760,'10-sep-2012',3002,5001),
(7010,1983.43,'10-oct-2012',3004,5006),
(7003,2480.4,'10-oct-2012',3009,5003),
(7012,250.45,'27-jun-2012',3008,5002),
(7011,75.29,'17-aug-2012',3003,5007),
(7013,3045.6,'25-apr-2012',3002,5001),
(7001,150.5,'05-oct-2012',3005,5002),
(7009,270.65,'10-sep-2012',3001,5005),
(7002,65.26,'05-oct-2012',3002,5001)

--1
select s.name,c.customername,c.city
from salesman as s
join customer as c
on s.city= c.city

--2
select o.orderno,o.pur_amount,c.customername,c.city 
from orders as o
join customer as c
on o.customerid = c.customerid
where pur_amount between 500 and 2000

--3
select c.customername,c.city,s.name AS Salesmanname,s.commission
from customer as c
join salesman as s
on c.salesmanid = s.salesmanid

--4
select c.customername,c.city,s.name AS Salesmanname,s.commission
from customer as c
join salesman as s
on c.salesmanid = s.salesmanid
where s.commission>0.12

--5
select c.customername,c.city,s.name AS Salesmanname,s.commission,s.city as salesmancity
from customer as c
join salesman as s
on c.salesmanid = s.salesmanid
where s.commission>0.12
and c.city <>s.city

--6
SELECT 
  o.orderno,
  o.ord_date,
  o.pur_amount,
  c.customername,
  c.grade,
  s.name AS Salesman,
  s.commission
FROM 
  orders AS o
  JOIN customer AS c ON o.customerid = c.customerid
  JOIN salesman AS s ON o.salesmanid = s.salesmanid;

--7
select c.customerid,c.customername,c.city,c.grade,s.name,s.commission,o.orderno,o.pur_amount,o.ord_date
from orders as o
JOIN customer AS c ON o.customerid = c.customerid
JOIN salesman AS s ON o.salesmanid = s.salesmanid;

--8
SELECT c.customerid,c.customername,c.city,c.grade,s.name,s.city
FROM customer AS c
JOIN salesman AS s 
ON c.salesmanid = s.salesmanid
ORDER BY c.customerid ASC

--9
SELECT c.customername AS Cust_Name,c.city AS Customer_City,c.grade,s.name AS Salesman,s.city AS Salesman_City
FROM 
customer AS c
JOIN salesman AS s 
ON c.salesmanid = s.salesmanid
WHERE c.grade < 300
ORDER BY c.customerid ASC;

--10

SELECT c.customername,c.city,o.orderno,o.ord_date,o.pur_amount
FROM customer AS c
LEFT JOIN orders AS o 
ON c.customerid = o.customerid
ORDER BY o.ord_date ASC;













































