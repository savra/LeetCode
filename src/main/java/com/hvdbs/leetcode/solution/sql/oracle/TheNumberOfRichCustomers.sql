--difficulty=EASY;name=The Number Of Rich Customers;url=https://leetcode.com/problems/the-number-of-rich-customers
select count(*) as rich_count
from (select distinct customer_id as rich_count
      from store
      where amount > 500);