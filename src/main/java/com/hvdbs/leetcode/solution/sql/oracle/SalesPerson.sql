--difficulty=EASY;name=Sales Person;url=https://leetcode.com/problems/sales-person
SELECT sp.name
FROM SalesPerson sp
WHERE NOT EXISTS
    (SELECT NULL
     FROM orders o
              JOIN company c ON (c.com_id = o.com_id)
     WHERE c.name = 'RED'
       AND sp.sales_id = o.sales_id)