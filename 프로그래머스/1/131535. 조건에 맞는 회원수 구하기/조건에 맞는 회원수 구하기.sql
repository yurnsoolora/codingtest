-- 코드를 입력하세요
SELECT count(*) 
from USER_INFO
where TO_CHAR(JOINED,'yyyy')='2021' AND age >=20 and age <=29;