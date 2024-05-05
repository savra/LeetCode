SELECT name AS "Employee"
FROM employee e1
WHERE managerId IS NOT NULL
  AND salary > (SELECT salary
                FROM employee e2
                WHERE e2.id = e1.managerId)