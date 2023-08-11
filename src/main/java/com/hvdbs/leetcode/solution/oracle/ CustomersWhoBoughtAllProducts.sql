select customer_id
from (select customer_id,
             count(distinct product_key)                       as cnt_prd,
             (select count(distinct product_key) from product) as product_count
      from customer
      group by customer_id)
where cnt_prd = product_count;