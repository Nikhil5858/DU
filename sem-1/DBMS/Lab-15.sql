--1
create function helloword()
returns varchar(50)
as
begin
	return 'Hello Word!'
end

select dbo.helloword()

--2
create function addition(@num1 int,@num2 int)
returns int
as
begin
	return (@num1+@num2)
end

select dbo.addition(10,10)

--3
create function cubenumber(@num int)
returns int
as 
begin
	return (@num * @num * @num)
end
select dbo.cubenumber(2)

--4
alter function oddeven(@num int)
returns varchar(20)
as 
begin
declare @num2 varchar(200)
if(@num%2 like 0)
	set @num2 = 'Even'
else
	set @num2 = 'Odd'	

	return @num2
end
select dbo.oddeven(10)


--5
create function getpersondata()
returns Table
as
	return (select * from person where fname like 'B%')

select * from getpersondata()

--6
create function getpersonuniquedata()
returns Table
as
	return (select distinct fname from person)

select * from getpersonuniquedata()


----------B-----------


--1
create function compareInt(@num1 int,@num2 int)
returns varchar(50)
as
begin
declare @result varchar(50)=
	case
		when @num1 > @num2 then  'Num 1 Is Big'
		when @num2 > @num1 then  'Num 2 Is Big'
		else 'Number is Equal'
	end
	return @result
end

select dbo.compareInt(100,100)

