/* Write your PL/SQL query statement below */
 



select unique_id, name
from Employees e, EmployeeUNI u
where e.id = u.id(+);