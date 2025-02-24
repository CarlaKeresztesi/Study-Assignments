USE world_x;

SELECT * FROM cities;

SELECT * FROM cities AS c LIMIT 100;

SELECT * FROM cities AS c WHERE c.population > 100000 LIMIT 50;
SELECT * FROM cities AS c WHERE c.population > 100000 ORDER BY c.population LIMIT 50;

SELECT c.name, c.population FROM cities AS c WHERE c.population > 100000 LIMIT 1, 100;

-- Ordering Results

SELECT * FROM cities AS c order by c.population DESC;
SELECT * FROM cities AS c order by c.population ASC;

SELECT * FROM cities AS c order by c.countries_code ASC;

-- Secondary Ordering

SELECT * FROM cities AS c order by c.countries_code ASC, c.population DESC;

SELECT c.name FROM cities AS c WHERE c.name LIKE 'san%' ORDER BY c.population ASC LIMIT 100;

SELECT c.name, c.population FROM cities AS c WHERE c.name LIKE 'san%' ORDER BY c.population ASC LIMIT 100;


