-- 1、查询"01"课程比"02"课程成绩高的学生的信息及课程分数

SELECT s.*,sc1.s_score AS '01_score',sc2.s_score AS '02_score' FROM student s
    JOIN score sc1 ON s.s_id = sc1.s_id
    LEFT JOIN score sc2 ON sc1.s_id = sc2.s_id
WHERE
    sc1.c_id = '01'
    AND sc2.c_id = '02'
    AND sc1.s_score > sc2.s_score;

-- 2、查询平均成绩大于等于60分的同学的学生编号和学生姓名和平均成绩
SELECT s.s_name FROM student s
    JOIN (
        SELECT sc.s_id,avg(s_score) as avg_score FROM score sc GROUP BY sc.s_id,sc.c_id
        ) tmp ON s.s_id = tmp.s_id
WHERE tmp.avg_score > 60 or tmp.avg_score = 60;

select b.s_id,b.s_name,ROUND(AVG(a.s_score),2) as avg_score from
    student b
    join score a on b.s_id = a.s_id
    GROUP BY b.s_id,b.s_name HAVING ROUND(AVG(a.s_score),2)>=60;
