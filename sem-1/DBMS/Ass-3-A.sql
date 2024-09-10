create table studentA (
	stuid int primary key,
	firstname varchar(50),
	lastname varchar(50),
	website varchar(50),
	city varchar(50),
	division varchar(50)
)

insert into studentA values (1011,'keyur','patel','techonthenet.com','rajkot','II-BCX'),
(1022,'hardik','Shah','digminecraft.com.com','Ahmedabad','I-BCY'),
(1033,'kajal','Trivedi','bigactivities.com.com','Baroda','IV-DCX'),
(1044,'bhoomi','Gajera','checkyourmath.com.com','Ahmedabad','III-DCW'),
(1055,'harmit','Mitel','null','Rajkot','II-BCY'),
(1066,'ashok','Jani','null','Baroda','II-BCZ')

select firstname from studentA where firstname like 'k%'

select firstname from studentA where firstname like '_____'

select firstname ,lastname from studentA where city like '_____a'

select * from studentA where lastname like '%tel'

select firstname from studentA where firstname like 'ha%t'

select firstname from studentA where firstname like 'k_y%'

select firstname from studentA where firstname like '_____' and website = 'NULL'

select * from studentA where lastname like '%jer'

select * from studentA where city like 'r%' or 'b%'

select * from studentA where website != 'NULL'

select * from studentA where firstname like '[A-h]%'

select * from studentA where SUBSTRING(firstname,2,1) in ('A', 'E', 'I', 'O', 'U', 'a', 'e', 'i', 'o', 'u')

select * from studentA where city like '%rod%'

select firstname,lastname,website from studentA where website like 'bi%'

select city from studentA where len(lastname) = 6

select * from studentA where len(city) = 5 and city not like 'ba%';

select * from studentA where division like 'II%'

select firstname,division  from studentA where division like '%bc%'

select stuid,city,firstname from studentA where len(division) = 6 and website != 'null' 

select * from studentA where SUBSTRING(firstname,3,1) not in ('A', 'E', 'I', 'O', 'U', 'a', 'e', 'i', 'o', 'u')














