### 1、查询"01"课程比"02"课程成绩高的学生的信息及课程分数

```sql
SELECT s.*,sc1.s_score AS '01_score',sc2.s_score AS '02_score' FROM student s
    JOIN score sc1 ON s.s_id = sc1.s_id
    LEFT JOIN score sc2 ON sc1.s_id = sc2.s_id
WHERE
    sc1.c_id = '01'
    AND sc2.c_id = '02'
    AND sc1.s_score > sc2.s_score;
```
### 2、查询平均成绩大于等于60分的同学的学生编号和学生姓名和平均成绩
```sql
SELECT s.s_id,s.s_name,avg(sc.s_score) AS 'avg_score' FROM student s
    JOIN score sc ON s.s_id = sc.s_id 
GROUP BY s.s_id HAVING avg_score >= 60;
```
