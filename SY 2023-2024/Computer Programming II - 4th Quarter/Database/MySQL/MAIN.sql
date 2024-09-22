-- THIS IS A SQL COMMENT!!!!!
-- CREATE DATABASE Command
CREATE DATABASE dataTestDB;
-- CREATE TABLE Command
CREATE TABLE Customers(
	-- SQL DATATYPES Command
	-- SQL NOT NULL Command
    -- SQL UNIQUE Command
    -- PRIMARY KEY Command
	CustomerID INTEGER NOT NULL PRIMARY KEY UNIQUE,
    -- SQL FOREIGN KEY Command
	PersonID INTEGER, FOREIGN KEY(PersonID) REFERENCES Persons(PersonID),
    CustomerName TINYTEXT NOT NULL,
    ContactName TINYTEXT NOT NULL,
    -- SQL CHECK Command
    Age INTEGER, CHECK (Age>=18),
    Address MEDIUMTEXT NOT NULL,
    City TINYTEXT NOT NULL,
    PostalCode INTEGER,
    -- SQL DEFAULT Command
    Country TEXT NOT NULL DEFAULT 'United States of America',
    -- SQL DATE Command
    OrderDate DATE
);
-- SQL INDEX Command
CREATE INDEX Contact_Name
ON Customers (ContactName);
-- INSERT INTO Command
INSERT INTO Customers(CustomerID, CustomerName, ContactName, Address, City, PostalCode, Country)
VALUES
(1, 'Alfreds Futterkiste', 'Maria Anders', 'Maria Anders', 'Berlin', 12209, 'Germany'),
(2, 'Ana Trujillo Emparedados y helado', 'Ana Trujillo', 'Avda. de la Constitución 2222', 'Mexico D.F.', 05021, 'Mexico');