create table deposit(
	ACTNO int primary key,
	CNAME varchar(50),
	BNAME  varchar(50),
	AMOUNT decimal(8,2),
	ADATE datetime
)

create table branch(
	BNAME varchar(50),
	CITY varchar(50)
)

create table customers(
	CNAME varchar(50),
	CITY varchar(50)
)

create table borrow(
	LOANNO INT primary key,
	CNAME varchar(50),
	BNAME varchar(50),
	AMOUNT decimal(8,2)
)

insert into deposit values (101,'ANIL','VRCE',(1000),'1-mar-1995'),
(102,'SUNIL','AJNI',(5000),'04-jan-1996'),
 (103,'MEHUL','KAROLBAGH',(3500),'17-nov-1995'),
(104,'MADHURI','CHANDI',(1200),'17-dec-1995'),
(105,'PRMOD','M.G. ROAD',(3000),'27-mar-1996'),
(106,'SANDIP','ANDHERI',(2000),'31-mar-1996'),
(107,'SHIVANI','VIRAR',(1000),'05-sep-1995'),
(108,'KRANTI','NEHRU PLACE',(5000),'02-jul-1995'),
(109,'MINU','POWAI',(7000),'10-aug-1995')

insert into branch values ('VRCE','NAGPUR')
insert into branch values ('AJNI','NAGPUR')
insert into branch values ('KAROLBAGH','NAGPUR')
insert into branch values ('CHANDI','DELHI')
insert into branch values ('DHARAMPETH','DELHI')
insert into branch values ('M.G. ROAD','NAGPUR')
insert into branch values ('ANDHERI','BANGLORE')
insert into branch values ('VIRAR','BOMBAY')
insert into branch values ('NEHRU PLACEV','DELHI')
insert into branch values ('POWAI','BOMBAY')

insert into CUSTOMERS values ('ANIL','CALCUTTA')
insert into CUSTOMERS values ('SUNIL','DELHI')
insert into CUSTOMERS values ('MEHUL','BARODA')
insert into CUSTOMERS values ('MANDAR','PATNA')
insert into CUSTOMERS values ('MADHURI','NAGPUR')
insert into CUSTOMERS values ('PRAMOD','NAGPUR')
insert into CUSTOMERS values ('SANDIP','SURAT')
insert into CUSTOMERS values ('SHIVANI','BOMBAY')
insert into CUSTOMERS values ('KRANTI','BOMBAY')
insert into CUSTOMERS values ('NAREN','BOMBAY')

insert into borrow values (201,'ANIL','VRCE', 1000)
insert into borrow values (202,'MEHUL','AJNI', 5000)
insert into borrow values (203,'SUNIL','DHARAMPETH', 3000)
insert into borrow values (204,'MADHURI','ANDHERI', 2000)
insert into borrow values (205,'PRMOD','VIRAR', 8000)
insert into borrow values (206,'KRANTI','NEHRU PLACE', 3000)

SELECT * from deposit
SELECT * from BORROW
SELECT * from CUSTOMERS
insert into BORROW values (550,'JAY','AJNI',NULL)

SELECT ACTNO,CNAME,AMOUNT FROM deposit

SELECT LOANNO,AMOUNT FROM BORROW

SELECT CUSTOMERS where city='ANDHERI'

select ACTNO,AMOUNT from deposit where ACTNO =106

select cname from borrow where amount > 5000

select CNAME from deposit where ADATE > '12-1-95'

select CNAME from deposit where actno < 105

select CNAME from CUSTOMERS where city in ('NAGPUR','DELHI') 

select CNAME from deposit where AMOUNT >4000 and ACTNO < 105 

select * from borrow where amount >= 4000 and amount < =8000 

select * from deposit where BNAME != 'ANDHERI'

select ACTNO,CNAME,AMOUNT from deposit where BNAME in ('ajani','KAROLBAGH','M.G.ROAD') and ACTNO > 104

SELECT TOP 5 CNAME,CITY FROM CUSTOMERS.

SELECT TOP 3 *FROM deposit WHERE AMOUNT > 1000 

SELECT TOP 5 loanno,cname from borrow where BNAME != 'ANDHERI'

select distinct city from customers
select distinct BNAME from branch

select * from customers order by CNAME
select * from deposit order by AMOUNT desc

update deposit set AMOUNT =5000 where amount =3000
update borrow set bname='C.G.Road' where cname = 'anil'
update deposit set actno = 111,amount = 5000 where cname = 'sandip'
update borrow  set AMOUNT = AMOUNT + (AMOUNT*10/100)
update deposit set amount = 5000 where actno between 103 and 107 
update borrow set amount = null where loanno=321 
select *from borrow where amount = null
















































