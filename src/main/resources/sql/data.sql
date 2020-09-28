insert into users(username, password, enabled) values ('michele','$2a$10$1lnXsehCQkt64GpdZJ9KTeQnLuJR65CoW2X6P4qWZgL61TcVL998.', true);

insert into authorities(userId, authority) values (1, 'read');
insert into authorities(userId, authority) values (1, 'write');
commit;
