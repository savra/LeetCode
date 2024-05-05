SELECT u.user_id                                    AS buyer_id,
       to_char(u.join_date, 'yyyy-mm-dd')           AS join_date,
       (SELECT count(*)
        FROM orders
        WHERE buyer_id = u.user_id
          AND extract(YEAR FROM order_date) = 2019) AS orders_in_2019
FROM Users u