-- 코드를 입력하세요
SELECT HISTORY_ID,
       CAR_ID,
       TO_CHAR(START_DATE, 'yyyy-mm-dd') AS START_DATE,
       TO_CHAR(END_DATE, 'yyyy-mm-dd') AS END_DATE,
       CASE
            WHEN (END_DATE-START_DATE + 1) >=30 THEN '장기 대여'
            ELSE '단기 대여'
        END AS RENT_TYPE
from CAR_RENTAL_COMPANY_RENTAL_HISTORY
where TO_CHAR(START_DATE, 'yyyy-mm')='2022-09'
order by HISTORY_ID desc;