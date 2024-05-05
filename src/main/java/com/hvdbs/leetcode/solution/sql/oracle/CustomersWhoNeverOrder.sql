SELECT name AS Customers
FROM customers c
WHERE NOT EXISTS
    (SELECT null FROM orders o WHERE o.customerId = c.id);