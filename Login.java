create database prakashraji;
use Prakashraji;
create table login
(username varchar(20),password varchar(20));
insert login values("prakash","282003");
create table Products(productId int,productName varchar(20),minsellquantity int,price int,quantity int);
insert into products values(1,'books',12,300,50);
select *from Products;
select *from login;