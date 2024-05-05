--difficulty=EASY;name=Bank Account Summary II;url=https://leetcode.com/problems/bank-account-summary-ii
SELECT u.name, sum(t.amount) AS balance
FROM Users u JOIN transactions t ON (u.account = t.account)
GROUP BY u.name, u.account
HAVING sum(t.amount) > 10000;