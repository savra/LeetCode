DELETE
FROM Person p1
WHERE EXISTS(select id from Person p2 where id < p1.id and p1.email = email);