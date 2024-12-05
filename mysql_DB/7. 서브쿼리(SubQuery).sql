-- [SQL문법] 7. 서브쿼리(subquery)
use hr;

-- 서브쿼리란?
-- 쿼리구문 안에 또 다시 쿼리구문이 들어가 있는 형태 

-- employees 테이블에서 last_name이 'abel'인 사원보다 급여를 더 많이 
-- 받는 사원을 출력하시오.
-- 실행 순서는 무조건 안쪽에서 바깥쪽!! ==> 서브쿼리를 먼저 실행한 후에 메인쿼리 실행!
-- 서브쿼리 작성될 수 있는 곳 : group by절을 제외한 select구문에 작성 가능함.
-- 						  DML(insert, update, delete) 작성 가능함.
-- 						  DDL(create , alter 등) 작성 가능함.

-- [문법] where절에 서브쿼리가 사용된 경우
-- 		 select 컬럼1, 컬럼2, 컬럼3
--  	 from 테이블명
-- 		 where 컬럼명 = (select 컬럼명
-- 					    from 테이블명
-- 						where 조건문);
-- 서브쿼리 유형 : 단일행 서브쿼리, 다중행 서브쿼리

-- 7-1. 단일행 서브쿼리
-- 서브쿼리로부터 메인쿼리로 단일행(단일값)이 반환되는 유형 
-- 메인쿼리에 우변에 단일 값이 올 수 있는 단일행 비교연산자 사용하면 됨.
-- 단일행 비교연산자 : = , > , >= , < , <=, <> , !=

select employee_id , last_name, salary
from employees
where salary > 
				(select salary 
			    from employees 
			    where last_name = "abel");

-- 141번 사원의 부서 동료들의 이름 출력하시오.                
select last_name, job_id
from employees 
where job_id = 
				(select job_id
                 from employees
                 where employee_id = 141);
                 
-- 최소급여자의 정보를 출력하시오.
select last_name, job_id , salary
from employees
where salary = 
				(select min(salary)
				 from employees);

-- Lee 사원보다 급여를 더 많이 받는 사원의 정보를 출력하시오.
select last_name, job_id , salary
from employees
where job_id = (select job_id
				from employees
				where last_name = "Lee")
and salary > (select salary
			  from employees
			  where last_name ="Lee");
                 
select department_id, min(salary)
from employees
where department_id is not null
group by department_id
having min(salary) >
					(select min(salary)
                     from employees
                     where department_id =30);
   
-- 서브쿼리로부터 여러 행이 반환되는 예제
-- 오류 수정 : = -> in (다중행 비교 연산자 사용해야함)   
select employee_id, last_name
from employees
where salary in (select min(salary)
				from employees
                group by department_id);

-- 결과가 나오지 않는 이유? haas 직원이 존재하지 않음.
-- 단일행 서브쿼리로부터 null값이 반환된 경우 메인쿼리 결과도 null이다!
select last_name , job_id
from employees
where job_id = (select job_id 
				from employees
                where last_name ="Haas");

-- 7-2. 다중행 서브쿼리 
-- 서브쿼리로부터 메인쿼리로 여러 행(다중값)이 반환되는 유형. 
-- 메인쿼리에는 우변에 값리스트가 올 수 있는 다중행 비교연산자 사용해야함.
-- 다중행 비교연산자 : in , not in , any(or) , all(and) 

-- =any	 	 : (= , OR) 		(==) in	: (= , OR) 
-- >any      : (> , OR)
-- >=any	 : (>=, OR)
-- <any	 	 : (< , OR)
-- <=any	 : (<=, OR)
-- <>any	 : (<>, OR)
-- =all		 : (= , AND)		(==) not in : (<>, AND) 
-- >all      : (= , AND) 
-- >=all	 : (= , AND)
-- <all		 : (= , AND)
-- <=all	 : (= , AND)
-- <>all	 : (= , AND)

select employee_id, last_name, manager_id, department_id
from employees
where manager_id in (select manager_id
					 from employees
                     where employee_id in(174, 141))
and department_id in (select department_id
					  from employees
                      where employee_id in (174, 141))
and employee_id not in(174,141);

select employee_id , last_name, job_id ,salary 
from employees
where salary < any (select salary 
					from employees
                    where job_id = "IT_PROG")
and job_id <> "IT_PROG";


