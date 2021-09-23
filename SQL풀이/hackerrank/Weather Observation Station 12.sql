<PROBLEM>
Query the list of CITY names from STATION that do not start with vowels and do not end with vowels. Your result cannot contain duplicates.

Input Format

The STATION table is described as follows:

https://www.hackerrank.com/challenges/weather-observation-station-12/leaderboard

SELECT DISTINCT(CITY) 
FROM STATION
WHERE
NOT REGEXP_LIKE(CITY,'^[aeiou]')
AND
NOT REGEXP_LIKE(CITY,'[aeiou]$');