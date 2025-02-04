import React from "react";
import Button from "react-bootstrap/Button";
import Card from "react-bootstrap/Card";

function Student() {
  const students = [
    {
      name: "John Doe",
      img: "https://www.shutterstock.com/image-vector/young-man-anime-style-character-600nw-2240084827.jpg",
      grade: "A",
      major: "Computer Science",
      year: "Senior",
    },
    {
      name: "Jane Smith",
      img: "https://www.shutterstock.com/image-vector/young-man-anime-style-character-600nw-2240084827.jpg",
      grade: "B+",
      major: "Mathematics",
      year: "Junior",
    },
    {
      name: "Alice Johnson",
      img: "https://www.shutterstock.com/image-vector/young-man-anime-style-character-600nw-2240084827.jpg",
      grade: "A-",
      major: "Physics",
      year: "Sophomore",
    },
    {
      name: "Bob Brown",
      img: "https://www.shutterstock.com/image-vector/young-man-anime-style-character-600nw-2240084827.jpg",
      grade: "B",
      major: "Biology",
      year: "Freshman",
    },
    {
      name: "Charlie Davis",
      img: "https://www.shutterstock.com/image-vector/young-man-anime-style-character-600nw-2240084827.jpg",
      grade: "A",
      major: "Chemistry",
      year: "Senior",
    },
    {
      name: "Diana Evans",
      img: "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTR1P5XCF8uxciQYtj0bJGCm6OQh9ZRD_z0Zw&s",
      grade: "B+",
      major: "Engineering",
      year: "Junior",
    },
    {
      name: "Ethan Harris",
      img: "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTR1P5XCF8uxciQYtj0bJGCm6OQh9ZRD_z0Zw&s",
      grade: "A-",
      major: "Economics",
      year: "Sophomore",
    },
    {
      name: "Fiona Clark",
      img: "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTR1P5XCF8uxciQYtj0bJGCm6OQh9ZRD_z0Zw&s",
      grade: "B",
      major: "Psychology",
      year: "Freshman",
    },
    {
      name: "George Lewis",
      img: "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTR1P5XCF8uxciQYtj0bJGCm6OQh9ZRD_z0Zw&s",
      grade: "A",
      major: "History",
      year: "Senior",
    },
  ];
  return (
    <>
      <div className="container">
        <div className="row">
          {students.map((stu) => (
            <div className="col-md-4 p-3">
              <Card style={{ width: "18rem" }}>
                <Card.Img variant="top" src={stu.img} />
                <Card.Body>
                  <Card.Title>{stu.name}</Card.Title>
                  <Card.Text>{stu.grade}</Card.Text>
                  <Card.Text>{stu.major}</Card.Text>
                  <Button variant="primary">{stu.year}</Button>
                </Card.Body>
              </Card>
            </div>
          ))}
        </div>
      </div>
    </>
  );
}

export default Student;
