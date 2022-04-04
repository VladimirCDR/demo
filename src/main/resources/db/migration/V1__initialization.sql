CREATE TABLE products (
    id BINARY(100) primary key,
    price  DECIMAL (19) UNSIGNED
);

CREATE TABLE role
(
    id     INTEGER NOT NULL,
    role VARCHAR(8),
    PRIMARY KEY (id)
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
    role VARCHAR(8),
    created_at TIMESTAMP,
    last_login TIMESTAMP
);