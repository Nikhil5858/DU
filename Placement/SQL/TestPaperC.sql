-- ==============================
-- Table 1: MovieDetails
-- ==============================
CREATE TABLE MovieDetails (
    MovieID INT PRIMARY KEY, 
    Title VARCHAR(100) NOT NULL, 
    Genre VARCHAR(100), 
    Director VARCHAR(100), 
    ReleaseYear INT
);

-- ==============================
-- Table 2: MovieFinancials
-- ==============================
CREATE TABLE MovieFinancials (
    FinancialID INT PRIMARY KEY, 
    BudgetUSD DECIMAL(15,2), 
    BoxOfficeUSD DECIMAL(15,2), 
    MovieID INT,
    FOREIGN KEY (MovieID) REFERENCES MovieDetails(MovieID)
);

-- ==========================================
-- Table 3: MovieRatingsDuration
-- ==========================================
CREATE TABLE MovieRatingsDuration (
    RatingID INT PRIMARY KEY,
    DurationMin INT CHECK (DurationMin > 0),
    Rating DECIMAL(3,1),             -- supports 0.0 to 10.0
    Language VARCHAR(100),
    Country VARCHAR(100),
    MovieID INT NOT NULL,
    CONSTRAINT FK_MovieRatings_Movie
        FOREIGN KEY (MovieID) REFERENCES MovieDetails(MovieID)
);
-- ==============================
-- Sample Data Insertions
-- ==============================

-- Insert into MovieDetails
INSERT INTO MovieDetails (MovieID, Title, Genre, Director, ReleaseYear) VALUES
(1, 'The Godfather', 'Crime, Drama', 'Francis Ford Coppola', 1972),
(2, 'Inception', 'Action, Sci-Fi', 'Christopher Nolan', 2010),
(3, 'Parasite', 'Drama, Thriller', 'Bong Joon-ho', 2019),
(4, 'Avengers: Endgame', 'Action, Adventure, Sci-Fi', 'Anthony Russo, Joe Russo', 2019);

-- Insert into MovieFinancials
INSERT INTO MovieFinancials (FinancialID, BudgetUSD, BoxOfficeUSD, MovieID) VALUES
(1, 6000000.00, 250000000.00, 1),  -- The Godfather
(2, 160000000.00, 829895144.00, 2), -- Inception
(3, 11400000.00, 263000000.00, 3), -- Parasite
(4, 356000000.00, 2797800564.00, 4); -- Avengers: Endgame



INSERT INTO MovieRatingsDuration (RatingID, DurationMin, Rating, Language, Country, MovieID) VALUES
(1, 175, 9.2, 'English','USA',1),  
(2, 148, 8.8, 'English','USA',2), 
(3, 132, 8.6, 'Korean','South Korea',
3),
(4, 181, 8.4, 'English','USA',4);


--1. Retrive first five distinct movies along with their title from MovieDetails table.
select distinct top 5 Title from MovieDetails 

--2. Display the total of the BudgetUSD and BoxOfficeUSD assign the name TotalUSD from
--MovieFinancials.
select BudgetUSD+BoxOfficeUSD as TotalUSD from MovieFinancials

--3. Insert the new row with this data (11,The Incredible Hulk, Action, Louis Leterrier,2008) in
--MovieDetails table.
insert into MovieDetails (MovieID,Title,Genre,Director,ReleaseYear) values (11,'The Incredible Hulk', 'Action', 'Louis Leterrier',2008)

--4. Set the value of the genre to 'Action' of 'Avengers:Endgame' movie from MovieDetails table.
update MovieDetails set genre = 'Action' where Title = 'Avengers:Endgame'

--5. Delete the records with duration of 181 minutes from MovieRatingsDuration table.
delete from MovieRatingsDuration where DurationMin = 181

--6. Add a new column 'Producer' into the MovieDetails table.
alter table MovieDetails
add Producer varchar(100)

--7. Delete records of MovieFinancials table without removing its table structure.
DELETE FROM MovieFinancials;

--8. Retrive all the movies from MovieDetails table with title starting with 'The'.
select * from MovieDetails where Title like 'The%'

--9. Retrive name of directors includes 'son' from MovieDetails table.
select Director from MovieDetails where Director like '%son%'

--10. Convert and display title of all movies in uppercase.
select UPPER(Title) from MovieDetails

--11. Display the highest rating from the MovieRatingsDuration table.
select MAX(Rating) from MovieRatingsDuration

--12. Calculate the years between current year and movies release year.
SELECT Title, (YEAR(GETDATE()) - ReleaseYear) AS YearsDifference 
FROM MovieDetails;

--13. Find the languages in which movies have an average rating of greater than 8.0. Display the language
--and the average rating.
select [Language],Rating from MovieRatingsDuration group by [Language] having Rating > 8.0

--14. Retrieve the minimum, maximum, and average movie duration for each language in the
--MovieRatingsDuration table, but display only those languages where the average rating is greater
--than 7.5.
select min(DurationMin),max(DurationMin),avg(DurationMin) from MovieRatingsDuration 
group by [Language]
having Rating > 7.5

--15. Find the titles of movies whose budget is higher than the average budget of all movies.
--(Do not use JOINS)
SELECT Title 
FROM MovieDetails 
WHERE MovieID IN (
    SELECT MovieID 
    FROM MovieFinancials 
    WHERE BudgetUSD > (SELECT AVG(BudgetUSD) FROM MovieFinancials)
);


--16. Find the titles of movies that have a box office revenue greater than the average box office revenue
--of all movies.


--17. Create a view with Rating, Language and Country columns with no data and named it MovieReview.
--18. List all movies that have the same director but different genres, displaying the director’s name, both
--movie titles, and their respective genres.
--19. Retrieve the title, director, and box office earnings for all movies that were released after 2010, along
--with their ratings.
--20. List all directors and the number of movies they have directed, but only include directors who have
--directed more than 1 movie.