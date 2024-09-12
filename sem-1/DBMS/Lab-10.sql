create table department(
	did int primary key,
	dname varchar(50)
)

create table student(
	rno int primary key,
	name varchar(50),
	city varchar(50),
	did int, 
	foreign key (did) references department(did)
)

create table academic(
	rno int,
	spi decimal(3,2),
	bklog int
	foreign key (rno) references student(rno)
)

insert into department values(10,'computer'),(20,'electrical'),(30,'mechnical'),(40,'civil')

insert into student values 
(101,'raju','rajkot',10),
(102,'Amit','Ahmedabad',20),
(103,'Sanjay','Baroda',40),
(104,'Neha','Rajkot',20),
(105,'Meera','Ahmedabad',30),
(106,'Mahesh','Baroda',10)
 
insert into academic values(101,8.8,0),(102,9.2,2),(103,7.6,1),(104,8.2,4),(105,7.0,2),(106,8.9,3)

--1
select name from student where did in(select did from department where dname='computer')
--2
select name from student where rno in(select rno from academic where spi>8)
--3
select name from student where city = 'rajkot'and did in(select did from department where dname='computer')
--4
select COUNT(name) from student where did in (select did from department where dname = 'electrical') 
--5
select name from student where rno in (select rno from academic where spi in (select max(spi) from academic))
--6
select name from student where rno in (select rno from academic where bklog > 1)
--8
select name from student where did in(select did from department where dname = 'computer'or dname='mechnical')
--9
select name from student where did in(select did from department where dname='electrical')
--10
select name from student where did in
(select did from department where dname = 'electrical') and rno=(select rno from student where spi>9)




