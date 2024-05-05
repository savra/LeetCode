select count(*) as rich_count
from (select distinct customer_id as rich_count
      from store
      where amount > 500);