--difficulty=EASY;name=Calculate Special Bonus;url=https://leetcode.com/problems/calculate-special-bonus
SELECT employee_id,
       CASE
           WHEN MOD(employee_id, 2) != 0 AND SUBSTR(name, 1, 1) != 'M' THEN
               salary
           ELSE 0 END AS bonus
FROM Employees
ORDER BY employee_id;