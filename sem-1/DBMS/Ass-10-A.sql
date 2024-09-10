create table department(
	did int,
	dname varchar(50)
)

create table academic(
	rno int,
	spi decimal(3,2),
	bklog int
)

create table student(
	rno int,
	name varchar(50),
	city varchar(50),
	did int, 
	foreign key (did) references department(did)
)