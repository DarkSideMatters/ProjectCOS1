# ProjectCOS1

drop table buildings;
drop table customers;
CREATE TABLE buildings(
cid integer,
bid integer,
cname varchar(30),
address varchar(30),
parcelno integer,
size integer,
primary key (bid));

CREATE TABLE customers(
cid integer,
cname varchar(30),
mail varchar(30),
telephone varchar(30),
address varchar(30),
primary key (cid));
