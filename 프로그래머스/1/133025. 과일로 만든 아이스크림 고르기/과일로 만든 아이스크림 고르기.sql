-- 코드를 입력하세요
SELECT a.FLAVOR
from FIRST_HALF a, ICECREAM_INFO b
where TOTAL_ORDER > 3000 
and INGREDIENT_TYPE='fruit_based'
and a.FLAVOR=b.FLAVOR
order by TOTAL_ORDER desc