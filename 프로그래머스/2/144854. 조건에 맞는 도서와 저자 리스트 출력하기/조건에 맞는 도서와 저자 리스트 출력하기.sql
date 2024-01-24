-- 코드를 입력하세요
SELECT a.BOOK_ID, b.AUTHOR_NAME, TO_CHAR(a.PUBLISHED_DATE, 'yyyy-mm-dd')
from BOOK a JOIN AUTHOR b ON a.AUTHOR_ID = b.AUTHOR_ID
where a.CATEGORY='경제'
order by a.PUBLISHED_DATE
