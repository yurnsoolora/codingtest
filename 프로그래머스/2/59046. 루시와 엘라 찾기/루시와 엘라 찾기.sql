-- 코드를 입력하세요
SELECT ANIMAL_ID, NAME, SEX_UPON_INTAKE
from ANIMAL_INS
where NAME='Lucy' OR  NAME='Ella' OR  NAME='Pickle' OR  NAME='Rogan' OR NAME='Mitty' OR NAME='Sabrina'
order by ANIMAL_ID