--difficulty=EASY;name=Fix Names in a Table;url=https://leetcode.com/problems/fix-names-in-a-table
SELECT user_id, INITCAP(name) AS name
FROM users ORDER BY user_id;