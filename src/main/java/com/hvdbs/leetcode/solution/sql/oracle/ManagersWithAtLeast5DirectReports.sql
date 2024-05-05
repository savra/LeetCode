SELECT e.name
FROM employee e
WHERE id IN (SELECT manager.id
             FROM employee emp
                      JOIN employee manager ON (emp.managerId = manager.id)
             GROUP BY manager.id
             HAVING count(manager.name) >= 5)