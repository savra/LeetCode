--difficulty=EASY;name=Classes More Than 5 Students;url=https://leetcode.com/problems/classes-more-than-5-students
SELECT class
FROM courses
GROUP BY class
HAVING count(*) >= 5