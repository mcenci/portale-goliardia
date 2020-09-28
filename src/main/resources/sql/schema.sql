DROP TABLE IF EXISTS users;

create table users(
	id int auto_increment primary key,
	username varchar(255) not null,
	password varchar(255) not null,
	enabled boolean not null
);

DROP TABLE IF EXISTS authorities;

create table authorities (
	userId int not null,
	authority varchar(50) not null,
	constraint fk_authorities_users foreign key(userId) references users(id) on delete cascade
);
create unique index ix_auth_username on authorities (userId,authority);