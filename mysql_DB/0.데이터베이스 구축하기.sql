select version();

show databases;

create schema shopdb;
use shopdb;
create table members
( member_id int primary key,
  member_name varchar(8) not null,
  birth date not null, 
  job varchar(20),
  phone varchar(20) unique,
  address varchar(80) );
  
  desc members;
  
  create table products
      ( prod_id int primary key,
  prod_name varchar(20) not null,
  price int check (price > 0),
  make_date date,
  company varchar(10) not null );
  
  desc products;
  
  select now() from dual;
  
   create table orders
     ( order_num int,
 member_id int,
 prod_id int,
 order_date datetime default now(),
 primary key(order_num),
 foreign key(member_id) references members(member_id),
 foreign key(prod_id) references products(prod_id) );
 
 desc orders;
 
 create table stu20
     (stu_id int auto_increment primary key,
      stu_name varchar(5) not null,
      age int check (age > 19));
      
desc stu20;

 insert into members
      values (100, '홍길동', '1991-12-30', '학생', '010-1111-1111', '부산 부산진구 부전동');
      
insert into members(member_id, member_name, birth, phone)
      values (101, '김민수', '1990-03-05', '010-2222-2222');
      
insert into members(member_id, member_name, phone, address)
      values (102, '최아영', '010-3333-3333', '서울 강남구 선릉로');
 insert into members(member_id, member_name, birth, phone, address)
      values (102, '최아영', '1987-11-23', '010-3333-3333', '서울 강남구 선릉로');

 insert into members(member_id, member_name, birth, job, phone)
      values (103, '홍길동', '1988-05-10', '회사원', '010-4444-4444');
      
 insert into members(member_id, member_name, birth, job)
      values (104, '강주영', '1998-08-09', '대학생');
      
 insert into members(member_id, member_name, birth, job, phone, address)
      values (105, '고승현', '1995-07-10', '트레이너', '010-5555-5555', '경기도 부천시 원미구');
      
insert into members(member_id,member_name,birth,job,phone)
	values (106,'정유빈','1970-02-04','회사원','010-6666-6666');

insert into members(member_id,member_name,birth,phone)
	values (107,'이영수','1988-12-06','010-7777-7777');
    
insert into members(member_id,member_name,birth,phone,address)
	values (108,'김철수','1999-01-15','010-8888-8888','부산 해운대구 센텀로');
    
insert into members values(109,'최승현','1995-04-22','간호사','010-9999-9999','서울 강북고 수유동');
insert into members values(110,'한주연','2001-08-24','승무원','010-1010-1010','대구 수성구 수성로');

desc products;
insert into products values (10,'냉장고',500,null,'삼성');

insert into products 
values (20,'컴퓨터',150,'2022-01-13','애플'),
		(30,'세탁기',250,'2020-03-10','LG'),
        (40,'TV',200,'2021-09-30','LG'),
        (50,'전자렌지',50,'2019-06-20','삼성'),
        (60,'건조기',300,'2021-07-09','LG');
        
select * from products;

desc orders;
insert into orders 
values (1, 101, 20, '2022-02-01');

select * from orders;

insert into orders
values (2, 107, 40, '2022-02-05 17:51');

select * from orders;

-- now()함수를 활용한 데이터 삽입
insert into orders
values ( 3,106,50,now());
-- insert 시 default값이 선언된 컬럼 생략하면 자동으로 default값 삽입됨.
insert into orders(order_num,member_id,prod_id)
values(4,103,10);

-- insert 시 default 값을 수동으로 삽입하는 방법 
insert into orders
values (5,108,50,default);

insert into orders 
values (6,103,30,default);

insert into orders
values (7,105,60,default);

-- 추가 데이터 삽입하기 
insert into orders
values  (8,110,40,'2021-12-30 10:30:45'),
		(9,107,30,default),
		(10,101,60,now());

-- 4) stu20 테이블에 데이터 삽입 
desc stu20;

