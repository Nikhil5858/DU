-- Table: Astronauts
CREATE TABLE Astronauts (
    astronaut_id INT IDENTITY(1,1) PRIMARY KEY,
    astronaut_name NVARCHAR(100) NOT NULL,
    age INT CHECK (age >= 0),
    nationality NVARCHAR(50),
    total_space_missions INT DEFAULT 0 CHECK (total_space_missions >= 0)
);

-- Table: Missions
CREATE TABLE Missions (
    mission_id INT IDENTITY(1,1) PRIMARY KEY,
    mission_name NVARCHAR(100) NOT NULL,
    launch_date DATE NOT NULL,
    duration_days INT CHECK (duration_days >= 0),
    mission_type NVARCHAR(50)
);

-- Table: Spacecrafts
CREATE TABLE Spacecrafts (
    spacecraft_id INT IDENTITY(1,1) PRIMARY KEY,
    spacecraft_name NVARCHAR(100) NOT NULL,
    capacity INT CHECK (capacity > 0),
    manufacturer NVARCHAR(100)
);

-- Table: Participation (Associative Entity)
CREATE TABLE Participation (
    astronaut_id INT,
    mission_id INT,
    spacecraft_id INT,
    role NVARCHAR(50),
    PRIMARY KEY (astronaut_id, mission_id, spacecraft_id),
    FOREIGN KEY (astronaut_id) REFERENCES Astronauts(astronaut_id),
    FOREIGN KEY (mission_id) REFERENCES Missions(mission_id),
    FOREIGN KEY (spacecraft_id) REFERENCES Spacecrafts(spacecraft_id)
);


INSERT INTO Astronauts (astronaut_name, age, nationality, total_space_missions) VALUES
('Neil Armstrong', 82, 'American', 2),
('Buzz Aldrin', 91, 'American', 2),
('Yuri Gagarin', 34, 'Russian', 1),
('Sunita Williams', 58, 'American', 3),
('Rakesh Sharma', 75, 'Indian', 1);


INSERT INTO Missions (mission_name, launch_date, duration_days, mission_type) VALUES
('Apollo 11', '1969-07-16', 8, 'Exploration'),
('Vostok 1', '1961-04-12', 1, 'Exploration'),
('Expedition 14', '2006-09-18', 215, 'Research'),
('Soyuz T-11', '1984-04-03', 8, 'Scientific'),
('Artemis I', '2022-11-16', 25, 'Test Flight');


INSERT INTO Spacecrafts (spacecraft_name, capacity, manufacturer) VALUES
('Apollo Lunar Module', 2, 'NASA'),
('Vostok 1', 1, 'Soviet Union'),
('Soyuz T-11', 3, 'Russia'),
('International Space Station', 6, 'Multinational'),
('Orion', 4, 'NASA');


INSERT INTO Participation (astronaut_id, mission_id, spacecraft_id, role) VALUES
(1, 1, 1, 'Commander'),       
(2, 1, 1, 'Lunar Module Pilot'), 
(3, 2, 2, 'Pilot'),           
(4, 3, 4, 'Flight Engineer'),  
(5, 4, 3, 'Researcher');       



--1. Retrieve the distinct mission names where the mission lasted more than 30 days.
select distinct mission_name from Missions where duration_days > 30

--2. Retrieve the top 3 astronauts who participated in the most missions, ensuring no duplicates.
select top 3 astronaut_name,total_space_missions from Astronauts order by total_space_missions desc

--3. Insert a new space mission called "Jupiter Exploration" that is scheduled to launch on 
--'2024-11-01', lasting 365 days, and classified as an exploration mission.
insert into Missions (mission_name,launch_date,duration_days,mission_type) values ('Jupiter Exploration','2024-11-01',365,'exploration')
select * from Missions

--4. Update the total space missions count for astronaut with ID = 5, increasing it by 1.
update Astronauts set total_space_missions = total_space_missions + 1 where astronaut_id = 5 
select * from Astronauts

--5. Delete participation record for astronaut ID 3 in mission ID 2.
delete from Participation where astronaut_id = 3 AND mission_id = 2

--6. Add a new column experience_level (VARCHAR(50)) to the Astronauts table to 
--store the astronaut's experience level.
alter table Astronauts
	ADD experience_level VARCHAR(50)

--7. Clear all the data from the Participation table.(Truncate)
Truncate table Participation

