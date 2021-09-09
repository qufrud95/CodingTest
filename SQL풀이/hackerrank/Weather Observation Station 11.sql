<PROBLEM>
Query the list of CITY names from STATION that either do not start with vowels or do not end with vowels. Your result cannot contain duplicates.

Input Format

The STATION table is described as follows:
https://www.hackerrank.com/challenges/weather-observation-station-11/problem?h_r=next-challenge&h_v=zen&h_r=next-challenge&h_v=zen&h_r=next-challenge&h_v=zen&h_r=next-challenge&h_v=zen


SELECT DISTINCT(CITY)
FROM STATION
WHERE 
NOT REGEXP_LIKE(CITY,'^[aeiou]')
OR
NOT REGEXP_LIKE(CITY,'[aeiou]$')
/*
모음으로 시작하거나 모음으로 끝나지않는 로우 
*/