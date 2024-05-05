--difficulty=EASY;name=Customer Placing the Largest Number of Orders;url=https://leetcode.com/problems/customer-placing-the-largest-number-of-orders
SELECT *
FROM (SELECT customer_number
      FROM orders
      GROUP BY customer_number
      ORDER BY count(*) DESC)
WHERE rownum = 1;