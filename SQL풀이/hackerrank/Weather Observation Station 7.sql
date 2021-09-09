<PROBLEM>
Query the list of CITY names ending with vowels (a, e, i, o, u) from STATION. Your result cannot contain duplicates.

Input Format

The STATION table is described as follows:
https://www.hackerrank.com/challenges/weather-observation-station-7/problem

SELECT distinct(CITY)
FROM
STATION
WHERE REGEXP_LIKE(CITY,'a$|e$|i$|o$|u$');
/*
'^__' -> 시작하는 문자
'__$' -> 끝나는 문자
'value1|value2' 포함하는 문자
'p....n' p로 시작하여 n으로 끝나는 문자
*/
