SELECT
    stock_name as "stock_name",
    SUM(price) as "capital_gain_loss"
FROM
    (
        SELECT
            stock_name,
            operation,
            operation_day,
            CASE
                WHEN operation = 'Buy' THEN
                    - price
                ELSE
                    price
                END price
        FROM
            Stocks
        ORDER BY
            Stocks.operation_day
    )
GROUP BY
    stock_name;