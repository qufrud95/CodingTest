<PROBLEM>
Query the list of CITY names starting with vowels (i.e., a, e, i, o, or u) from STATION. Your result cannot contain duplicates.

Input Format

The STATION table is described as follows:
https://www.hackerrank.com/challenges/weather-observation-station-6/problem

SELECT distinct(CITY) 
FROM STATION
WHERE REGEXP_LIKE(CITY,'^A|^E|^I|^O|^U');