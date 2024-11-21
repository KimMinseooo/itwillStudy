-- [SQL문법] 5-2. 단일행함수 - 숫자함수, 날짜함수
use hr;

-- (1) 숫자함수
-- round(숫자, 반올림할 자리) : 숫자를 반올림할 자리까지 반올림함.
-- truncate(숫자, 버림할 자리) : 숫자를 버림할 자리까지 남기고 버림함.
-- 숫자 :    1   2    3  . 4   5   6 
-- 자리 :   -2  -1    0    1   2   3
select round(45.923,2), round(45.923,0), round(45.923,-1);
select truncate(45.923,2), truncate(45.923,0) , truncate(45.023, -1);

-- ceil(숫자) : 일의 자리까지 올림을 함 .
-- floor(숫자) : 일의 자리까지 남기고 버림을 함 . 
select ceil(45.923), ceil(52.1) , ceil(25.0);
select floor(45.923), floor(52.1) , floor(25.0);

-- mod(숫자1, 숫자2) : 숫자1을 숫자2로 나눈 나머지를 반환함.
select 157/10, mod(157, 10), 157%10 , 157 mod 10;

select last_name, salary , mod(salary, 5000)
from employees
where job_id = "SA_REP";

select employee_id, mod(employee_id, 2) 
from employees;

-- abs(숫자) : 절대값을 반환하는 함수 

