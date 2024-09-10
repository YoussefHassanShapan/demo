CREATE TABLE Product (
                         _id SERIAL PRIMARY KEY,
                         description VARCHAR(255) NOT NULL,
                         price NUMERIC(19, 2) NOT NULL,
                         imageUrl VARCHAR(255)
);