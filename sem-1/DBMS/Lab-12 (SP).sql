create table department(
	departmentid int primary key,
	departmentname varchar(100) not null unique
)

create table designation(
	designationid int primary key,
	designationname varchar(100) not null unique
)

create table person(
	workerid int primary key,
	firstname varchar(50) not null,
	lastname varchar(50) not null,
	salary decimal(8,2) not null,
	joiningdate date not null,
	departmentid int foreign key references department(departmentid),
    designationid int foreign key references designation(designationid)
)

insert into department values (1,'admin'),(2,'it'),(3,'hr'),(4,'account')

insert into designation values (11,'jobber'),(12,'welder'),(13,'clerk'),(14,'manager'),(15,'ceo')

insert into person values
(101, 'Rahul', 'Anshu' ,56000, '01-jan-1990', 1, 12),
(102, 'Hardik', 'Hinsu' ,18000, '25-sep-1990', 2, 11),
(103, 'Bhavin', 'Kamani' ,25000, '14-may-1991', NULL, 11),
(104, 'Bhoomi', 'Patel' ,39000, '20-feb-2014', 1, 13),
(105, 'Rohit', 'Rajgor' ,17000, '23-jul-1990', 2, 15),
(106, 'Priya', 'Mehta' ,25000, '18-oct-1990', 2, NULL),
(107, 'Neha', 'Trivedi' ,18000, '20-feb-2014', 3, 15)


-----------------------1
 
--department insert 
 create procedure sp_insert_department
 @did int,
 @dname varchar(50)
 as 
 begin
	insert into department values (@did,@dname)
 end
 exec sp_insert_department 5,'education'

 select * from department

 -- department update 
 create procedure sp_update_department
 @did int,
 @dname varchar(50)
 as 
 begin
	update department set departmentname = @dname where departmentid= @did 
 end
 exec sp_update_department 5,'abc'

 select * from department

 -- department delete 
 create procedure sp_delete_department
 @did int
 as 
 begin
	delete from department where departmentid = @did
 end
 exec sp_delete_department 5

 select * from department



 --designation

 --designation insert 
create procedure sp_insert_designation
@deid int,
@dename varchar(50)
as
begin
	insert into designation values (@deid,@dename)
end
exec sp_insert_designation 6,'anyone' 
select * from designation

 -- designation update 
 create procedure sp_update_designation
 @deid int,
 @dename varchar(50)
 as 
 begin
	update designation set designationname = @dename where designationid= @deid 
 end
 exec sp_update_designation 6,'abc'

 select * from designation

 -- designation delete 
 create procedure sp_delete_designation
 @deid int
 as 
 begin
	delete from designation where designationid = @deid
 end
 exec sp_delete_designation 12

 select * from department

  

 --Person

 --person insert 
create procedure sp_insert_person
@wid int,
@fname varchar(50),
@lname varchar(50),
@salary decimal(8,2),
@joindate date,
@departid int,
@designaid int
as
begin
	insert into person values (@wid,@fname ,@lname ,@salary,@joindate,@departid,@designaid)
end
exec sp_insert_person 108,'abc','xyz',90000,'01-jan-2000',1,15 
select * from person

 -- person update 
create procedure sp_update_person
@wid int,
@fname varchar(50),
@lname varchar(50),
@salary decimal(8,2),
@joindate date,
@departid int,
@designaid int
 as 
 begin
	update person set workerid =@wid ,firstname = @fname ,lastname = @lname ,salary = @salary ,joiningdate = @joindate ,departmentid = @departid ,designationid = @designaid
 where workerid= @wid 
 end
 exec sp_update_person 106,'pqr','klm',12345,'1-feb-2023',2,14

 select * from person 

 -- person delete 
 create procedure sp_delete_person
 @wid int
 as 
 begin
	delete from person where workerid = @wid
 end
 exec sp_delete_person 103

 select * from person


 ------------2

 --department
create procedure sp_select_department
@did int
as 
begin
	select * from department where departmentid = @did
end
exec sp_select_department 4

--designation
create procedure sp_select_designation
@deid int
as 
begin
	select * from designation where designationid = @deid
end
exec sp_select_designation 14

--person
create procedure sp_select_person
@personid int
as
begin
	select * from person where workerid=@personid
end
exec sp_select_person 102

---------------3

create procedure sp_selectjoin_person
as 
begin
	select p.workerid,p.firstname,p.lastname,p.salary,p.joiningdate,d.departmentname,de.designationname
	from person p
	left join department as d on p.departmentid = d.departmentid
	left join designation as de on p.designationid = de.designationid
end
exec sp_selectjoin_person


create procedure sp_selectjoin_personwiithdepartment
@did int
as 
begin
	select p.workerid,p.firstname,p.lastname,p.salary,p.joiningdate,d.departmentname,de.designationname	
	from person p
	inner join department as d on p.departmentid = d.departmentid
	left join designation as de on p.designationid = de.designationid
	where p.departmentid = @did
end
exec sp_selectjoin_personwiithdepartment 1


create procedure sp_selectjoin_personwiithdesignation
@deid int
as 
begin
	select p.workerid,p.firstname,p.lastname,p.salary,p.joiningdate,d.departmentname,de.designationname	
	from person p
	left join department as d on p.departmentid = d.departmentid
	inner join designation as de on p.designationid = de.designationid
	where p.designationid = @deid
end
exec sp_selectjoin_personwiithdesignation 15



---4
create procedure sp_showperson3_select
as
begin
	SELECT *
	FROM (SELECT *, ROW_NUMBER() OVER (ORDER BY workerid) AS row_num
	FROM person
	) AS subquery
	WHERE row_num <= 3
end
exec sp_showperson3_select

