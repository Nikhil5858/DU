CREATE TABLE ORDERS
(ORD_NO INT,
PURCH_AMT FLOAT,
ORD_DATE DATE,
CUSTOMER_ID INT,
SALESMAN_ID INT) 

CREATE TABLE CUSTOMER
(CUSTOMER_ID INT,
CUST_NAME VARCHAR(50),
CITY VARCHAR(50),
GRADE INT,
SALESMAN_ID INT)

CREATE TABLE SALESMAN
(SALESMAN_ID INT,
NAME VARCHAR(50),
CITY VARCHAR(50),
COMMISSION FLOAT)

SELECT * FROM ORDERS

SELECT * FROM CUSTOMER

SELECT * FROM SALESMAN


INSERT INTO ORDERS
VALUES
(70001, 150.5, '2012-05-10', 3005, 5002),
(70009, 270.65, '2012-10-09', 3001, 5005),
(70002, 65.26, '2012-05-10', 3002, 5001),
(70004, 110.5, '2012-08-17', 3009, 5003),
(70007, 948.5, '2012-09-10', 3005, 5002),
(70005, 2400.6, '2012-07-27', 3007, 5001),
(70008, 5760, '2012-09-10', 3002, 5001),
(70010, 1983.43, '2012-10-10', 3004, 5006),
(70003, 2480.4, '2012-10-10', 3009, 5003),
(70012, 250.45, '2012-06-27', 3008, 5002),
(70011, 75.29, '2012-08-17', 3003, 5007),
(70013, 3045.6, '2012-04-25', 3002, 5001),
(70001, 150.5, '2012-05-10', 3005, 5002),
(70009, 270.65, '2012-10-09', 3001, 5005),
(70002, 65.26, '2012-05-10', 3002, 5001);


INSERT INTO CUSTOMER
VALUES
(3002, 'Nick Rimando', 'New York', 100, 5001),
(3007, 'Brad Davis', 'New York', 200, 5001),
(3005, 'Graham Zusi', 'California', 200, 5002),
(3008, 'Julian Green', 'London', 300, 5002),
(3004, 'Fabian Johnson', 'Paris', 300, 5006),
(3009, 'Geoff Cameron', 'Berlin', 100, 5003),
(3003, 'Jozy Altidor', 'Moscow', 200, 5007),
(3001, 'Brad Guzan', 'London', NULL, 5005);


INSERT INTO  SALESMAN VALUES
(5001, 'James Hoog', 'New York', 0.15),
(5002, 'Nail Knite', 'Paris', 0.13),
(5005, 'Pit Alex', 'London', 0.11),
(5006, 'Mc Lyon', 'Paris', 0.14),

(5007, 'Paul Adam', 'Rome', 0.13),
(5003, 'Lauson Hen', 'San Jose', 0.12);

--1.Write a SQL query to calculate total purchase amount of all orders. Return total purchase amount.
SELECT SUM(PURCH_AMT) FROM ORDERS

--2.Write a SQL query to calculate the average purchase amount of all orders. Return average purchase amount.
SELECT AVG(PURCH_AMT) FROM ORDERS

--3.Write a SQL query that counts the number of unique salespeople. Return number of salespeople.
SELECT COUNT(SALESMAN_ID) FROM SALESMAN

--4. Write a SQL query to count the number of customers. Return number of customers.
SELECT COUNT(CUSTOMER_ID) FROM CUSTOMER

--5. Write a SQL query to determine the number of customers who received at least one grade for their activity.
SELECT COUNT(CUSTOMER_ID) FROM CUSTOMER
WHERE GRADE>1

--6. Write a SQL query to find the maximum purchase amount.
SELECT MAX(PURCH_AMT) FROM ORDERS

--7. Write a SQL query to find the minimum purchase amount.
SELECT MIN(PURCH_AMT) FROM ORDERS

--8. Write a SQL query to find the highest grade of the customers in each city. Return city, maximum grade.
SELECT CITY,MAX(GRADE) FROM CUSTOMER
GROUP BY CITY

--9. Write a SQL query to find the highest purchase amount ordered by each customer. Return customer ID,
--maximum purchase amount.
SELECT CUSTOMER_ID,MAX(PURCH_AMT) FROM ORDERS
GROUP BY CUSTOMER_ID

