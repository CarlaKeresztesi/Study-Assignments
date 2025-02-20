CREATE DATABASE nology;
USE nology;

CREATE table users (
id int UNSIGNED NOT NULL auto_increment,
`name` VARCHAR(255) NOT NULL,
date_created timestamp default NOW(),
primary key (id)
);

INSERT INTO users (`name`) VALUES ('Lola'), ('Simon'), ('Bonnie'), ('Nazrin');

SELECT `users`.`id`,
    `users`.`name`,
    `users`.`date_created`
FROM `nology`.`users`;

SELECT id, name, date_created FROM users;


CREATE TABLE cars (
	id int UNSIGNED NOT NULL auto_increment,
    make VARCHAR(255) NOT NULL,
    model VARCHAR(255) NOT NULL,
    release_year INT unsigned NOT NULL,
    user_id INT UNSIGNED NOT NULL,
    PRIMARY KEY(id),
    FOREIGN KEY (user_id) REFERENCES users(id)
);

INSERT INTO cars (make, model, release_year, user_id) VALUES ('Hyundai', 'i30', 2018, 1), ('Land Rover', 'P90', 2024, 2), ('Mazda', 'RX8', 2022, 3);

SELECT id, model, make, user_id FROM cars;