--8. Retrieve all mission names where the mission type contains 'exploration'.
select mission_name from Missions where mission_type = 'exploration'

--9. Retrieve all missions that contain the word "Mars" and lasted more than 100 days.
select * from Missions where mission_name like '%mars%' AND duration_days > 100

--10. Retrieve the square root of the total number of missions for astronaut ID 102
select astronaut_name,astronaut_id,SQRT(cast(total_space_missions as float)) from Astronauts where astronaut_id = 102

--11. Retrieve the first 3 characters of each astronaut's name
select astronaut_name,SUBSTRING(astronaut_name,1,3) from Astronauts

--12. Retrieve the astronauts who participated in missions launched in the current year.
select a.astronaut_name,m.launch_date from Participation p
inner join Astronauts a on a.astronaut_id=p.astronaut_id 
inner join Missions m on a.astronaut_id=p.mission_id
where YEAR(m.launch_date) = YEAR(GETDATE())
--where m.launch_date between '01-01-2025' and '31-12-2025'

--13. Count the number of astronauts from each nationality who have participated in more than 2 space missions.
select COUNT(m.mission_id),a.nationality from Participation p 
inner join Astronauts a on a.astronaut_id = p.astronaut_id
inner join Missions m on m.mission_id=p.mission_id
group by a.nationality
having COUNT(m.mission_id) > 2

--14. Retrieve the total number of missions and the average mission duration for each 
--mission type, but only include mission types that have been involved in more than 3 missions.
select count(mission_id),avg(duration_days),mission_type
from Missions
group by mission_type
having count(mission_id)>3

--15. Find the number of missions commanded by astronauts for each nationality 
--where more than 5 missions were commanded
select COUNT(m.mission_id),a.nationality from Participation p
inner join Astronauts a on a.astronaut_id = p.astronaut_id
inner join Missions m on m.mission_id = p.mission_id
group by a.nationality
having COUNT(m.mission_id) > 5

--16. Retrieve the name of the spacecraft used in the mission "Apollo 11" (Use sub Query)
SELECT spacecraft_name
FROM Spacecrafts
WHERE spacecraft_id IN (
    SELECT spacecraft_id
    FROM Participation
    WHERE mission_id = (
        SELECT mission_id 
        FROM Missions 
        WHERE mission_name = 'Apollo 11'
    )
);

--17. Create a view that shows all active missions (those that launched after 2020).
select * from Missions where launch_date > '2020-12-31';
--18. List all astronauts and their respective spacecraft for each mission they participated in.
select a.astronaut_name,s.spacecraft_name,m.mission_name from Participation p
inner join Astronauts a on a.astronaut_id=p.astronaut_id
inner join Missions m on m.mission_id=p.mission_id
inner join Spacecrafts s on s.spacecraft_id=p.spacecraft_id

--19. Retrieve the names of astronauts who participated in missions using spacecrafts manufactured by 
--"SpaceX", along with the names of those missions and the duration of each mission. 
--Include only astronauts who have participated in more than 2 missions.
SELECT a.astronaut_name, m.mission_name, m.duration_days
FROM Participation p
INNER JOIN Astronauts a ON a.astronaut_id = p.astronaut_id
INNER JOIN Missions m ON m.mission_id = p.mission_id
INNER JOIN Spacecrafts s ON s.spacecraft_id = p.spacecraft_id
WHERE s.manufacturer = 'SpaceX' AND a.astronaut_id IN (SELECT astronaut_id FROM Participation GROUP BY astronaut_id HAVING COUNT(*) > 2)


--20. Retrieve the names of astronauts, the names of missions they participated in, the names of 
--spacecraft used in those missions, and the manufacturers of those spacecraft, for missions where 
--the mission duration is greater than the average duration of all missions conducted by astronauts 
--from the "USA"
SELECT a.astronaut_name, m.mission_name, s.spacecraft_name, s.manufacturer
FROM Participation p
INNER JOIN Astronauts a ON a.astronaut_id = p.astronaut_id
INNER JOIN Missions m ON m.mission_id = p.mission_id
INNER JOIN Spacecrafts s ON s.spacecraft_id = p.spacecraft_id
WHERE m.duration_days > (
    SELECT AVG(m2.duration_days)
    FROM Participation p2
    INNER JOIN Astronauts a2 ON a2.astronaut_id = p2.astronaut_id
    INNER JOIN Missions m2 ON m2.mission_id = p2.mission_id
    WHERE a2.nationality = 'USA'
);
