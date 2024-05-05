--difficulty=EASY;name=Delete Duplicate Emails;url=https://leetcode.com/problems/delete-duplicate-emails
DELETE
FROM Person p1
WHERE EXISTS(select id from Person p2 where id < p1.id and p1.email = email);