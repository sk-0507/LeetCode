/* Write your PL/SQL query statement below */
select product_name,year,price
from sales s,product p
where s.product_id = p.product_id;