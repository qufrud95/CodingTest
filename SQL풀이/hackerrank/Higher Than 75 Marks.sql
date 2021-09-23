<PROBLEM>
Query the Name of any student in STUDENTS who scored higher than  Marks.
Order your output by the last three characters of each name. 
If two or more students both have names ending in the same last three characters (i.e.: Bobby, Robby, etc.),secondary sort them by ascending ID.

https://www.hackerrank.com/challenges/more-than-75-marks/problem?h_r=next-challenge&h_v=zen

SELECT NAME
FROM STUDENTS
WHERE Marks > 75
Order by RIGHT(Name,3),ID;

/*
1. 오른쪽 문자열 3개를 기준으로  정렬 후
2. 같은 문자열이라면 다시 ID를 기준으로 정렬 

*/
