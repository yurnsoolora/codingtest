-- 코드를 입력하세요
SELECT BOOK_ID, TO_CHAR(PUBLISHED_DATE, 'yyyy-mm-dd') as PUBLISHED_DATE
from BOOK
where TO_CHAR(PUBLISHED_DATE, 'yyyy') ='2021' AND CATEGORY='인문'
order by PUBLISHED_DATE