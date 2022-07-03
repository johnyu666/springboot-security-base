drop table if exists users;
drop table if exists authorities;
drop table if exists user_auth;
create table users (id int auto_increment primary key ,username varchar(255),password varchar(255));
create table authorities (id int auto_increment primary key ,authority varchar(32));
create table user_auth (user_id int,auth_id int );

