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
select abs(-5) , abs(5) , abs(-4.5);

-- power(숫자, 제곱값) : 숫자의 제곱 값을 계산하여 반환해 주는 함수 
select power(2,3), power(8,3);

-- sign(숫자) : 숫자가 양수이면 1, 음수이면 -1 , 0이면 0을 반환해주는 함수 
select sign(3) ,sign(-3) , sign(-4.27), sign(0);

-- (2) 날짜함수 
-- now() = sysdate() = current_timestamp() : 현재 날짜/시간을 반환함.
--                                           (년/월/일/시/분/초)
select now() , sysdate() , current_timestamp();

-- current_date() = curdate() : 현재 날짜를 반환함. (년/월/일)
-- current_time() = curtime() : 현재 시간을 반환함. (시/분/초) 
select now() ,current_date() , current_time();

-- year(날짜/시간) : 날짜/시간에서 년도를 반환함.
-- month(날짜/시간) : 날짜/시간에서 월을 반환함.
-- day(날짜/시간) : 날짜/시간에서 일을 반환함.
-- hour(날짜/시간) : 날짜/시간에서 시간을 반환함.
-- minute(날짜/시간) : 날짜/시간에서 분을 반환함.
-- second(날짜/시간) : 날짜/시간에서 초를 반환함.
select now() , year(now()), month(now()), day(now()),
		hour(now()), minute(now()), second(now());
        
select employee_id , last_name , job_id, year(hire_date) as "입사년도"
from employees;

-- date(날짜/시간) : 날짜/시간에서 날짜를 반환함.(년/월/일)
-- time(날짜/시간) : 날짜/시간에서 시간을 반환함.(시/분/초)
select now(), date(now()) , time(now());

-- adddate(날짜, 기간) = date_add(날짜, 기간) : 날짜에 기간을 더한 날짜를 반환함.
-- subdate(날짜, 기간) = date_sub(날짜, 기간) : 날짜에 기간을 뺀 날짜를 반환함.
select adddate('2024-11-02', interval 35 day) as value1,
	   adddate('2024-11-02', interval 2 month)as value2,
       date_add('2024-11-02',interval 1 year)as value3;
       
select subdate('2024-11-02', interval 35 day) as value1,
	   subdate('2024-11-02', interval 2 month)as value2,
       date_sub('2024-11-02',interval 1 year)as value3;
       
-- addtime(날짜/시간, 시간) : 날짜/시간에서 시간을 더한 결과를 반환함.
-- subtime(날짜/시간, 시간) : 날짜/시간에서 시간을 뺀 결과를 반환함.
select now() , addtime(now(),'1:30:10');
select now() , subtime(now(),'1:30:10');

-- datediff(날짜1, 날짜2 ) : 날짜1 - 날짜2를 반환함.
-- timediff(시간1 ,시간2 ) : 식산1 - 시간2를 반환함.
select datediff(current_date(), '2024-10-21');
select timediff(current_time(), '10:11:30');

select last_name, hire_date, datediff(now(), hire_date) as "근무한 일수"
from employees;

-- dayofweek(날짜) : 날짜의 요일 값을 반환함.
--                  (1-일, 2-월, 3-화, 4-수, 5-목, 6-금, 7-토)
-- monthname(날짜) : 날짜의 월의 영문이름을 반환함.
-- dayofyear(날짜) : 날짜가 1년 중 몇 번째 날짜인지를 반환함.
select dayofweek(now()), monthname(now()), dayofyear(now());
select employee_id, last_name, hire_date, monthname(hire_date)
from employees;

-- last_day(날짜) : 날짜가 속한 월의 마지막 날짜를 반환함.
select last_day(now());

select employee_id, last_name ,hire_date, last_day(hire_date),
	   datediff(last_day(hire_date), hire_date)
from employees;

-- quarter(날짜) : 날짜가 4분기 중에서 몇 분기인지 반환함.
select quarter('2022-01-25'), quarter('2024-04-01'),
	   quarter('2023-08-09'), quarter(now());

-- <연습문제>
-- 1. employees 테이블로부터 전 사원의 employee_id, last_name, salary를 출력하고 
-- 마지막 컬럼에는 15.5% 인상된 급여(일의 자리까지 반올림)를 
-- New salary라는 제목으로 출력하는 구문을 작성하시오.
select employee_id, last_name, salary , round(salary*1.155,0) as "New Salary"
from employees;

-- 2. employees 테이블로부터 사원들의 employee_id, last_name, salary,
-- 15.5% 인상된 급여(New Salary), 새 급여에서 이전 급여를 뺀 값(Increase)을
-- 출력하는 구문을 작성하시오. (단, 4번째, 5번째 컬럼은 일의 자리까지 반올림하여 정수로 표현하시오)
select employee_id, last_name ,salary ,
	   round(salary*1.155,0) as "New Salary",
       round(salary*1.155,0)-salary as "Increase"
from employees;

-- 3.employees 테이블로부터 2월에 입사한 사원들의 employee_id, last_name,
--  job_id, hire_date, department_id를 출력하시오
select employee_id, last_name, job_id, hire_date,department_id
from employees
where month(hire_date) = 2;

-- 4.  employees 테이블로부터 1990년부터 1995년에 입사한 사원들의 employee_id,
-- last_name, hire_date, salary, department_id를 출력하시오
select employee_id, last_name, hire_date, salary, department_id
from employees
where year(hire_date) >= 1990
and year(hire_date) <=1995;

-- 5.employees 테이블로부터 오늘 날짜를 기준으로 근무한 주수가 
-- 1200주 미만인 사원들의 last_name, hire_date, 근무한 일수,
--  근무한 주수를 출력하는 구문을 작성하시오
select last_name, hire_date ,datediff(now(),date(hire_date)) as "근무한 일수",
	   truncate(datediff(now(),date(hire_date))/7,0) as "근무한 주수"
from employees
where truncate(datediff(now(),date(hire_date))/7,0) < 1400;

-- 6. employees 테이블로부터 전 사원들의 employee_id, last_name, hire_date,
-- 입사한 날짜에 해당되는 분기를 출력하는 구문을 작성하시오.
-- 특히 입사한 날짜에 해당되는 분기를 출력해야하는 4번째 컬럼은 
-- 예를 들어 입사일이 2000-05-05인 경우 2분기라고 출력될 수 있도록 작성하시오
select employee_id, last_name ,hire_date,
	   concat(quarter(hire_date),"분기") as "입사한 분기"
from employees;
