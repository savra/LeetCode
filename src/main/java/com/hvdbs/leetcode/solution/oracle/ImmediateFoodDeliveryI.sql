select round(immediateCount / allCount * 100, 2) as immediate_percentage
from (select count(*)                                                                            allCount,
             max((select count(*) from delivery where order_date = customer_pref_delivery_date)) immediateCount
      from delivery);