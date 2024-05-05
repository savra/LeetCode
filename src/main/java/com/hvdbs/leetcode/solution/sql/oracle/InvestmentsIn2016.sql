--difficulty=MEDIUM;name=Investments in 2016;url=https://leetcode.com/problems/investments-in-2016
SELECT round(sum(tiv_2016), 2) AS tiv_2016
FROM insurance i1
WHERE i1.tiv_2015 IN (SELECT tiv_2015 FROM insurance i2 WHERE i2.pid != i1.pid)
  AND (i1.lat, i1.lon) NOT IN (SELECT i2.lat, i2.lon FROM insurance i2 WHERE i2.pid != i1.pid);