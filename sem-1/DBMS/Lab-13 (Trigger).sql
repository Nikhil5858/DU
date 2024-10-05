create table person(
	personid int primary key,
	personname varchar(50) not null,
	salary decimal(8,2) not null,
	joiningdate date not null,
	city varchar(50) not null,
	age int not null,
	birthdate date not null
)

Create Table PersonLog
(
	PLogID Int Primary Key identity(1,1),
	PersonID Int Not Null,
	PersonName Varchar(250) Not Null,
	Operation Varchar(50) Not Null,
	UpdateDate Datetime Not Null
)


INSERT INTO Person VALUES(4,'Deep',10000,'1-1-22','RAJKOT',21,'1-1-2000')
INSERT INTO Person VALUES(5,'Meet',10000,'1-1-22','RAJKOT',23,'1-1-2002')
INSERT INTO Person VALUES(6,'Jay',10000,'1-1-22','RAJKOT',23,'1-1-1999')


----1
create trigger tr_dis_msg
on person
after insert,update,delete
as
begin
	print 'Record Inserted'
end


--2
--insert
CREATE TRIGGER tr_Ins_re_insert
ON Person
AFTER INSERT
AS
BEGIN
    INSERT INTO PersonLog (PersonID, PersonName, Operation, UpdateDate)
    SELECT PersonID, PersonName, 'Inserted', GETDATE()
    FROM inserted
END

insert into Person values (110,'awskjdha',10000,'10-jan-2004','rajkot',20,'16-feb-2001')
insert into Person values (111,'dwd',20000,'11-feb-2006','jamnagar',21,'19-jan-2005')

select * from PersonLog


--update
CREATE TRIGGER tr_Ins_re_update
ON Person
AFTER UPDATE
AS
BEGIN
    INSERT INTO PersonLog (PersonID, PersonName, Operation, UpdateDate)
    SELECT PersonID, PersonName, 'Updated', GETDATE()
    FROM inserted
END

update Person set city='vadodara',personname='hflkjashfd' where personid = 101

select * from PersonLog


--delete

CREATE TRIGGER tr_Ins_re_delete
ON Person
AFTER DELETE
AS
BEGIN
    INSERT INTO PersonLog (PersonID, PersonName, Operation, UpdateDate)    
    SELECT PersonID, PersonName, 'deleted', GETDATE()
    FROM deleted
END

delete from Person where personid=110

select * from PersonLog


----------------- B - 2

create TRIGGER tr_B2_upercase
ON person
instead of insert
as
begin
	insert into personlog (PersonID, PersonName, Operation, UpdateDate)
	select personID , UPPER(PersonName),'INSERTED',GETDATE()
	from inserted
end

insert into Person values (232,'xyz',20155,'19-jan-2004','rajkot',55,'21-feb-2003')

select * from personlog

