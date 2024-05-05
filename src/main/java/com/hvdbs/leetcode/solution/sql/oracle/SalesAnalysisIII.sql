--difficulty=EASY;name=Sales Analysis III;url=https://leetcode.com/problems/sales-analysis-iii
SELECT p.product_id, p.product_name
FROM product p
         JOIN sales s ON (p.product_id = s.product_id)
WHERE sale_date BETWEEN to_date('01.01.2019', 'dd.mm.yyyy') AND to_date('31.01.2019', 'dd.mm.yyyy')