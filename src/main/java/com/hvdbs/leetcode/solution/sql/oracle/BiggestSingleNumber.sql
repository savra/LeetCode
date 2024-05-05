--difficulty=EASY;name=Biggest Single Number;url=https://leetcode.com/problems/biggest-single-number
SELECT num
FROM ((SELECT num, COUNT(*) cnt
       FROM MyNumbers
       GROUP BY num
       HAVING COUNT(*) = 1)
      UNION ALL
      (SELECT null AS num, 1 cnt FROM dual)
      ORDER BY num DESC NULLS LAST)
WHERE rownum = 1;