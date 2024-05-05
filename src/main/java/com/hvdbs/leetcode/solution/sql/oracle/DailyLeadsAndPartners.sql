--difficulty=EASY;name=Daily Leads and Partners;url=https://leetcode.com/problems/daily-leads-and-partners
select to_char(date_id, 'yyyy-mm-dd') as "date_id",
       make_name                      as "make_name",
       count(distinct lead_id)        as "unique_leads",
       count(distinct partner_id)     as "unique_partners"
from dailySales
group by date_id, make_name