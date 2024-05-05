--difficulty=EASY;name=Recyclable and Low Fat Products;url=https://leetcode.com/problems/recyclable-and-low-fat-products
SELECT product_id
FROM products
WHERE low_fats = 'Y'
  AND recyclable = 'Y'