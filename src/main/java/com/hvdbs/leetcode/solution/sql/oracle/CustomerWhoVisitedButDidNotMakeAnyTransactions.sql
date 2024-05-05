select customer_id "customer_id", count(*) "count_no_trans" from visits v
where not exists (select * from transactions t
                  where v.visit_id = t.visit_id)
group by customer_id;