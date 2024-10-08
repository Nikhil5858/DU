CREATE TABLE EMPLOYEE
(EID INT,
ENAME VARCHAR(50),
DEPARTMENT VARCHAR(50),
SALARY DECIMAL(8,2),
JOININGDATE DATE,
CITY VARCHAR(50)
)

SELECT * FROM EMPLOYEE

INSERT INTO EMPLOYEE VALUES(101,'RAHUL','ADMIN',56000,'1-JAN-90','RAJKOT')
INSERT INTO EMPLOYEE VALUES(102,'HARDIK','IT',18000,'25-SEP-90','AHMEDABAD')
INSERT INTO EMPLOYEE VALUES(103,'BHAVIN','HR',25000,'14-MAY-91','BARODA')
INSERT INTO EMPLOYEE VALUES(104,'BHOOMI','ADMIN',39000,'8-FEB-91','RAJKOT')
INSERT INTO EMPLOYEE VALUES(105,'ROHIT','IT',17000,'23-JAN-90','JAMNAGAR')
INSERT INTO EMPLOYEE VALUES(106,'PRIYA','IT',9000,'19-OCT-90','AHMEDABAD')
INSERT INTO EMPLOYEE VALUES(107,'NEHA','HR',34000,'25-DEC-91','RAJKOT')

SELECT MAX(SALARY)  MAXIMUM,MIN(SALARY)  MINIMUM,SUM(SALARY)  TOTAL_SAL,AVG(SALARY)  AVERAGE_SAL
FROM EMPLOYEE

SELECT COUNT(EID)
FROM EMPLOYEE

SELECT MAX(SALARY) FROM EMPLOYEE
WHERE DEPARTMENT='IT'

SELECT COUNT(DISTINCT CITY) FROM EMPLOYEE

SELECT CITY,COUNT(EID) FROM EMPLOYEE
GROUP BY CITY

SELECT CITY,COUNT(EID) FROM EMPLOYEE
GROUP BY CITY
HAVING COUNT(EID)>1

SELECT DEPARTMENT,SUM(SALARY) FROM EMPLOYEE
GROUP BY DEPARTMENT

SELECT AVG(SALARY) FROM EMPLOYEE
GROUP BY DEPARTMENT

SELECT MIN(SALARY) FROM EMPLOYEE
WHERE CITY='AHMEDABAD'

SELECT DEPARTMENT,SUM(SALARY) FROM EMPLOYEE
WHERE CITY='RAJKOT'
GROUP BY DEPARTMENT
HAVING SUM(SALARY)>50000

SELECT COUNT(EID) FROM EMPLOYEE
WHERE CITY='RAJKOT'

SELECT MAX(SALARY)-MIN(SALARY) DIFFERENCE FROM EMPLOYEE



SELECT COUNT(EID) FROM EMPLOYEE
WHERE JOININGDATE<'1-JAN-91'

SELECT DEPARTMENT,SUM(SALARY) FROM EMPLOYEE
GROUP BY DEPARTMENT
HAVING SUM(SALARY)>35000
ORDER BY SUM(SALARY)

SELECT DEPARTMENT,COUNT(EID) FROM EMPLOYEE
GROUP BY DEPARTMENT
HAVING COUNT(EID)>2

--PART B:

CREATE TABLE COMPANY1
(TITLE VARCHAR(50),
COMPANY VARCHAR(50),
TYPE VARCHAR(50),
PRODUCTION_YEAR INT,
SYSTEM  VARCHAR(20),
PRODUCTION_COST DECIMAL(10,2),
REVENUE DECIMAL(10,2),
RATING INT)

SELECT * FROM COMPANY1

INSERT INTO COMPANY1 VALUES('BLASTING BOXES','SIMONE GAMES','ACTION ADVENTURE',1998,'PC',100000,200000,7)
INSERT INTO COMPANY1 VALUES('RUN RUN RUN!','13 MAD BITS','SHOOTER',2011,'PS3',350000,650000,3)
INSERT INTO COMPANY1 VALUES('DUCK N`GO','13 MAD BITS','SHOOTER',2012,'XBOX',3000000,1500000,5)
INSERT INTO COMPANY1 VALUES('SQL WARS!','VERTABELO','WARGAMES',2017,'XBOX',5000000,25000000,10)
INSERT INTO COMPANY1 VALUES('TAP TAP HEX!','PIXELGAMING INC.','RHYTHM',2006,'PS2',2500000,3500000,7)
INSERT INTO COMPANY1 VALUES('NORISK','SIMONE GAMES','ACTION ADVENTURE',2004,'PS2',1400000,3400000,8)


SELECT COMPANY,SUM(REVENUE) FROM COMPANY1
GROUP BY COMPANY

