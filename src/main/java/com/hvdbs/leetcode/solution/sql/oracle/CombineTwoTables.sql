--difficulty=EASY;name=Combine Two Tables;url=https://leetcode.com/problems/combine-two-tables
SELECT firstName, lastName, city, state
FROM person p LEFT OUTER JOIN address a ON (p.personId = a.personId)