--difficulty=MEDIUM;name=Managers with at Least 5 Direct Reports;url=https://leetcode.com/problems/managers-with-at-least-5-direct-reports
SELECT e.name
FROM employee e
WHERE id IN (SELECT manager.id
             FROM employee emp
                      JOIN employee manager ON (emp.managerId = manager.id)
             GROUP BY manager.id
             HAVING count(manager.name) >= 5)