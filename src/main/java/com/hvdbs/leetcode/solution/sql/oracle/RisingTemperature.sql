SELECT id
FROM (SELECT id,
             temperature,
             LAG(temperature, 1, temperature) OVER (ORDER BY recordDate) prev_temperature,
             recordDate,
             LAG(recordDate, 1, recordDate) OVER (ORDER BY recordDate)   prev_recordDate
      FROM weather)
WHERE temperature > prev_temperature
  AND recordDate - prev_recordDate = 1