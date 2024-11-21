-- [SQL문법] 5-1. 단일행함수 - 문자함수 
use hr;

-- 함수란?
-- 인수를 받아서 정해진 조작을 한 후 반드시 하나의 값을 반환함.
-- SQL함수 유형 : 단일행 함수, 다중행 함수(=그룹함수)

-- 단일행 함수 
-- 행 당 하나의 결과값을 반환함.
-- 단일행함수 유형 : 문자함수, 숫자함수 , 날짜함수 ,
-- 				변환함수, 제어흐름함수, 시스템정보함수

-- 문자함수
-- ascii(문자) : 문자의 아스키코드값을 반환함.
-- char(숫자) : 숫자(아스키코드값)에 해당하는 문자를 반환함.
select ascii('A'), ascii('a'), char(66);

-- length : 문자열의 byte 수를 반환함.
-- bit_length : 문자열의 bit 수를 반환함.
-- char_length : 문자열의 문자의 개수를 반환함.
select employee_id, last_name, length(last_name) as "byte수",
	   bit_length(last_name) as "bit수",char_length(last_name) as "문자의 개수"
from employees;

select length("아이티윌"), bit_length("아이티윌"), char_length("아이티윌");
-- 한글은 한글자당 3byte

-- concat(인수1, 인수2 ,... ,인수n) : n개의 인수를 연결해서 반환함.
-- concat_ws(구분자 , 인수1,..., 인수n)
select employee_id, concat(first_name, last_name) as name, job_id, email
from employees;

select employee_id,
	   concat(last_name, job_id, email, salary, department_id) as emp_info
from employees;

select employee_id,
	   concat(last_name,'--', job_id,'--', email,'--', salary,'--', department_id) as emp_info
from employees;
-- (==)
select employee_id,
	   concat_ws("--",last_name,job_id,email,salary,department_id)
	   as emp_info
from employees;

-- instr(문자열, 특정문자) :문자열로부터 특정 문자의 첫번째 위치값을 반환함.
select employee_id, last_name, instr(last_name , 'B')
from employees;

-- upper(문자열) : 문자열을 대문자로 변환함.
-- lower(문자열) : 문자열을 소문자로 변환함.
select employee_id, upper(last_name) as name, lower(email) as email
from employees;

-- left(문자열, 숫자) : 문자열을 왼쪽에서부터 숫자만큼 반환함.
-- right(문자열, 숫자) : 문자열을 오른쪽에서부터 숫자만큼 반환함.
-- substr(문자열, 시작위치, 숫자) : 문자열을 시작위치부터 숫자만큼 반환함.
select left('itwill busan',6), right('itwill busan', 5),
	   substr('itwill busan' ,3,7);
       
select left('981223-1122334', 6) as "생년월일";

select employee_id, last_name,
	   left(last_name, 3), substr(last_name,1,3)
from employees;

select employee_id, job_id ,
	   right(job_id, 3), substr(job_id, -3 ,3)
from employees;

-- lpad(문자열, 전체자리수, 채울문자) : 문자열을 전체 자리수만큼 늘려서 출력하되 
-- 								  남는 공간이 있다면 채울 문자로 채워주는 함수
-- 								  오른쪽 정렬할때 주로 사용됨.
-- rpad(문자열, 전체자리수, 채울문자) : 문자열을 전체 자리수만큼 늘려서 출력하되
-- 								  남는 공간이 있다면 채울 문자로 채워주는 함수 
-- 								  왼쪽 정렬할떄 주로 사용됨.
select lpad("itwill", 10 ,"*") , rpad("itwill" ,10 ,"*");

select lpad(last_name , 20,'_') as "L-name" ,
	   rpad(last_name, 20 ,"_") as "R-name"
from employees;

-- ltrim(문자열) : 문자열의 왼쪽 공백을 제거함. 
-- rtrim(문자열) : 문자열의 오른쪽 공백을 제거함.
-- trim(문자열) : 문자열의 양쪽(앞/뒤) 공백을 제거함.
-- trim(방향 특정문자 from 문자열) : 방향 - leading(앞), trailing(뒤), both(양쪽)
-- 								 문자열로부터 특정문자가 해당 방향에 있으면 제거함.
select ltrim("        SQL 문법    "), rtrim("        SQL 문법    "),
	   trim("        SQL 문법    ");
select trim(both "_" from "___SQL_문법____"),trim(leading "_" from "___SQL_문법____"),
	   trim(trailing "_" from "___SQL_문법____");
       
-- replace(문자열, 특정문자, 다른문자) : 문자열에서 특정 문자를 다른 문자로 교체함 . 
select employee_id, last_name, email ,
	   replace(phone_number,".","-") as phone
from employees;

-- space(길이) :길이만큼의 공백을 반환함.
select concat("MYSQL" , "          ", "DBMS") as test1;
-- (==)
select concat("MYSQL" ,space(10), "DBMS") as test1;

-- <연습문제>
-- 1.employees 테이블로부터 사원들의 last_name과 last_name의 길이를 출력하되
--  last_name이 ‘J’, ‘A’, ‘M’으로 시작되는 사원만 출력하시오.
--  또한 last_name을 기준으로 오름차순 정렬해서 출력하시오.
select last_name as "Name" , length(last_name) as "Length"
from employees
where left(last_name, 1 ) in ("J","M","A")
order by last_name;
-- (==)
select last_name as "Name" , length(last_name) as "Length"
from employees
where substr(last_name,1,1) in ("J","M","A")
order by last_name;
-- (==)
select last_name as Name, length(last_name) as Length
from employees
where last_name like "J%" 
or last_name like "A%"
or last_name like "M%"
order by last_name;

-- 2. employees 테이블로부터 사원들의 last_name과 salary를 출력하되 
-- 특히 급여는 15자리로 표시하고 왼쪽부터 $ 기호가 채워지도록 지정하시오.
select last_name as LAST_NAME, lpad(salary,15,"$") as SALARY
from employees;

-- 3.  employees 테이블로부터 last_name과 급여 액수를 별표(*)로 나타내는 query를 작성하시오. 
-- 각 별표는 $1,000를 의미하며 백단위 이하는 표시하지 않습니다. 
-- 또한 급여의 내림차순으로 데이터를 정렬하여 출력하고 컬럼 제목(column alias)을
--  EMPLOYEES_AND_THEIR_SALARIES로 지정하시오
							  
select salary, concat(last_name,rpad(space(3),truncate(salary,-3)/1000 +length(space(3)),"*"))
	   as "EMPLOYEES_AND_THEIR_SALARIES"
from employees
order by salary desc;

select salary/1000
from employees;


select truncate(salary,-3)/1000
from employees;

select rpad(last_name,truncate(salary,-3)/1000 ,"*")
from employees;

select rpad("  ",truncate(salary,-3)/1000 +length("  "),"*")
from employees;