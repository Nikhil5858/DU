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
--declare @productid int
--declare @productname varchar(50)
--declare @price decimal(10,2)

--declare cr_show_product cursor
--for
--select productid,productname,price from Products
--open cr_show_product
--fetch next from cr_show_product into @productid,@productname,@price
--while @@FETCH_STATUS = 0
--begin
	--print 'Product id : '+convert(varchar(50),@productid)
	--print 'Product Name : '+convert(varchar(50), @productname)
	--print 'Price : '+ convert(varchar(50),@price)

--	select  @productid,@productname,@price

--	fetch next from cr_show_product into @productid,@productname,@price
--end
--close cr_show_product
--deallocate cr_show_product


--2
/*declare @productid2 int
declare @productname2 varchar(50)
declare @price2 decimal(10,2)
declare cr_showall_product cursor
for
select productid,productname,price from Products
open cr_showall_product
fetch next from cr_showall_product into @productid2,@productname2,@price2
while @@FETCH_STATUS = 0
begin
	print 'Product Details :  '+convert(varchar(50),@productid2) + '_' + convert(varchar(50),@productname2)

	fetch next from cr_showall_product into @productid2,@productname2,@price2
end
close cr_showall_product
deallocate cr_showall_product */


--3

--declare @productid int
--declare cr_delete cursor
--for
--select productid from Products
--open cr_delete
--fetch next from cr_delete into @productid
--while @@FETCH_STATUS = 0
--begin
--	delete from Products where productid = @productid
--	fetch next from cr_delete into @productid
--end
--close cr_delete
--deallocate cr_delete

--4

declare @productid int
declare @productname varchar(50)
declare @price decimal(10,2)

declare cr_showandupdate_product cursor
for
select productid,productname,price from Products
open cr_showandupdate_product
fetch next from cr_showandupdate_product into @productid,@productname,@price
while @@FETCH_STATUS = 0
begin
	select @price = @price+(@price * 10)/100
	update Products set price = @price
	select  @productid,@productname,@price

	fetch next from cr_showandupdate_product into @productid,@productname,@price
end
close cr_showandupdate_product
deallocate cr_showandupdate_product


