--difficulty=MEDIUM;name=Rank Scores;url=https://leetcode.com/problems/rank-scores
SELECT score,
       dense_rank() OVER (ORDER BY score DESC) rank
FROM scores;