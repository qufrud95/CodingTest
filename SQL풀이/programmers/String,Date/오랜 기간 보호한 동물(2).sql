-- 코드를 입력하세 
SELECT INS.ANIMAL_ID,INS.NAME
FROM ANIMAL_INS AS INS INNER JOIN ANIMAL_OUTS AS OUTS ON INS.ANIMAL_ID = OUTS.ANIMAL_ID
ORDER BY OUTS.DATETIME - INS.DATETIME DESC LIMIT 2;