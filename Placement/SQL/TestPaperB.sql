CREATE TABLE Stadium (
    stadium_id INT PRIMARY KEY,
    stadium_name VARCHAR(100),
    stadium_city VARCHAR(100),
    stadium_capacity INT
);

-- Insert sample data
INSERT INTO Stadium (stadium_id, stadium_name, stadium_city, stadium_capacity) VALUES
(1, 'Wankhede Stadium', 'Mumbai', 33000),
(2, 'Eden Gardens', 'Kolkata', 66000),
(3, 'M. Chinnaswamy Stadium', 'Bengaluru', 40000);

CREATE TABLE Team (
    team_id INT PRIMARY KEY,
    team_name VARCHAR(100),
    team_coach VARCHAR(100),
    team_wins INT,
    team_total_matches INT,
    home_stadium_id INT,
    FOREIGN KEY (home_stadium_id) REFERENCES Stadium(stadium_id)
);

-- Insert sample data
INSERT INTO Team (team_id, team_name, team_coach, team_wins, team_total_matches, home_stadium_id) VALUES
(1, 'Mumbai Indians', 'Mark Boucher', 110, 180, 1),
(2, 'Kolkata Knight Riders', 'Chandrakant Pandit', 100, 180, 2),
(3, 'Royal Challengers Bangalore', 'Andy Flower', 90, 180, 3);

CREATE TABLE Player (
    player_id INT PRIMARY KEY,
    player_first_name VARCHAR(50),
    player_last_name VARCHAR(50),
    team_id INT,
    player_role VARCHAR(50),
    player_jersey_number INT,
    player_matches_played INT,
    FOREIGN KEY (team_id) REFERENCES Team(team_id)
);

-- Insert sample data
INSERT INTO Player (player_id, player_first_name, player_last_name, team_id, player_role, player_jersey_number, player_matches_played) VALUES
(1, 'Rohit', 'Sharma', 1, 'Batsman', 45, 170),
(2, 'Jasprit', 'Bumrah', 1, 'Bowler', 93, 120),
(3, 'Shreyas', 'Iyer', 2, 'Batsman', 41, 100),
(4, 'Andre', 'Russell', 2, 'All-rounder', 12, 125),
(5, 'Virat', 'Kohli', 3, 'Batsman', 18, 180),
(6, 'Mohammed', 'Siraj', 3, 'Bowler', 13, 95);


--1. Retrieve Unique Roles of Players.
select distinct player_role from Player

--2. Calculate the winning percentage of each team.
SELECT team_name,(CAST(team_wins AS FLOAT) / team_total_matches) * 100 AS winning_percentage
FROM Team;


--3. Insert a new record to Stadium Table. (2, Wankhede Stadium, Mumbai,33000)
insert into Stadium (stadium_id,stadium_name,stadium_city,stadium_capacity) values (4, 'Wankhede Stadium', 'Mumbai',33000)

--4. Update Team Coach Name of Team RCB to Ashish Nehra.
update Team set team_coach = 'Ashish Nehra' where team_name = 'RCB'

--5. Delete All the Records of Player Shikhar Dhawan.
delete from Player where player_first_name='Shikhar Dhawan'

--6. Change the size of stadium_name column from VARCHAR (100) to VARCHAR (15).
alter table Stadium
alter column stadium_name VARCHAR (15)

--7. Remove Player Table.
drop table Player

--8. Display Top 30 Players Whose First Name Starts with Vowel.
select top 30 * from Players where player_first_name NOT like '[aeiouAEIOU]%'

--9. Display City Whose Stadium Name does not Ends with ‘M’.
select stadium_city from Stadium like '%m'

--10. Generate Random Number between 0 to 100.
SELECT FLOOR(RAND() * 101) AS random_number;

--11. Display 4th to 9th Character of ‘Virat Kohli’.
	

--12. Display The Day of week on 01-01-2005.
--13. Display City Wise Maximum Stadium Capacity.
--14. Display City Whose Average Stadium Capacity is Above 20000.
--15. Display All Players Full Name, Jersey No and Role Who is Playing for Mumbai Indians. (Using Sub
--query).
--16. Display Team Name Having Home Stadium Capacity Over 50000. (Using Sub query ).
--17. Create a View Players_Above_100_Matches of Players Who have Played More than 100 Matches.
--18. Get the Player name, Team name, and their Jersey number who have played Between than 50 to
--100 matches.
--19. Produce Output Like: <PlayerFirstName> Plays For <TeamName> and Has Played <PlayerMatches>
--matches. (In single column)
--20. Display Stadium Capacity of Team CSK