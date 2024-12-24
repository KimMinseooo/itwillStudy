use hr;
-- 1. employees 테이블로부터 성이 "n"으로 끝나는 사원의 수를 
--    구하는 쿼리구문을 작성하시오.
select count(*)
from employees
where last_name like "%n";

-- (==) substr 함수 사용
select count(*)
from employees
where substr(last_name,-1,1)="n";
-- (==) right함수 사용
select count(*)
from employees
where right(last_name,1)="n";
-- 2. employees 테이블과 departments 테이블로부터 각 부서에 대한 부서번호,
-- 부서이름, 위치 및 사원 수를 보여주는 쿼리구문을 작성하시오.
-- 단, 사원이 없는 부서도 출력을 시키시오

select d.department_id,d.department_name, d.location_id, count(e.employee_id)
from employees e right outer join departments d
on e.department_id = d.department_id
group by d.department_id,d.department_name,d.location_id;


select *
from employees;


-- 3. employees 테이블로부터 각 월의 16일 이전에 채용된 사원을 모두 출력하는 
-- 쿼리구문을 작성하시오
select last_name,hire_date
from employees
where day(hire_date) < 16;
