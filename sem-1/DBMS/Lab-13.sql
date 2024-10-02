create table person(
	personid int primary key,
	personname varchar(50) not null,
	salary decimal(8,2) not null,
	joiningdate date not null,
	city varchar(50) not null,
	age int not null,
	birthdate date not null
)

create table personlog(
	plogid int primary key,
	personid int not null,
	personname varchar(50) not null,
	operation varchar(50) not null,
	updatedate date not null
)

----1
CREATE TRIGGER person_trigger
on person
after insert,update,delete
as
begin
	print 'Record is Affected'
end

insert into person values (01,'abc',1000,'01-jan-2000','tokyo',21,'01-jan-1995')
insert into person values (02,'xyz',2000,'02-feb-2001','fuji',22,'02-feb-1995')
update person set personid=11,personname='ac',salary=2000,joiningdate='02-jan-2000',city='knal',age=26,birthdate='05-feb-1995' where personid=01
delete from person where personid=01
