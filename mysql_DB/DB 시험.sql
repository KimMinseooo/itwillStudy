use hr;
-- 1번
create table student (
	sno int primary key , 
    sname varchar(20) not null);
desc student;
-- 2번
create table course (
	cno varchar(20) primary key, 
    cname varchar(20));
desc course;
-- 3번
create table enrol (
	sno int , 
    cno varchar(20) , 
    credit varchar(10),
    primary key (sno,cno),
    foreign key (sno) references student(sno),
    foreign key (cno) references course(cno));
desc enrol;    
-- 4번
insert into student 
values (11002,'이홍근'),(24036,'김순미');
select *
from student;
-- 5번
insert into course
values ('CS310','데이터베이스'),('CS313','운영체제'),('CS345','자료구조');
select *
from course;
-- 6번
insert into enrol
values (11002,'CS310','A0'),(11002,'CS313','B+'),
	   (24036,'CS345','B0'),(24036,'CS310','A+');
select *
from enrol;
-- 7번
select sno
from student
where sname ='김순미';
-- 8번
select count(e.cno) as "과목수"
from enrol e join student s 
on e.sno = s.sno
where s.sname = '이홍근';
-- 9번
select s.sname
from student s join enrol e
on s.sno=e.sno
join course c 
on e.cno = c.cno
where cname ='데이터베이스';
-- 10번
select c.cname, count(s.sno) as '학생 수'
from student s join enrol e
on s.sno=e.sno
join course c 
on e.cno = c.cno
group by c.cname;
-- 11번
select s.sno,s.sname, 
	   sum(case when credit='A+' then 1 else 0 end) as 'A+받은 과목수'
from student s join enrol e
on s.sno=e.sno
join course c 
on e.cno = c.cno
group by s.sno;


select *
from student s join enrol e
on s.sno=e.sno
join course c 
on e.cno = c.cno;