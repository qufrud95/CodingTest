<PROBLEM>
Query the list of CITY names from STATION which have vowels (i.e., a, e, i, o, and u) as both their first and last characters. Your result cannot contain duplicates.

Input Format

The STATION table is described as follows:
https://www.hackerrank.com/challenges/weather-observation-station-8/problem?h_r=next-challenge&h_v=zen

SELECT distinct(CITY)
FROM
STATION
WHERE REGEXP_LIKE(CITY,'^[aeiou]' )
AND REGEXP_LIKE(CITY,'[aeiou]$' );


/*

앞서 배운 REGEXP_LIKE 를 AND 연산자로 묶어서 한번에 처리

또한 []를통해 OR 연산자 없이 묶어서 처리 가능 

*/