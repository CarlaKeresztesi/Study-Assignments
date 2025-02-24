
-- Naive

-- 1NF
CREATE TABLE customers (
	name VARCHAR(255) NOT NULL,
    address VARCHAR(255) NOT NULL,
    product VARCHAR(255) NOT NULL,
    product_price INT UNSIGNED NOT NULL,
    customer_title VARCHAR(10) NOT NULL
    );
    
-- Normalization

-- NF = Normal Form
-- 1NF – First normalisation level
-- 2NF – 2nd NORMAL FORM

-- How do we go from 1NF to 2NF?

-- = 1NF + Each of the non-key attribute must be functionally dependent on the PK (primary key)

CREATE TABLE customers (
	id LONG NOT NULL,
	name VARCHAR(255) NOT NULL, -- Dependent on the PK (which is the customer)
    address VARCHAR(255) NOT NULL, -- Dependent on the PK - each address is unique to a sgle customer, which is assoc to an id
    product VARCHAR(255) NOT NULL, -- NOT dependent on the PK, more than one customer can have that product
    product_price INT UNSIGNED NOT NULL, -- NOT dependent on the PK, more than one product can have the same price
    customer_title VARCHAR(10) NOT NULL, -- NOT dependent on the PK, more than one customer can have the same customer_title (mr, miss etc.)
    PRIMARY KEY (id)
    );
    
-- We need to get all the INDEPENDENT columns to have their own tables
		-- below doing 2NF - we can keep price in same table as products
CREATE TABLE products (
	id INT UNSIGNED NOT NULL auto_increment,
    name VARCHAR(255) NOT NULL,
    price FLOAT NOT NULL,
    PRIMARY KEY (id)
);

CREATE TABLE titles(
	id INT UNSIGNED NOT NULL auto_increment,
    title VARCHAR(255) NOT NULL,
	PRIMARY KEY (id)
);

CREATE TABLE addresses (
	id INT UNSIGNED NOT NULL auto_increment,
    address VARCHAR(255) NOT NULL,
    customer_id INT UNSIGNED NOT NULL,
    PRIMARY KEY (id),
    FOREIGN KEY (customer_id) REFERENCES customers(id)
);

CREATE TABLE customers (
	id INT UNSIGNED NOT NULL auto_increment,
	name VARCHAR(255) NOT NULL, 
    address_id INT unsigned,  -- NOT NULL, 
    product_id INT UNSIGNED NOT NULL, 
    customer_title_id INT UNSIGNED NOT NULL, 
    PRIMARY KEY (id),
    -- FOREIGN KEY(address_id) REFERENCES addresses(id),
    FOREIGN KEY(product_id) REFERENCES products(id),
    FOREIGN KEY(customer_title_id) REFERENCES customer_titles(id)
    );
    
    ALTER TABLE addresses ADD CONSTRAINT fk_addresses_customer FOREIGN KEY (customer_id) REFERENCES customers(id);
    ALTER TABLE customers ADD CONSTRAINT fk_customers_addresses FOREIGN KEY (address_id) REFERENCES addresses(id);
    
    -- From 2NF to 3NF
    
CREATE TABLE postcode (
	id INT UNSIGNED NOT NULL AUTO_INCREMENT,
    postcode VARCHAR(255) NOT NULL,
    city VARCHAR(255) NOT NULL,
    PRIMARY KEY (id)
   );
        
 CREATE TABLE addresses (
		id INT UNSIGNED NOT NULL AUTO_INCREMENT,
        street_address VARCHAR(255) NOT NULL,
        postcode_id INT UNSIGNED NOT NULL,
        customer_id INT UNSIGNED, -- NOT NULL
        city VARCHAR(255) NOT NULL,
        PRIMARY KEY (id),
        FOREIGN KEY (customer_id) REFERENCES customers(id),
        FOREIGN KEY (postcode_id) REFERENCES postcodes(id)
        );        