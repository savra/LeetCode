--difficulty=EASY;name=Duplicate Emails;url=https://leetcode.com/problems/duplicate-emails
SELECT email FROM Person
GROUP BY email
HAVING count(*) > 1;