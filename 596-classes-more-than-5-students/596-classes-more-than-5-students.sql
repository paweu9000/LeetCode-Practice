# Write your MySQL query statement below
SELECT class FROM Courses
GROUP BY class
HAVING COUNT(distinct student) >= 5