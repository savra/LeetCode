--difficulty=EASY;name=User Activity for the Past 30 Days I;url=https://leetcode.com/problems/user-activity-for-the-past-30-days-i
SELECT to_char(activity_date, 'yyyy-mm-dd') AS day, count(DISTINCT user_id) AS active_users
FROM Activity
WHERE activity_date > (to_date('2019-07-27', 'yyyy-mm-dd') - 30)
  AND activity_date <= to_date('2019-07-27', 'yyyy-mm-dd')
GROUP BY activity_date