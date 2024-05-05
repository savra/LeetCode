select max(name) as name, sum(nvl(distance, 0)) as travelled_distance
from users u
         left join rides r on (r.user_id = u.id)
group by u.id
order by travelled_distance desc, name asc