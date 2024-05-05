--difficulty=EASY;name=Project Employees I;url=https://leetcode.com/problems/project-employees-i
select project_id, round(avg(experience_years), 2) as average_years
from project p
         join employee e on (p.employee_id = e.employee_id)
group by project_id;