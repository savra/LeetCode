--difficulty=EASY;name=Percentage of Users Attended a Contest;url=https://leetcode.com/problems/percentage-of-users-attended-a-contest
SELECT contest_id,
       round(count(user_id) / (SELECT count(*) from users u) * 100, 2) percentage
FROM register
GROUP BY contest_id
ORDER BY percentage DESC, contest_id