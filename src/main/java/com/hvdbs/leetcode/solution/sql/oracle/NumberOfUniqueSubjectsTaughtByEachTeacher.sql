--difficulty=EASY;name=Number of Unique Subjects Taught by Each Teacher;url=https://leetcode.com/problems/number-of-unique-subjects-taught-by-each-teacher
select teacher_id, count(distinct subject_id) cnt
from teacher group by teacher_id;