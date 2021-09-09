<PROBLEM>
Query the list of CITY names from STATION that do not start with vowels. Your result cannot contain duplicates.

Input Format

The STATION table is described as follows:
https://www.hackerrank.com/challenges/weather-observation-station-9/problem?h_r=next-challenge&h_v=zen&h_r=next-challenge&h_v=zen

SELECT distinct(CITY)
FROM STATION
WHERE NOT REGEXP_LIKE(CITY,'^[aeiou]');

/*
NOT 연산자를 이용 모음으로 시작하지않는 문자 처리
*/