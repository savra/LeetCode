(select e.employee_id
 from salaries e
          left join employees s on (e.employee_id = s.employee_id)
 union
 select e.employee_id
 from employees e
          left join salaries s on (e.employee_id = s.employee_id))
minus
(select e.employee_id
 from salaries e
          left join employees s on (e.employee_id = s.employee_id)
 intersect
 select e.employee_id
 from employees e
          left join salaries s on (e.employee_id = s.employee_id))