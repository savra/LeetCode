--difficulty=EASY;name=Customers Who Never Order;url=https://leetcode.com/problems/customers-who-never-order
SELECT name AS Customers
FROM customers c
WHERE NOT EXISTS
    (SELECT null FROM orders o WHERE o.customerId = c.id);