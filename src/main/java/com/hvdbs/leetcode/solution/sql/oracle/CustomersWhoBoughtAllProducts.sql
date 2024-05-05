--difficulty=MEDIUM;name=Customers Who Bought All Products;url=https://leetcode.com/problems/customers-who-bought-all-products
select customer_id
from (select customer_id,
             count(distinct product_key)                       as cnt_prd,
             (select count(distinct product_key) from product) as product_count
      from customer
      group by customer_id)
where cnt_prd = product_count;