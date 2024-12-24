use hr;
-- 1. 다음 테이블을 생성하시오
create table stu 
	(stu_no varchar(10) primary key,
    stu_name varchar(20) not null);
    
create table grades 
	(stu_no varchar(10),
     subject varchar(10),
     score int);

--  2. 생성된 테이블에 다음과 같이 데이터를 삽입하시오
insert into stu
values ("A0001","홍길동"),
	   ("A0002","이소니"),
       ("A0003","김사라");

insert into grades
values ("A0001","국어",84),
	   ("A0001","수학",91),
       ("A0003","국어",72),
       ("A0003","수학",82);

select * 
from grades;

select *
from stu;
--  3. 다음과 같이 학생 정보와 성적이 모두 나오도록 출력하시오. 또한 성적이 없을 경우
--     에도 학생 정보는 출력될 수 있도록 구문을 작성하시오
select s.stu_no as "학번", s.stu_name as "이름",
	   g.subject as "과목", g.score as "성적"
from stu s left outer join grades g
on s.stu_no = g.stu_no
order by s.stu_no ,g.score;

--  4. 국어 점수가 80점 이상인 학생의 정보를 출력하시오
select s.stu_no as "학번", s.stu_name as "이름",
	   g.subject as "과목", g.score as "성적"
from stu s join grades g 
on s.stu_no = g.stu_no
where g.subject ="국어"
and g.score >= 80;

--  5. 시험 성적이 없는 학생의 정보를 출력하시오.(join 사용)
select s.stu_no as "학번", s.stu_name as "이름"
from stu s left outer join grades g 
on s.stu_no = g.stu_no
where g.score is null;

-- 6. 시험 성적이 없는 학생의 정보를 출력하시오 ( subquery 사용 ) 
select stu_no as "학번", stu_name as "이름"
from stu 
where stu_no not in (select stu_no 
				  from grades
				 where score is not null);

select *
from stu;

select *
from grades;                 

-- 7. 전체 학생들의 과목별 평균 점수를 출력하시오.
select g.subject as "과목", truncate(avg(g.score),0) as "평균"
from stu s join grades g
on s.stu_no = g.stu_no
group by g.subject;

-- (==)
select subject as "과목", truncate(avg(score),0) as "평균"
from  grades
group by subject;



