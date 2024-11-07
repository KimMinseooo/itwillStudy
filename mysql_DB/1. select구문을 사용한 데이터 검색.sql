-- [SQL문법] 1. select구문을 사용한 데이터 검색 
-- DB 선택
use hr;

-- DB 내 테이블 리스트 조회
show tables;

-- 테이블 구조 조회하기 
-- [문법] desc[ribe] 테이블명;
describe employees;
desc departments;
desc locations;

-- 테이블로부터 데이터 조회하는 구문
-- [문법] select * | 컬럼1, 컬럼2, 컬럼3
-- 		 from 테이블명;
-- 모든 컬럼 출력하기 
select * 
from employees;

select *
from departments;

-- 특정 컬럼 출력하기 
select employee_id, email, last_name
from employees;

select department_id, department_name
from departments;
-- select구문에 산술식이 포함된 예제
-- 산술식 : 산술연산자를 사용한 계산식
-- 산술연산자 : * / + - 
-- 산술연산자 우선순위 : * , / (높) >> + , - (낮)
select last_name , salary, 12*salary+100
from employees;

select last_name , salary, 12*(salary+100)
from employees;

