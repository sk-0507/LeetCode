/* Write your PL/SQL query statement below */
select distinct author_id as id
from Views 
where author_id in(viewer_id)  
order by  author_id ;