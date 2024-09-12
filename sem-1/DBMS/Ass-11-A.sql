create table salesman (
	salesman_id int,
	name varchar(50),
	city varchar(50),
	commission varchar(50)
)

create table customer(
	customer_id int primary key,
	cust_name varchar(50),
	city varchar(50),
	grade int,
	salesman_id int,
	foreign key salesman_id references salesman(salesman_id)
)

create table orders(
	ord_no int primary key,
	purch_amt int,
	ord_date date,
	customer_id int,
	salesman_id int,
	foreign key customer_id references customer(customer_id),
	foreign key salesman_id references salesman(salesman_id)
)