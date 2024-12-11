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
-- >any      : (> , OR)			-> 최소값보다 크면 된다.
-- >=any	 : (>=, OR)			-> 최소값보다 크거나 같으면 된다.
-- <any	 	 : (< , OR)			-> 최대값보다 작으면 된다.
-- <=any	 : (<=, OR)			-> 최대값보다 작거나 같으면 된다.
-- <>any	 : (<>, OR)			-> 단일값인 경우 의미가 있고, 다중값인 경우에는 의미가 없음.
-- =all		 : (= , AND)		-> 단일값인 경우 의미가 있고, 다중값인 경우에는 의미가 없음.
-- >all      : (= , AND) 		-> 최대값보다 크면 된다.
-- >=all	 : (= , AND)		-> 최대값보다 크거나 같으면 된다.
-- <all		 : (= , AND)		-> 최소값보다 작으면 된다.
-- <=all	 : (= , AND)		-> 최소값보다 작거나 같으면 된다.
-- <>all	 : (= , AND)		(==) not in : (<>, AND) 

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

-- 우리 회사에서 제일 급여를 적게 받는 사원의 정보를 출력하시오.
select last_name, job_id, salary
from employees
where salary = ( select min(salary)
				   from employees);

select employee_id, last_name, job_id, salary
from employees
where salary < any ( select salary
					   from employees
					  where job_id ="IT_PROG")
and job_id <> "IT_PROG";

select employee_id, last_name, job_id, salary
from employees 
where salary < ALL (select salary
					 from employees
					where job_id = "IT_PROG")
and job_id <> "IT_PROG";

-- 다중행, 다중컬럼 서브쿼리
-- 부서별 최소급여를 받는 사원들의 정보 출력하시오.
select employee_id, first_name, department_id, salary
from employees
where (department_id, salary) in (select department_id, min(salary)
									from employees
									group by department_id)
order by department_id;

select department_id, min(salary)
from employees
group by department_id;

-- employees 테이블에서 자기 자신이 매니저가 아닌 최하위 직원을 출력하시오 
-- 결과가 나오지 않는 원인은? 
-- -> 서브쿼리문에서 manager_id 값 중 null이 포함되어 있어서 
--    not in은 and의 성격을 포함하기때문에 결과도 null
-- 다중행 서브쿼리로붵 반환되는 값리스트에 null값이 포함된 경우
-- (1) or의 성격을 가지는 다중행 비교연산자 사용 => 메인 쿼리 결과 정상 출력됨.
-- (2) and의 성격을 가지는 다중행 비교연산자 사용 => 메인 쿼리 결과도 null이다.

select last_name
from employees
where employee_id not in (select manager_id 
							from employees
                            where manager_id is not null);
                            
-- <서브쿼리 연습문제>
-- 1. employees 테이블에서 Abel과 동일한 부서에 소속된 사원들의 
--    last_name과 hire_date를 출력하되 비교의 대상인 Abel은 제외하시오
select last_name, hire_date
from employees
where department_id = (select department_id
				         from employees
				        where last_name ="Abel")
and last_name <> "Abel";

-- 2. employees 테이블에서 평균 이상의 급여를 받는 사원들의 
--    employee_id, last_name, salary를 출력하되 급여를 기준으로 오름차순 하시오
select employee_id, last_name, salary 
from employees
where salary >= (select avg(salary)
				   from employees)
order by salary;

-- 3. employees 테이블에서 last_name에 ‘u’가 포함된 사원과 
--    같은 부서에 근무하는 모든 사원의 employee_id, last_name을 출력하시오.
select employee_id, last_name
from employees
where department_id in (select department_id
						  from employees
						 where last_name like "%u%");
                  
select job_id, last_name
from employees
where last_name like "%u%";

-- 4. employees 테이블과 departments 테이블을 사용하여 구문을 작성하시오.
--    location_id가 1700인 부서에 소속된 사원들의 employee_id, last_name,
--    department_id, job_id를 출력하시오

select employee_id, last_name, department_id, job_id
from employees 
where department_id in (select department_id
						  from departments
						 where location_id = 1700);

-- 5. employees 테이블에서 평균 이상의 급여를 받으면서 last_name에 ‘u’가 포함된 사원과 
--    동일한 부서에 소속된 사원들의 employee_id, last_name, salary를 출력하시오
select employee_id, last_name, salary
from employees
where department_id in (select department_id
						from employees
                        where last_name like "%u%")
and salary >= (select avg(salary)
				from employees);
                
-- 6. employees 테이블에서 본인이 매니저의 역할을 하는 
--    사원들의 employee_id, last_name을 출력하시오

select employee_id, last_name
from employees
where employee_id in (select manager_id
					   from employees);
                          
select manager_id, last_name from employees;

-- 7. employees 테이블과 departments 테이블을 사용하여 구문을 작성하시오.
--    직원이 소속되어 있지 않은 빈 부서의 department_id, department_name을 출력하시오.

select department_id, department_name
from departments
where department_id not in (select department_id
							  from employees
							 where department_id is not null);

select employee_id, department_id
from employees;
