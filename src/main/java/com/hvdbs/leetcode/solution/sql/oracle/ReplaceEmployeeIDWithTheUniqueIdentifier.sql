--difficulty=EASY;name=Replace Employee ID With The Unique Identifier;url=https://leetcode.com/problems/replace-employee-id-with-the-unique-identifier
select unique_id, name
from employees e
         left join employeeUNI eu on (e.id = eu.id)