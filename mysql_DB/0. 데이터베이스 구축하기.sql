-- [데이터베이스 구축] 
-- 1. 데이터베이스 생성
-- 2. 테이블 생성
-- 3. 데이터 삽입/수정/삭제
-- 4. 데이터 조회 

-- 1. 데이터베이스 생성 
--  DB 생성하기 
create schema shopdb;
-- db 목록 확인하기
show databases;

-- DB 선택하기 
use shopdb;

--  2. 테이블 생성
--  [문법] create table 테이블명		
-- 		(컬럼명1 데이터타입(컬럼사이즈),
-- 		 컬럼명2 데이터타입(컬럼사이즈) [defalut 기본값] ,
--       컬럼명3 데이터타입(컬럼사이즈) [제약조건],
-- 		 컬럼명n 데이터타입(컬럼사이즈));
												
-- 데이터타입 
-- 숫자  - 정수형 : smallint, int, bigint
--     - 실수형 : float , double
-- 문자 - 고정형 : char  공간효율down 성능 up
--     - 가변형 : varchar 공간효율up 성능 down 
-- 날짜 - 년/월/일 : date
--     - 년/월/일/시/분/초 : datetime
        
-- 제약조건 
-- 1) not null : 컬럼에 null값이 삽입/수정되는 것을 막아줌.
-- 	           	 필수 컬럼에 활용됨.
-- 2) unique : 컬럼에 중복값이 삽입/수정되는 것을 막아줌.
-- 				고유한 값만 들어와야 하는 컬럼에 활용됨.		
-- 3) primary key : not null + unique 의 성격을 가지는 제약조건 
-- 					테이블에 한번만 선언 가능함.
--  				테이블의 대표 컬럼역할을 한다. 
-- 4) foreign key : 다른 테이블의 특정 컬럼을 참조하는 제약조건 .
-- 					fk 제약조건때문에 테이블과 테이블이 연계되어서 운영됨 .
-- 5) check : 해당 컬럼이 만족해야하는 조건문을 자유롭게 지정하는 제약조건 

-- (1) members (회원) 테이블 생성

create table members 
	(member_id int primary key,
	 member_name varchar(8) not null ,
     birth date not null, 
     job varchar(20),
     phone varchar(20) unique ,
     address varchar(80));
     
     desc members;

create table products 
( prod_id int primary key , 
  prod_name varchar(20) not null, 
  price int check (price >20 ),
  make_date date , 
  company varchar(10) not null);
  
  desc products;  
  
-- now() 함수 : 데이터베이스의 현재 날짜/시간을 반환함.
select now();

create table orders 
 ( order_num int,
   member_id int , 
   prod_id int,
   order_date datetime default now(),
   primary key(order_num),
   foreign key(member_id) references members(member_id),
   foreign key(prod_id) references products(prod_id));
   
desc orders;

-- (4) auto_increment 속성을 포함한 stu20 테이블 생성 
-- auto_increment 속성이란 ? 
-- 테이블 생성 시 특정 컬럼에 auto_increment 속성을 부여한 경우 
-- 컬럼에 데이터 삽입 시 자동으로 1부터 시작해서 1씩 증가하는 값을 반환함. 
-- 시작값 , 증가값은 변경 가능함. 
-- 사용 가능한 컬럼의 조건 :1) 데이터 타입 : 숫자 형식 
-- 					 2) 제약조건 : pk 또는 uk  선언 컬럼
-- [문법] create table 테이블명
-- 		(컬럼명1 int auto_increment primary key,
-- 		컬럼명2 데이터타입(컬럼사이즈),
-- 		컬럼명3 데이터타입(컬럼사이즈));

create table stu20 
 ( stu_id int auto_increment primary key , 
   stu_name varchar(5) not null , 
   age int check (age >19));
   
desc stu20;

-- 3. 데이터 삽입/수정/삭제 
-- 데이터조작어(DML) : insert , update, delete
-- (1) 데이터 삽입 : insert 
-- [문법]  insert into 테이블명[(컬럼1, 컬럼2, 컬럼3, 컬럼n)]
-- 		  values (값1, 값2, 값3 ,값n);

-- 1) members 테이블에 데이터 삽입 
desc members;
-- 테이블명 뒤에 컬럼리스트 생략한 경우에는 values절 뒤에 기본 컬럼 순서대로 모든 값 작성해야함.
insert into members
values (100, '홍길동' ,'1991-12-30','학생','010-1111-1111','부산 부산진구 부전동');

-- 테이블명 뒤에 컬럼리스트 작성한 경우에는 values절 뒤 값리스트와 일치해야함.
-- 생략된 컬럼에는 자동으로 null값이 삽입됨. 
insert into members(member_id, member_name, birth, phone) 
values (101 , '김민수','1990-03-05','010-2222-2222');

insert into members(member_id,member_name,phone,address,birth)
values (102,'최아영','010-3333-3333','서울 강남구 선릉로','1987-11-23');

insert into members(member_id,member_name, birth,job,phone ) 
values (103,'홍길동','1988-05-10','회사원','010-4444-4444');

insert into members(member_id,member_name,birth,job) 
values (104,'강주영','1988-08-09','대학생');

insert into members(member_name,birth,job,phone,address,member_id)
values ('고승현','1995-07-10','트레이너','010-5555-5555','경기도 부천시 원미구',105);

-- 추가 데이터 삽입

insert into members(member_id,member_name,birth,job,phone)
values (106,'정유빈','1970-02-04','회사원','010-6666-6666');

insert into members(member_id,member_name,birth,phone)
values (107,'이영수','1988-12-06','010-7777-7777');

insert into members(member_id,member_name, birth , phone, address ) 
values ( 108 ,'김철수' ,'1999-01-15','010-8888-8888','부산 해운대구 센텀로');

insert into members(member_id,member_name,birth,job,phone, address) 
values (109,'최승현','1995-04-22','간호사','010-9999-9999','서울 강북고 수유동');

insert into members 
values (110, '한주연','2001-08-24','승무원','010-1010-1010','대구 수성구 수성로');

select * from members;





