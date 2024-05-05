--difficulty=EASY;name=Rearrange Products Table;url=https://leetcode.com/problems/rearrange-products-table
select *
from (
         SELECT product_id,
                case when store1 is not null then 'store1' end as store,
                store1                                         as price
         from products

         union

         SELECT product_id,
                case when store2 is not null then 'store2' end as store,
                store2                                         as price
         from products

         union

         SELECT product_id,
                case when store3 is not null then 'store3' end as store,
                store3                                         as price
         from products)
where price is not null
order by store;
