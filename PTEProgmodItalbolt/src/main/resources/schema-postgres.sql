DROP TABLE IF EXISTS products;
DROP TABLE IF EXISTS users;
CREATE TABLE users
(
    id          serial PRIMARY KEY,
    name        VARCHAR(100),
    phone_number VARCHAR(30),
    email       VARCHAR(255),
    zip         VARCHAR(10),
    city        VARCHAR(50),
    street      VARCHAR(250)
);
CREATE TABLE products
(
    id              serial PRIMARY KEY,
    name            VARCHAR(255),
    price           integer,
    type            varchar(250),
    description     VARCHAR(1000),
    image_src       VARCHAR(150),
    Hero            boolean,
    size            integer,
    alcohol_percent integer,
    place_of_origin varchar(30)
);

