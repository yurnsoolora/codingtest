-- 코드를 입력하세요
SELECT NAME, count(NAME) AS COUNT
from ANIMAL_INS
group by NAME
having COUNT(NAME) > 1
order by NAME