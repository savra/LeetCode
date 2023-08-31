select u.user_id                                    as buyer_id,
       to_char(u.join_date, 'yyyy-mm-dd')           as join_date,
       (select count(*)
        from orders
        where buyer_id = u.user_id
          and extract(year from order_date) = 2019) as orders_in_2019
from Users u