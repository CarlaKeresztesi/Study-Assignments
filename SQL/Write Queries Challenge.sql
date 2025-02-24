USE world_x;

--  Get the name and country code for `20` cities that have a `population` greater than `123123`, order your results by `country_code` from `A-Z`
SELECT name, countries_code FROM cities WHERE population > 123123 ORDER BY countries_code  ASC LIMIT 20;

-- Get the name and country code for `13` cities that have a `population` less than `1231231`, order your results by `country_code` from `Z-A`
SELECT name and countries_code FROM cities WHERE population < 1231231 order by countries_code DESC LIMIT 13;

-- Get all fields for `10` cities in `USA` ordered by `name` `A-Z` and also descending `population`
SELECT * FROM cities WHERE countries_code = 'USA' AND name LIKE '%as%' ORDER BY name, population DESC LIMIT 100; 
SELECT * FROM cities WHERE countries_code = 'RUS' ORDER BY name, population DESC LIMIT 10;
SELECT * FROM cities WHERE countries_code = 'AUS' ORDER BY name, population DESC LIMIT 10;
SELECT * FROM cities WHERE countries_code LIKE '_US' ORDER BY name, population DESC LIMIT 10;
SELECT * FROM cities WHERE countries_code LIKE '%5' ORDER BY name, population DESC LIMIT 10;

SELECT name, COUNT(*) AS count
FROM cities WHERE countries_code LIKE 'USA'
GROUP BY name
HAVING COUNT(*) > 1;

-- Get all fields for the `3` most populated cities in `Saudi Arabia`
SELECT * FROM cities WHERE countries_code = 'SAU' ORDER BY population DESC LIMIT 3;

-- Get all fields for the `6` least populated cities in `Saudi Arabia`
SELECT * FROM cities WHERE countries_code LIKE 'SAU' ORDER BY population LIMIT 6;

-- Get the names of the `5` most populated cities in `Saudi Arabia`, `Brunei` and `Russia` - in total
SELECT name FROM cities WHERE countries_code IN ('SAU', 'BRN', 'RUS') ORDER BY population DESC LIMIT 5;

-- Get the names of the `5` most populated cities in `Saudi Arabia`, `Brunei` and `Russia` - 5 per country and then total
(SELECT name, countries_code FROM cities WHERE countries_code = 'SAU' ORDER BY population DESC LIMIT 5)
UNION ALL
(SELECT name, countries_code FROM cities WHERE countries_code = 'BRN' ORDER BY population DESC LIMIT 5)
UNION ALL
(SELECT name, countries_code FROM cities WHERE countries_code = 'RUS' ORDER BY population DESC LIMIT 5);

-- Get the names of the `3` least populated cities in `Russia` excluding the least populated city
SELECT name, countries_code FROM cities WHERE countries_code = 'RUS' ORDER BY population ASC LIMIT 3;
SELECT name, countries_code FROM cities WHERE countries_code = 'RUS' ORDER BY population ASC LIMIT 3 OFFSET 1;

-- Create queries for 3 additional insights that you are interested in.
SELECT * FROM country_languages WHERE countries_code = 'SAU';

SELECT * FROM country_languages WHERE language LIKE 'Spanish' ORDER BY percentage DESC LIMIT 3;

SELECT * FROM country_languages WHERE language like 'French' AND is_official LIKE 'T';

SELECT COUNT(language) FROM country_languages WHERE language like 'French' AND is_official LIKE 'T';

SELECT * FROM country_languages WHERE language like 'English';






