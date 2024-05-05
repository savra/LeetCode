SELECT to_char(event_day, 'yyyy-mm-dd') AS "day", emp_id AS "emp_id", sum(total_time) AS "total_time"
FROM (SELECT emp_id, event_day, (out_time - in_time) AS total_time
      FROM Employees)
GROUP BY event_day, emp_id
ORDER BY "day"