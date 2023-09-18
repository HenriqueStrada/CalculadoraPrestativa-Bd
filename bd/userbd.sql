create database userdb;
use userbd;

create table user(
id bigint auto_increment primary key,
username varchar(100) not null,
password varchar (100) not null
);

select * from user;