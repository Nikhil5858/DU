create table student (
	RollNo int primary key,
	Name varchar(50),
	BirthDate datetime,
	SPI int,
	City varchar(50),
	Backlog int,
	Branch varchar(50)
)

insert into student values (101,'Keyur','05-jan-1992',8.5,'Rajkot',2,'CE')
insert into student values (102,'Hardik','15-feb-1994',9.0,'Ahmedabad',0,'CE')
insert into student values (103,'Kajal','14-mar-1996',10.0,'Baroda',0,'IT')
insert into student values (104,'Bhoomi','23-jun-1995',8.90,'Ahmedabad',1,'ICT')
insert into student values (105,'Harmit','15-feb-1994',9.80,'Rajkot',1,'IT')
insert into student values (106,'Jay','15-feb-1994',7.9,'Rajkot',2,'CE')

select RollNo,Name from student where RollNo > 103 and Backlog > 0 and (Branch = 'CE' or Branch = 'IT')
select Name from student where SPI between 8 and 9 and (Branch = 'CE' or Branch = 'IT')
select * from student where branch != 'CE'
select top 3 RollNo, Name From student ORDER BY RollNo
select top 3 * From student where SPI > 8.5
SELECT DISTINCT City from student 
SELECT DISTINCT Branch from student 
select * from student order by Backlog desc, spi asc
update student set Branch = 'MCA' , City = 'jamnagar' where RollNo = 106  
update student set Backlog = null where Name in('Keyur','Bhoomi')
select name from student where (Backlog > 1 or Backlog is null) and branch in('CE','IT')	




















