select query_name, round(quality, 2) as quality, round(1 / cnt * 100, 2) as poor_query_percentage
from (select query_name, avg(rating / position) as quality, count(*) as cnt
      from queries
      group by query_name)