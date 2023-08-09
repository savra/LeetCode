select rownum as id, student
from (select seat.id,
             seat.student,
             case when mod(seat.id, 2) = 0 then (id - 2) else id end as even
      from seat
      order by even)
