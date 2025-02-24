-- ## Challenge: Country Queries

SELECT * from cities;
select * from countries;

-- 1. Find the total population in Afghanistan.
SELECT SUM(c.population) FROM cities c WHERE c.countries_code = "AFG";

-- 2. Find the average population of cities in Saudi Arabia.
SELECT AVG(c.population) FROM cities WHERE c.countries_code = "SAU";

-- 3. Find the 10 smallest country populations. 
SELECT countries_code, sum(population) AS country_population from cities group by countries_code ORDER BY country_population ASC LIMIT 10;

SELECT c.countries_code, ct.name, SUM(population) AS total_population FROM cities c 
INNER JOIN countries ct ON c.countries_code = ct.code GROUP BY c.countries_code
ORDER BY total_population
LIMIT 10;

-- 4. Find the top 10 most populated countries that end with `stan`
SELECT ct.name, c.countries_code, SUM(c.population) AS total_population
FROM cities c
INNER JOIN countries ct ON c.countries_code = ct.code
WHERE ct.name LIKE '%stan'
GROUP BY ct.name, c.countries_code
ORDER BY total_population DESC
LIMIT 10;

-- 5. Find the least populated city for the top 10 most populated countries.
SELECT c.countries_code, c.population, c.name, pop.total_population 
FROM cities c
JOIN(
SELECT countries_code, SUM(population) AS total_population
FROM cities
GROUP BY countries_code
ORDER BY total_population DESC LIMIT 10) AS pop ON c.countries_code = pop.countries_code
WHERE c.population = (
SELECT MIN(c2.population) 
FROM cities c2
WHERE c2.countries_code = c.countries_code
) AND c.name = (
	SELECT MIN(c.name)
    FROM cities c3
    WHERE c3.countries_code = c.countries_code
    AND c3.population = c.population
) ORDER BY pop.total_population;


-- 6. Find the most populated city in countries that end with `stan`
SELECT c.countries_code, ct.name AS country_name, c.name AS city_name, c.population 
FROM cities c
INNER JOIN countries ct ON c.countries_code = ct.code
WHERE ct.name LIKE '%stan'
ORDER BY c.population DESC LIMIT 1;

-- 7. Find the average population of cities that have a country code that contains a `T`
SELECT c.countries_code, co.name AS country_name, AVG(c.population) AS avg_population 
FROM cities c
INNER JOIN countries co ON c.countries_code = co.code
WHERE co.code LIKE ("%T%") GROUP BY co.code
ORDER BY avg_population DESC;

-- 8. Find the most populated and least populated cities for each country that ends with `stan`, should be ordered alphabetically.
       
       -- COLUMNS AS FOLLOWS: country_name / least_populated_cities / smaller_pop / most_populated_cities / most_pop
SELECT co.name AS country_name,
(SELECT c.name FROM cities c WHERE c.countries_code = co.code ORDER BY c.population ASC, c.name ASC LIMIT 1) AS least_populated_cities,
(SELECT c.population FROM cities c WHERE c.countries_code = co.code ORDER BY c.population ASC, c.name ASC LIMIT 1) AS smaller_pop,
(SELECT c.name FROM cities c WHERE c.countries_code = co.code ORDER BY c.population DESC, c.name ASC LIMIT 1) AS most_populated_cities,
(SELECT c.population FROM cities c WHERE c.countries_code = co.code ORDER BY c.population DESC, c.name ASC LIMIT 1) AS most_pop
FROM countries co
WHERE co.name LIKE "%stan"
ORDER BY co.name;
	
	   -- City // Pop // Country
SELECT c_least.name AS city_name, c_least.population AS city_population, co.name as country_name
FROM cities c_least
JOIN countries co ON c_least.countries_code = co.code
WHERE co.name LIKE "%stan"
AND c_least.population = (
	SELECT MIN(c.population)
    FROM cities c
    WHERE c.countries_code = co.code
)
UNION ALL
SELECT c_most.name AS city_name, c_most.population AS city_population, co.name as country_name
FROM cities c_most
JOIN countries co ON c_most.countries_code = co.code
WHERE co.name LIKE "%stan"
AND c_most.population = (
	SELECT MAX(c.population)
    FROM cities c
    WHERE c.countries_code = co.code
) ORDER BY city_name;
