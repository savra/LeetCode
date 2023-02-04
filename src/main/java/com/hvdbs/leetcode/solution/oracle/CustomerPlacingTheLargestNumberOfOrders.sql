SELECT *
FROM (SELECT customer_number
      FROM orders
      GROUP BY customer_number
      ORDER BY count(*) DESC)
WHERE rownum = 1;