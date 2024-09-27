create table salesman (
	salesman_id int,
	name varchar(50),
	city varchar(50),
	commission varchar(50)
)

create table customer(
	customer_id int,
	cust_name varchar(50),
	city varchar(50),
	grade int,
	salesman_id int
)

create table orders(
	ord_no int,
	purch_amt int,
	ord_date date,
	customer_id int,
	salesman_id int
)


insert into salesman values 
(5001 ,'James Hoog','New York', 0.15),
(5002 ,'Nail Knite','Paris' ,0.13),
(5005 ,'Pit Alex','London' ,0.11),
(5006 ,'Mc Lyon','Paris' ,0.14),
(5007 ,'Paul Adam','Rome', 0.13),
(5003 ,'Lauson Hen','San Jose', 0.12)

insert into customer values
(3002, 'Nick Rimando', 'New York' ,100, 5001),
(3007, 'Brad Davis', 'New York', 200, 5001),
(3005, 'Graham Zusi', 'California' ,200, 5002),
(3008, 'Julian Green', 'London', 300, 5002),
(3004, 'Fabian Johnson', 'Paris', 300, 5006),
(3009, 'Geoff Cameron', 'Berlin' ,100, 5003),
(3003, 'Jozy Altidor', 'Moscow', 200, 5007),
(3001, 'Brad Guzan', 'London',null, 5005)

insert into orders values
(70001 , 150.5, '05-oct-2012', 3005, 5002),
(70009 , 270.65, '10-sep-2012', 3001, 5005),
(70002 , 65.26, '05-oct-2012', 3002, 5001),
(70004 , 110.5 ,'17-aug-2012', 3009, 5003),
(70007 , 948.5, '10-sep-2012', 3005, 5002),
(70005 , 2400.6, '27-jul-2012', 3007, 5001),
(70008 , 5760, '10-sep-2012', 3002, 5001),
(70010 , 1983.43, '10-oct-2012', 3004, 5006),
(70003 , 2480.4, '10-oct-2012', 3009, 5003),
(70012 , 250.45, '27-jun-2012', 3008, 5002),
(70011 , 75.29, '17-aug-2012', 3003, 5007),
(70013 , 3045.6, '25-apr-2012', 3002, 5001),
(70001 , 150.5, '05-oct-2012', 3005, 5002),
(70009 , 270.65, '10-sep-2012', 3001, 5005),
(70002 , 65.26, '05-oct-2012', 3002, 5001)

--1
select ord_no,purch_amt ,ord_date,customer_id ,salesman_id from orders where salesman_id=5007

--2
select ord_no,purch_amt ,ord_date,customer_id
from orders o
inner join salesman s
on o.salesman_id = s.salesman_id
where s.city='London'
 
--3
select ord_no,purch_amt ,ord_date,customer_id,salesman_id from orders
where customer_id=3007

--4
--select ord_no,avg(purch_amt),ord_date,customer_id
--from orders o
--inner join salesman s
--on o.salesman_id = s.salesman_id
--where o.ord_date='10-Oct-2012'

--5
select ord_no,purch_amt ,ord_date,o.salesman_id
from orders o
inner join customer c
on o.customer_id = c.customer_id
where c.city='New York'

--6
select name,city,commission from salesman where city='Paris'

--7
select * from customer where customer_id<=5001 and salesman_id = (select salesman_id from salesman where name='Mc Lyon')

--8
select COUNT(*) as customer,grade from customer c
where grade>(select AVG(grade) from customer where city='New York') 
group by grade

--9
select ord_no,purch_amt,ord_date,salesman_id 
from orders 
where salesman_id=(select max(commission) from salesman)

--10
select o.ord_no,o.purch_amt,o.ord_date,o.salesman_id,c.cust_name
from orders as o
inner join customer as c
on o.customer_id = c.customer_id
where ord_date='17-aug-2012'

--11
select s.salesman_id,s.name
from salesman as s
where salesman_id in (select c.salesman_id from customer c group by c.salesman_id having COUNT(c.customer_id)>1)

--12
select o.ord_no,o.purch_amt as PurchAmount,o.ord_date,o.salesman_id,o.customer_id
from orders as o
where o.purch_amt in (select AVG(purch_amt) from orders)

--13
select o.ord_no,o.purch_amt as PurchAmount,o.ord_date,o.salesman_id,o.customer_id
from orders as o
where o.purch_amt >= (select AVG(purch_amt) from orders)

--14

select sum(o.purch_amt),o.ord_date
from orders as o
group by o.ord_date
having 
sum(o.purch_amt)>(select max(purch_amt) from orders) + 1000

--15
select * from customer where 'London' in (select city from customer)


------------------------ B --------------------------------------

--1
SELECT s.salesman_id, s.name, s.city, s.commission
FROM salesman s
WHERE s.salesman_id IN (
  SELECT c.salesman_id
  FROM customer c
  GROUP BY c.salesman_id
  HAVING COUNT(DISTINCT c.customer_id) > 1
)
--2
select s.salesman_id,s.name,s.city,s.commission
from salesman as s
where salesman_id in (select c.salesman_id from customer as c group by c.salesman_id having count(distinct c.customer_id)=1)

--3
