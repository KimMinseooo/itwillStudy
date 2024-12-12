use hr;
-- [테이블 생성]
-- 1 
create table MEMBER 
	(MEMBER_ID int primary key,
     LAST_NAME varchar(25) not null,
     FIRST_NAME varchar(25),
     ADDRESS varchar(100),
     CITY varchar(30),
     PHONE varchar(15),
     JOIN_DATE datetime not null default now());
     
-- 2
create table title 
	(TITLE_ID int primary key,
     TITLE varchar(60) not null,
     DESCRIPTION varchar(400) not null,
     RATING varchar(4) check (RATING in("G","PG","R","NC17","NR")),
     CATEGORY varchar(20) check(CATEGORY in("DRAMA","COMEDY","ACTION","CHILD","SCIFI","DOCUMENTARY")),
     RELEASE_DATE date);
     
desc title;

-- 3 
create table title_copy 
	(copy_id int,
     title_id int,
     status varchar(15) not null check(status in("AVAILABLE","DESTROYED","RENTED","RESERVED")),
	 primary key(copy_id,title_id),
     foreign key(title_id) references title(title_id));

-- 4
create table rental 
	(book_date datetime default now(),
     member_id int,
     copy_id int,
     act_ret_date date,
     exp_ret_date date,
     title_id int,
     primary key(book_date,member_id,copy_id,title_id),
     foreign key(member_id) references member(member_id),
     foreign key(copy_id,title_id) references title_copy(copy_id,title_id));
     
desc rental;

-- 5
create table reservation 
		(res_date date,
         member_id int,
         title_id int,
         primary key(res_date,member_id,title_id),
         foreign key(member_id) references member(member_id),
         foreign key(title_id) references title(title_id));
         
desc reservation;










