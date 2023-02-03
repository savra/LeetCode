SELECT score,
       dense_rank() OVER (ORDER BY score DESC) rank
FROM scores;