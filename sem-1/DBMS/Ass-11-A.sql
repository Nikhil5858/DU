create table salesman (
	salesman_id int primary key,
	name varchar(50),
	city varchar(50),
	commission varchar(50)
)

create table customer(
	customer_id int primary key,
	cust_name varchar(50),
	city varchar(50),
	grade int,
	salesman_id int foreign key (salesman_id) references salesman(salesman_id)
)

create table orders(
	ord_no int primary key,
	purch_amt int,
	ord_date date,
	customer_id int,
	salesman_id int,
	foreign key (customer_id) references customer(customer_id),
	foreign key (salesman_id) references salesman(salesman_id)
)


insert into salesman values 
(5001 ,'James Hoog','New York', 0.15),
(5002 ,'Nail Knite','Paris' ,0.13),
(5005 ,'Pit Alex','London' ,0.11),
(5006 ,'Mc Lyon','Paris' ,0.14),
(5007 ,'Paul Adam','Rome', 0.13),
(5003 ,'Lauson Hen','San Jose', 0.12)


