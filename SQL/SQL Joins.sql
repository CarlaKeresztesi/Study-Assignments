-- SQL JOINS
-- INNER JOINS

-- return all the columns
SELECT * FROM cities INNER JOIN country_languages ON cities.countries_code = country_languages.countries_code;

-- return only some columns
select c.name, c.countries_code, cl.language FROM cities c INNER JOIN country_languages cl ON c.countries_code = cl.countries_code;

-- Filter and order joined table query
SELECT * FROM countries;

SELECT c.name, c.district FROM cities c
INNER JOIN countries ct
ON c.countries_code = ct.code
WHERE ct.name = "France"
ORDER BY c.district;

-- LEFT JOIN = (OUTER) JOIN: Returns all records from the left table(=which comes on the left hand side of the word JOIN), and the matched records from the right table. 

SELECT c.name, c.population, ct.name FROM cities c
LEFT JOIN countries ct
ON c.countries_code = ct.code;

SELECT * FROM cities;

-- FULL JOIN

SELECT * FROM cities c
LEFT JOIN countries ct
ON c.countries_code = ct.code
UNION
SELECT * FROM cities c
RIGHT JOIN countries ct
ON c.countries_code = ct.code;