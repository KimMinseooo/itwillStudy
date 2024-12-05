-- [SQL 문법] 6. 그룹합수와 그룹화
use hr;

-- 6-1. 그룹함수란?
-- 행그룹을 조작해서 하나의 결과값을 반환함. 
-- 그룹함수 종류 : sum , avg, min , max , count
-- 그룹함수 특징 : null값은 제외하고 작업함! 

-- min(행그룹) : 행그룹에서 최소값을 반환함. 모든 데이터타입에 사용 가능함.
-- max(행그룹) : 행그룹에서 최대값을 반환함. 모든 데이터타입에 사용 가능함.
select min(salary) , max(salary) 
from employees;

select min(hire_date), max(hire_date)
from employees;

select min(last_name) , max(last_name) 
from employees;

-- sum(행그룹) : 행그룹의 합계를 반환함.
-- avg(행그룹) : 행그룹의 평균을 반환함.	
select sum(salary) as "급여 합계" , avg(salary) as "급여 평균"
from employees;

select sum(salary) as "급여 합계" , avg(salary) as "급여 평균"
from employees
where job_id like "%REP%";

-- (예제) employees 테이블에서 전체 직원의 커미션 평균을 출력하시오.
-- [출력] avg_comm
--      ---------
--        oooo
-- [오답] 커미션을 받는 사원들의 커미션 평균
select avg(COMMISSION_PCT) as "avg_comm"
from employees;
-- [정답]
select avg(ifnull(COMMISSION_PCT,0)) as "avg_comm"
from employees;
-- (=)
select sum(COMMISSION_PCT) / count(*) as "avg_comm"
from employees;

select * 
from employees;


-- count(행그룹) : 행그룹에서 행의 개수를 반환함. 
select count(employee_id)
from employees;

select count(*)
from employees;

select count(last_name)
from employees;

select count(commission_pct)
from employees;

select count(department_id)
from employees;				-- 부서가 있는 직원 수를 출력하시오.

select count(distinct department_id)
from departments;				-- 직원들이 소속된 부서의 수를 출력하시오.
				
select department_id
from departments;
                
select count(department_id)
from departments;            -- 우리 회사에 존재하는 부서의 수를 출력하시오.

-- 6-2. group by절
-- 테이블 안에서 또 다시 작은 그룹화를 나눠주는 구문 
-- [문법] select 컬럼1, 컬럼2, 컬럼3
-- 		 from 테이블명
-- 		[where 조건문]
-- 		[group by 컬럼명]
--  	[order by 컬럼명 [asc |desc]];
-- (★) 그룹함수와 group by절이 사용되는 구문 작성 시 규칙!
-- select절의 컬럼리스트 중 그룹함수에 포함된 컬럼과
-- 그룹함수에 포함되지 않은 컬럼이 같이 출력되려면 
-- 그룹함수에 포함되지 않은 컬럼은 빠짐없이 group by절에 
-- 포함되어야 문법 오류가 발생되지 않음!

-- employees 테이블에서 부서별 급여의 평균을 출력하시오.,
select department_id, avg(salary)
from employees
group by department_id;

-- employees 테이블에서 부서 내 업무별 평균 급여를 출력하시오.
select department_id, job_id, avg(salary)
from employees
group by department_id, job_id
order by department_id;

-- employees 테이블에서 department_id가 40이상인 부서 내 업무별 급여를 합한 값을 출력하시오
select department_id, job_id, sum(salary)
from employees
where department_id > 40 
group by department_id, job_id
order by department_id;

select department_id, count(last_name)
from employees
group by department_id;

select department_id, job_id, count(last_name)
from employees
group by department_id, job_id;

-- 6-3. having절
-- [문법] select 컬럼1, 컬럼2, 컬럼3
-- 		 from 테이블명
-- 		[where 조건문]	  --행 제한 조건문
-- 		[group by 컬럼명]
-- 		[having 조건문]     --행그룹 제한 조건문(그룹함수 포함 조건문)
--  	[order by 컬럼명 [asc |desc]];

select job_id,sum(salary) PAYROLL
from employees
where job_id not like '%REP%'
group by job_id
having sum(salary) >13000
order by sum(salary);

select job_id,sum(salary) PAYROLL
from employees
where job_id not like '%REP%'
group by job_id
having PAYROLL >13000
order by PAYROLL;

-- 1. employees 테이블로부터 전체 사원들의 커미션 평균을 출력하는 구문을 작성하시오.
-- 단, 소수점 둘째자리까지 반올림해서 출력하시오
select round(avg(ifnull(commission_pct,0)),2) as "avg_comm"
from employees;

--  2. employees 테이블로부터 업무(job_id)별 최대 급여(Maximum),
--  최소 급여(Minimum), 급여의 합계(Sum), 평균 급여(Average)를 출력하시오
select job_id,round(max(salary),0) as "Maximum",
			  round(min(salary),0) as "Minumum",
              round(sum(salary),0) as "Sum",
              round(avg(salary),0) as "Average"
from employees
group by job_id;

-- 3. employees 테이블로부터 동일 업무(job_id)를 수행하는
--  직원 수를 출력하는 구문을 작성하시오. 
select job_id , count(last_name) as "COUNT(*)"
from employees
group by job_id;

--  4. employees 테이블로부터 매니저를 알 수 없는 사원은 제외하고
--  매니저별로 그룹화하여 매니저별 최소 급여를 출력하되 최소 급여가 $6000 이상인 
--  그룹만 출력하시오. 또한 최소 급여를 기준으로 내림차순으로 정렬하여 출력하시오
select manager_id,min(salary)
from employees
where manager_id is not null
group by manager_id 
having min(salary) >= 6000
order by min(salary) desc;

-- 5. employees 테이블에서 최고 급여와 최저 급여의 차이를 출력하는 구문을 작성하시오
select max(salary) -min(salary) as "DIFFERENCE"
from employees;

--  6. employees 테이블로부터 사원의 총 수와 1995년, 1996년, 1997년,
--  1998년에 채용된 사원의 수를 표시하는 구문을 작성하시오

select count(employee_id) as "TOTAL",
	   sum(year(hire_date)=1995) as "1995",
	   sum(year(hire_date)=1996) as "1996",
       sum(year(hire_date)=1997) as "1997",
       sum(year(hire_date)=1998) as "1998"
from employees;

-- (==) if 결과 반환값으로 1말고 employee_id 등을 줘도 된다 또한, false인 경우 반환값으로 null을 무조건 줘야함
select count(employee_id) as "TOTAL",
	   count(if(year(hire_date)=1995,1,null)) as "1995",
       count(if(year(hire_date)=1996,1,null)) as "1996",
       count(if(year(hire_date)=1997,1,null)) as "1997",
       count(if(year(hire_date)=1998,1,null)) as "1998"
from employees;






