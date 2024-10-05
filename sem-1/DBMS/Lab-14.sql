create table Products(
		productid int primary key,
		productname varchar(50) not null,
		price decimal(10,2) not null
)

insert into Products values 
(1 , 'smartphone',35000),
(2 , 'laptop',65000),
(3 , 'headphones',5500),
(4 , 'television',85000),
(5 , 'gameing console',32000)


--1

declare @productid int
declare @productname varchar(50)
declare @price decimal(10,2)

declare product_cursor cursor for
select * from Products

open product_cursor;
fetch next from product_cursor into @productid ,@productname, @price;
while @@FETCH_STATUS = 0
begin
	print 'Product Id : '+convert(varchar, @productid )
	print 'Product Name : '+convert(varchar, @productname)
	print 'Product Price : '+convert(varchar,@price)
	
	fetch next from product_cursor into @productid ,@productname, @price
end

close product_cursor
deallocate product_cursor


--2
declare @productid2 int
declare @productname2 varchar(50)

declare product_cursor_fetch cursor for
select productid,productname from Products

open product_cursor_fetch
	fetch next from product_cursor_fetch into @productid2,@productname2
while @@FETCH_STATUS = 0
begin
	print 'ProductId-ProductName :  ' + convert(varchar , @productid2) +convert(varchar ,'_') + convert(varchar ,@productname2)
	fetch next from product_cursor_fetch into @productid2,@productname2
end
close product_cursor_fetch
deallocate product_cursor_fetch







