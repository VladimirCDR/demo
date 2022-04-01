CREATE TABLE products (
    id BINARY(100) primary key,
    price  DECIMAL (19) UNSIGNED
);

CREATE TABLE customers
(
    id    BINARY(100) primary key,
    first_name VARCHAR(100),
    last_name VARCHAR(100),
    email VARCHAR(100)
);

CREATE TABLE users
(
    id    BINARY(100) primary key,
    username VARCHAR(100),
    password VARCHAR(100),
    active BOOLEAN,
    roles VARCHAR(100),
    created_at TIMESTAMP,
    last_login TIMESTAMP
);