--difficulty=EASY;name=Average Time of Process per Machine;url=https://leetcode.com/problems/average-time-of-process-per-machine
select machine_id, round(sum(end_time - start_time) / cnt, 3) as processing_time
from (select machine_id,
             count(process_id) over (partition by machine_id)           cnt,
             max(case activity_type when 'start' then timestamp end) as start_time,
             max(case activity_type when 'end' then timestamp end)   as end_time
      from activity
      group by machine_id,
               PROCESS_ID)
group by machine_id, cnt
order by MACHINE_ID;