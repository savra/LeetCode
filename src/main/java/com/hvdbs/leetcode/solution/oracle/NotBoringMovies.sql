SELECT *
FROM Cinema
WHERE mod(id, 2) != 0
  AND description != 'boring'
  AND RATING <= 10
  AND RATING >= 0
ORDER BY rating DESC;