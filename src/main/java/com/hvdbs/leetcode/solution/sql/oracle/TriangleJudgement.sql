--difficulty=EASY;name=Triangle Judgement;url=https://leetcode.com/problems/triangle-judgement
select x,
       y,
       z,
       case
           when x + y > z AND x + z > y AND z + y > x then 'Yes'
           else 'No'
       end as triangle
from Triangle;