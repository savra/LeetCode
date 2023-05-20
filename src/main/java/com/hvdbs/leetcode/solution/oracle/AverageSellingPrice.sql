select product_id, round(sum(price * prod_unit) / sum(prod_unit), 2) average_price
from (select iq.*,
             (select sum(units)
              from UnitsSold us
              where us.product_id = iq.product_id
                and us.purchase_date between iq.start_date and iq.end_date) as prod_unit
      from (select distinct p.*
            from prices p
                     join UnitsSold u on (u.product_id = p.product_id)) iq)
group by product_id;