SET GLOBAL time_zone = '+2:00';

CREATE DATABASE IF NOT EXISTS jree17_todo_list;

USE jree17_todo_list;

CREATE TABLE IF NOT EXISTS todos(
         id int not null auto_increment,
         description text not null,
         dueDate date not null,
         dueTime time not null,
         status varchar(10);
         createdAt timestamp default current_timestamp,
         updateAt timestamp default current_timestamp on update current_timestamp,
         primary key(id);
)