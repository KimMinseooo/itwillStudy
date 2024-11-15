-- [SQL문법] 4. 조인(join)
use hr;

-- 조인이란?
-- 여러 테이블의 데이터를 함께 출력하는 문법
-- [문법] select 컬럼1, 컬럼2, 컬럼3, ..., 컬럼n
-- 		 from 테이블1 join 테이블2
-- 		 on 테이블1.컬럼명 = 테이블2.컬럼명
--  	[where 조건문]
-- 		[order by 컬럼명 [asc | desc]];

-- (예제1) employees, departments 테이블을 사용해서 
-- 사원 정보(employee_id , last_name , salary , department_id)와 
-- 사원이 소속된 부서 정보(department_name)를 함께 출력하시오.
select employee_id , last_name, salary , 
	   employees.department_id, department_name
from employees join departments
on employees.department_id = departments.department_id
order by employee_id;
-- (==) 성능을 좋게 작성하기 
select employees.employee_id , employees.last_name, employees.salary , 
	   employees.department_id, departments.department_name
from employees join departments
on employees.department_id = departments.department_id
order by employees.employee_id;
-- (==) 테이블 alias 로 작성 (별칭)
select e.employee_id , e.last_name, e.salary , 
	   e.department_id, d.department_name
from employees e join departments d
on e.department_id = d.department_id
order by e.employee_id;

-- (예제2) departments, locations 테이블을 사용해서 
-- 부서 정보(department_id, department_name , location_id)와
-- 부서의 위치 정보(city, street_address) 를 함께 출력하시오. 
select d.department_id, d.department_name, d.location_id, 
		l.city, l.street_address
from departments d join locations l 
on d.location_id = l.location_id
order by d.department_id;

-- (예제3) employees, jobs 테이블을 사용해서
-- 사원의 정보(employee_id, last_name, job_id)와
-- 사원의 담당 업무명(job_title)을 함께 출력하시오.alter
select e.employee_id, e.last_name, e.job_id, j.job_title
from employees e join jobs j 
on e.job_id = j.job_id
order by e.employee_id;

-- (예제4) employees ,departments 테이블을 사용해서 
-- 부서 정보(department_id , department_name , manager_id)와
-- 부서의 매니저 정보(first_name, last_name, email)를 함께 출력하시오.
select d.department_id, d.department_name, d.manager_id,
		e.first_name, e.last_name, e.email
from departments d join employees e 
on d.manager_id = e.employee_id
order by d.department_id;

-- N개 테이블 조인하기 
-- 테이블 수 | 조인조건 수 
-- -------------------
--    2         1 
--    3			2
--    N		   N-1

-- (예제5) employees, departments, locations 테이블을 사용해서 
-- 직원 정보(employee_id, last_name , email, phone_number)와
-- 직원이 소속된 부서 정보(department_name)와
-- 부서의 위치 정보(city, street_address)를 함께 출력하시오.
select e.employee_id, e.last_name, e.email, e.phone_number,
		d.department_name, l.city, l.street_address
from employees e join departments d
on e.department_id = d.department_id
join locations l
on d.location_id = l.location_id
order by e.employee_id;
-- (==)
select e.employee_id, e.last_name, e.email, e.phone_number,
		d.department_name, l.city, l.street_address
from employees e join departments d join locations l 
on e.department_id = d.department_id
and d.location_id = l.location_id
order by e.employee_id;
