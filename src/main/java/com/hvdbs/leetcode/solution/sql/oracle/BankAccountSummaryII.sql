SELECT u.name, sum(t.amount) AS balance
FROM Users u JOIN transactions t ON (u.account = t.account)
GROUP BY u.name, u.account
HAVING sum(t.amount) > 10000;