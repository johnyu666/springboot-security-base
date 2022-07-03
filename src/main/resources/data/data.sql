
insert into authorities (authority) values ("teacher");
insert into authorities (authority) values ("student");
insert into authorities (authority) values ("guest");

insert into users(username,password) values ("john","123");
insert into users(username,password) values ("tom","123");
insert into users(username,password) values ("tomson","123");
insert into users(username,password) values ("alice","123");

insert into user_auth (user_id,auth_id) values (1,1);
insert into user_auth (user_id,auth_id) values (2,1);
insert into user_auth (user_id,auth_id) values (2,2);
insert into user_auth (user_id,auth_id) values (3,2);
insert into user_auth (user_id,auth_id) values (4,3);

-- 查询出所用户的权限
select username,password,authority from users u left join user_auth ua on u.id=ua.user_id left join authorities a on a.id=ua.auth_id
