--difficulty=MEDIUM;name=Confirmation Rate;url=https://leetcode.com/problems/confirmation-rate
select user_id, round(actions / total, 2) as confirmation_rate
from (select s.USER_ID, sum(case when ACTION = 'confirmed' THEN 1 else 0 end) as actions, count(*) as total
      from Signups s
               left join Confirmations c on (s.user_id = c.user_id)
      group by s.USER_ID);