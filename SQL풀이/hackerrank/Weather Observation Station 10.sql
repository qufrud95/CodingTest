<PROBLEM>
Query the list of CITY names from STATION that do not end with vowels. Your result cannot contain duplicates.

Input Format

The STATION table is described as follows:
https://www.hackerrank.com/challenges/weather-observation-station-10/problem?h_r=next-challenge&h_v=zen&h_r=next-challenge&h_v=zen&h_r=next-challenge&h_v=zen


SELECT distinct(CITY)
FROM STATION
WHERE NOT REGEXP_LIKE(CITY,'[aeiou]$');