-- auto_increment 속성이 선언된 컬럼에 자동으로 데이터 삽입 
-- auto_increment 속성은 1부터 시작해서 1씩 증가하는 값 반환이 기본임.
insert into stu20
values (null,'김온달',28);

insert into stu20
values (null ,'이평강',24);

-- 시작값 변경
alter table stu20 auto_increment = 100;

insert into stu20 
values (null,'최찬미',29);

insert into stu20
values (null, '김동희',31);

-- 증가값(증가 사이즈) 변경
set @@auto_increment_increment =5;

insert into stu20
values (null ,'박혜경',22);

insert into stu20
values (null ,'문진원',27);

-- (2) 데이터 수정(update)
-- [문법] update 테이블명
-- 		 set 컬럼명 = 값
-- 		 where 조건문;

-- products 테이블의 모든 상품의 가격을 50씩 인상하시오.
update products 
set price =price + 50;

-- products 테이블의 TV 상품 가격을 30 인상하시오.
update products 
set price = price +30 
where prod_name ='TV';

update products
set prod_name ='냉장고'
where prod_id = 10;

-- members 테이블의 105번 회원 전화번호를 010-5050-5050으로 변경하시오.
update members
set phone ='010-5050-5050'
where member_id =105;

update orders
set member_id =109
where order_num= 2;

-- (3) 데이터 삭제(delete) 
-- [문법] delete from 테이블명
-- 		 [where 조건문];

-- null 값으로 변경하는 방법 
update members
set job = null
where  member_id =104;

-- stu20 테이블에서 나이가 25세 이하인 학생을 삭제하시오 .
delete from stu20
where age<=25;

-- stu20 테이블에서 모든 학생을 삭제하시오.(모든 행 삭제) 
delete from stu20;

-- 4. 데이터 조회(select) 
-- [문법] select * | 컬럼1, 컬럼2, 컬럼3 
-- 		 from 테이블명
-- 		 [where 조건문]
-- 		 [orderby 컬럼명 desc (내림차순) | asc (오름차순 , 기본값)];

select * 
from products;

select * 
from stu20;

select * 
from orders;

select * 
from members;

select member_id , member_name, birth
from members;

select prod_name, price,company, make_date
from products;

-- 테이블로부터 특정 행 조회하기
-- [문법] select * | 컬럼1 , 컬럼2, 컬럼3
-- 		 from 테이블명
-- 	 	 where 좌변 		= 		우변;
-- 			  (컬럼명)(비교연산자)(값) -> 숫자 ,'문자','날짜'

--  비교연산자 종류 : =, >, >=, <, <=, <>, !=

-- members 테이블에서 member_id가 105번인 회원 정보를 출력하시오.
select *
from members
where member_id =105;

-- members 테이블에서 이름이 '홍길동'인 회원 정보를 출력하시오 .
select *
from members
where member_name = '홍길동';

-- members 테이블에서 '회사원'이 아닌 회원 정보만 출력하시오.
select *
from members
where job <> '회사원';

-- products 테이블에서 가격이 300 이상인 제품의 이름과 가격을 조회하시오.
select prod_name, price
from products
where price >=300;

-- members 테이블에서 생년월일이 1990년 이전인 회원의 이름, 생년월일, 전화번호를 조회하시오.
select member_name,birth,phone
from members
where birth < '1990-01-01';

-- where절에 여러 조건문 작성하는 방법 
-- where절에 여러 개의 조건문 작성 시 and ,or로 나열함.
select prod_name, price
from products
where price >=300
and   price <=500;

select * 
from members
where birth <'1990-01-01'
or	  birth >'1991-12-31';

select *
from products
where company = 'LG'
and price <= 300;

-- where절에 and와 or가 함께 사용된 경우
-- 우선순위 : and(높) >> or(낮)

select *
from products
where company = 'LG'
or 	  company = '삼성'
and   price <= 300;

-- 우선순위를 지정 할 경우에는 괄호 사용해야함 . 
select *
from products
where (company = 'LG'
or 	  company = '삼성')
and   price <= 300;

select * 
from products
order by company, price desc;

