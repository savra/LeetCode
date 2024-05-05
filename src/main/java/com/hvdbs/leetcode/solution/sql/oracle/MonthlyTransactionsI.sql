--difficulty=MEDIUM;name=Monthly Transactions I;url=https://leetcode.com/problems/monthly-transactions-i
SELECT month,
       country,
       max(trans_count)                                         AS trans_count,
       sum(CASE WHEN state = 'approved' THEN 1 ELSE 0 END)      AS approved_count,
       max(trans_total_amt)                                     AS trans_total_amount,
       sum(CASE WHEN state = 'approved' THEN amount ELSE 0 END) AS approved_total_amount
FROM (SELECT country,
             state,
             amount,
             to_char(trans_date, 'yyyy-mm')                                          AS month,
             sum(amount) OVER (PARTITION BY country, to_char(trans_date, 'yyyy-mm')) AS trans_total_amt,
             count(*) OVER (PARTITION BY country, to_char(trans_date, 'yyyy-mm'))    AS trans_count
      FROM transactions)
GROUP BY country, month
ORDER BY month, country DESC;