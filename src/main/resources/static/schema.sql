create table users(user_id varchar(20) primary key,name varchar(20),email varchar(30),mob_no varchar(10),password varchar(20),time_date date);


create table groups(group_id varchar(20) primary key,group_name varchar(30),created_by varchar(20),date_time date);


 create table userGroup(userGroup_id int primary key,user_id varchar(20),foreign key(user_id)references users(user_id)on delete cascade on update cascade,group_id varchar(20),foreign key(group_id) references groups(group_id)on delete cascade on update cascade,date_time date,admin boolean);


create table message(message_no int primary key,sender_id varchar(20),receiver_id varchar(20),messages text,type char check(type='G' or type='S'),date_time date);

