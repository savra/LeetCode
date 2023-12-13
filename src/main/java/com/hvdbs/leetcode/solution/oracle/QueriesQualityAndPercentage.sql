SELECT query_name,
       round(summ / cnt, 2) AS                                    quality,
       round(1 / (SELECT count(*) FROM Queries WHERE rating <= 3) * 100, 2) poor_query_percentage
FROM (SELECT query_name, sum(rating / position) AS summ, count(*) AS cnt
      FROM Queries
      GROUP BY query_name);
