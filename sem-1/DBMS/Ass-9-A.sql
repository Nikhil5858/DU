create table city (
	cityid int primary key,
	name varchar(50) unique,
	pincode int NOT NULL,
	remarks varchar(50)
)

create table village(
	vid int primary key,
	name varchar(50) NOT NULL,
	cityid int foreign key 
	REFERENCES city(cityid) 
)

insert into city values (1,'rajkot',360005,'good'),
(2,'surat',335009,'very good'),
(3,'baroda',390001,'awesome'),
(4,'jamnagar',361003,'smart'),
(5,'junagadh',362229,'historic'),
(6,'morbi',363641,'ceramic')

insert into village values (101,'raiya',1),
(102,'Madhapar',1),
(103,'Dodka',3),
(104,'Falla',4),
(105,'Bhesan',5),
(106,'Dhoraji',5)


select v.name 
from village v
inner join city c
on c.cityid = v.cityid
where c.name='rajkot'

select c.name,c.pincode,v.name  as VillageName
from city c
inner join village v
on c.cityid = v.cityid

select c.name,count(v.name)
from city as c
inner join village as v
on c.cityid = v.cityid
group by c.name
having count (v.vid)>1

select name from city where cityid not in (select cityid from village)






