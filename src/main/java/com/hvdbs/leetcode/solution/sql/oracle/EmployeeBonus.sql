--difficulty=EASY;name=Employee Bonus;url=https://leetcode.com/problems/employee-bonus
select name, b.bonus
from employee e
         left join bonus b on (e.empid = b.empid)
where bonus is null
   or bonus < 1000
order by bonus
