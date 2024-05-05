--difficulty=MEDIUM;name=Tree Node;url=https://leetcode.com/problems/tree-node
SELECT id,
       CASE
           WHEN p_id IS NULL THEN 'Root'
           WHEN (select max(p_id) FROM tree t2 WHERE t2.p_id = t.id) IS NULL THEN 'Leaf'
           ELSE 'Inner' END AS "type"
FROM tree t;