--10. Write a SQL query to find the highest purchase amount ordered by each customer on a particular date.
--Return, order date and highest purchase amount.
SELECT CUSTOMER_ID,ORD_DATE,MAX(PURCH_AMT) FROM ORDERS
GROUP BY CUSTOMER_ID,ORD_DATE

--PART-B:


--1. Write a SQL query to determine the highest purchase amount made by each salesperson on '2012-08-17'.
--Return salesperson ID, purchase amount.
SELECT SALESMAN_ID,MAX(PURCH_AMT) FROM ORDERS
WHERE  ORD_DATE>'17-AUG-2012'
GROUP BY SALESMAN_ID

--2. Write a SQL query to find the highest order (purchase) amount by each customer on a particular order date.
--Filter the result by highest order (purchase) amount above 2000.00. Return customer id, order date and
--maximum purchase amount.
SELECT CUSTOMER_ID,ORD_DATE, MAX(PURCH_AMT) FROM ORDERS
GROUP BY  CUSTOMER_ID,ORD_DATE
HAVING MAX(PURCH_AMT)>2000.00

--3. Write a SQL query to find the maximum order (purchase) amount in the range 2000 - 6000 (Begin and end
--values are included.) by combination of each customer and order date. Return customer id, order date and
--maximum purchase amount.
SELECT CUSTOMER_ID,ORD_DATE, MAX(PURCH_AMT) FROM ORDERS
GROUP BY CUSTOMER_ID,ORD_DATE
HAVING MAX(PURCH_AMT) BETWEEN 2000 AND 6000

--4. Write a SQL query to find the maximum order (purchase) amount based on the combination of each
--customer and order date. Filter the rows for maximum order (purchase) amount is either 2000, 3000, 5760,
--6000. Return customer id, order date and maximum purchase amount.
SELECT CUSTOMER_ID,ORD_DATE, MAX(PURCH_AMT) FROM ORDERS
GROUP BY CUSTOMER_ID,ORD_DATE
HAVING MAX(PURCH_AMT) IN(2000, 3000, 5760,6000)

--5. Write a SQL query to determine the maximum order amount for each customer. The customer ID should be
--in the range 3002 and 3007(Begin and end values are included.). Return customer id and maximum purchase
--amount.
SELECT CUSTOMER_ID,MAX(PURCH_AMT) FROM ORDERS
WHERE CUSTOMER_ID BETWEEN 3002 AND 3007
GROUP BY CUSTOMER_ID

--6. Write a SQL query to find the maximum order (purchase) amount for each customer. The customer ID should
--be in the range 3002 and 3007(Begin and end values are included.). Filter the rows for maximum order
--(purchase) amount is higher than 1000. Return customer id and maximum purchase amount.
SELECT CUSTOMER_ID,MAX(PURCH_AMT) FROM ORDERS
WHERE CUSTOMER_ID BETWEEN 3002 AND 3007
GROUP BY CUSTOMER_ID
HAVING MAX(PURCH_AMT)>1000

--7. Write a SQL query to determine the maximum order (purchase) amount generated by each salesperson.
--Filter the rows for the salesperson ID is in the range 5003 and 5008 (Begin and end values are included.).
--Return salesperson id and maximum purchase amount.
SELECT SALESMAN_ID,MAX(PURCH_AMT) FROM ORDERS
WHERE  SALESMAN_ID BETWEEN 5003 AND 5008
GROUP BY SALESMAN_ID

--8. Write a SQL query to count all the orders generated on '2012-08-17'. Return number of orders.
SELECT COUNT(ORD_NO) FROM ORDERS
WHERE ORD_DATE>'17-AUG-2012'

--9. Write a SQL query to count the number of salespeople in a city. Return number of salespeople.
SELECT COUNT(CITY) FROM CUSTOMER

--10. Write a SQL query to count the number of orders based on the combination of each order date and
--salesperson. Return order date, salesperson id.
SELECT ORD_DATE,COUNT(SALESMAN_ID) FROM ORDERS
GROUP BY ORD_DATE

