--difficulty=EASY;name=Group Sold Products By The Date;url=https://leetcode.com/problems/group-sold-products-by-the-date
select to_char(sell_date, 'yyyy-mm-dd')                        as "sell_date",
       count(*)                                                as "num_sold",
       listagg(product, ',') within group (order by sell_date) as "products"
from (select distinct sell_date, product from activities)
group by sell_date;