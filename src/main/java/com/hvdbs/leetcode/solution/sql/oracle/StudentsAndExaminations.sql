--difficulty=EASY;name=Students and Examinations;url=https://leetcode.com/problems/students-and-examinations
select s.STUDENT_ID, s.student_name, sub.subject_name, count(e.student_id) as attended_exams
from Students s
         cross join Subjects sub
         left join Examinations e on (s.STUDENT_ID = e.STUDENT_ID AND e.subject_name = sub.subject_name)
GROUP BY s.STUDENT_ID, s.student_name, sub.subject_name
order by s.STUDENT_ID;