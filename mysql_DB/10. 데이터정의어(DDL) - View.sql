-- [SQL문법] 10. 데이터정의어(DDL) - View
use hr;

-- Table(테이블) : DB 내 Data를 저장하기 위한 객체
-- 사용방법 : select , insert, update , delete 
-- 정의방법 : create table, alter table, drop table, truncate table

-- View(뷰) : DB 내 Data를 논리적으로 저장하기 위한 객체
-- 사용방법 : select , insert, update, delete 
-- 정의방법 : create view, alter view , drop view

-- View(뷰)란?
-- 하나이상의 테이블을 기반으로 생성은 되었으나 물리적으로 존재하지 않고
-- DB 사전에 select 구문 형태로 정의만 되어 있는 가상의 논리적인 테이블
-- 뷰 사용 목적 : 보안성, 공간효율성, 편의성

-- 10-1. 뷰 생성(create view)
-- [문법] create view 뷰명
-- 		 as select 컬럼1, 컬럼2, 컬럼3, ...
-- 			from 테이블명
-- 			[where 조건문];

create view empvu80
as select employee_id, last_name, salary , department_id
	 from employees
    where department_id = 80;
    
desc empvu80;

select *
from empvu80;