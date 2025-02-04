import React from 'react';
import Button from 'react-bootstrap/Button';
import Card from 'react-bootstrap/Card';

function Faculties() {
    const facultis = [
        {
            factId: 1,
            img: "https://du-website.s3.ap-south-1.amazonaws.com/U01/Faculty-Photo/5---29-04-2023-11-00-29.jpg",
            name: "Dr. Gopi Sanghani",
            designation: "Dean",
            degree: "Ph.D. , M.E. (CE)",
            experiance: "24 Years"
        },
        {
            factId: 2,
            img: "https://du-website.s3.ap-south-1.amazonaws.com/U01/Faculty-Photo/3---28-04-2023-02-02-42.jpg",
            name: "Dr. Nilesh Gambhava",
            designation: "Professor",
            degree: "Ph.D. , M.E. (CE)",
            experiance: "21 Years"
        },
        {
            factId: 3,
            img: "https://du-website.s3.ap-south-1.amazonaws.com/U01/Faculty-Photo/6---28-04-2023-02-06-07.jpg",
            name: "Dr. Pradyumansinh Jadeja",
            designation: "Professor",
            degree: "Ph.D., M.E. (CE)",
            experiance: "19 Years"
        },
        {
            factId: 4,
            img: "https://du-website.s3.ap-south-1.amazonaws.com/U01/Faculty-Photo/12---28-04-2023-02-06-51.jpg",
            name: "Prof. Firoz Sherasiya",
            designation: "Assistant Professor",
            degree: "Ph.D.(Pursuing), M.E. (CE)",
            experiance: "20 Years"
        },
        {
            factId: 5,
            img: "https://du-website.s3.ap-south-1.amazonaws.com/U01/Faculty-Photo/11---29-04-2023-01-44-21.jpg",
            name: "Prof. Swati Sharma",
            designation: "Assistant Professor",
            degree: "PhD(Pursuing), M.Tech. (CSE",
            experiance: "16 Years"
        },
        {
            factId: 6,
            img: "https://du-website.s3.ap-south-1.amazonaws.com/U01/Faculty-Photo/335---01-05-2024-07-40-49.JPG",
            name: "Prof. Dharmik Vasiyani",
            designation: "Assistant Professor",
            degree: "ME(CE)",
            experiance: "7 Years"
        },
        {
            factId: 7,
            img: "https://du-website.s3.ap-south-1.amazonaws.com/U01/Faculty-Photo/359---29-04-2023-01-45-32.jpg",
            name: "Prof. Devangi Kotak",
            designation: "Assistant Professor",
            degree: "M. Tech(CS), BE(IT), Diploma I.T.",
            experiance: "16 Years"
        },
        {
            factId: 8,
            img: "https://du-website.s3.ap-south-1.amazonaws.com/U01/Faculty-Photo/10---28-04-2023-02-07-03.jpg",
            name: "Prof. Rupesh Vaishnav",
            designation: "Assistant Professor",
            degree: "Ph.D. (Pursuing), M.E. (CE)",
            experiance: "16 Years"
        },
        {
            factId: 9,
            img: "https://du-website.s3.ap-south-1.amazonaws.com/U01/Faculty-Photo/219---28-04-2023-02-09-01.jpg",
            name: "Prof. Jayesh Vagadiya",
            designation: "Assistant Professor",
            degree: "M.E (CE)",
            experiance: "9 Years"
        },
        {
            factId: 10,
            img: "https://du-website.s3.ap-south-1.amazonaws.com/U01/Faculty-Photo/290---28-04-2023-02-09-16.jpg",
            name: "Prof. Krunal Vyas",
            designation: "Assistant Professor",
            degree: "Ph.D. (Pursuing), M.Tech. (ICT)",
            experiance: "11 Years"
        },
        {
            factId: 11,
            img: "https://du-website.s3.ap-south-1.amazonaws.com/U01/Faculty-Photo/331---28-04-2023-01-33-39.jpg",
            name: "Prof. Madhuresh Fichadiya",
            designation: "Assistant Professor",
            degree: "B.E.(CE)",
            experiance: "3 Years"
        },
        {
            factId: 12,
            img: "https://du-website.s3.ap-south-1.amazonaws.com/U01/Faculty-Photo/336---28-04-2023-01-34-37.jpg",
            name: "Prof. Shruti Maniar",
            designation: "Assistant Professor",
            degree: "ME(CE),BE(IT)",
            experiance: "8 Years"
        }
    ];

    return (
        <div className="container">
            <div className="row">
                {facultis.map((fact) => (
                    <div className="col-md-4 p-3 mt-2" key={fact.factId}>
                        <Card style={{ width: '18rem' }}>
                            <Card.Img variant="top" src={fact.img} />
                            <Card.Body>
                                <Card.Title>{fact.name}</Card.Title>
                                <Card.Text>{fact.designation}</Card.Text>
                                <Card.Text>{fact.degree}</Card.Text>
                                <Button variant="primary">{fact.experiance}</Button>
                            </Card.Body>
                        </Card>
                    </div>
                ))}
            </div>
        </div>
    );
}

export default Faculties;
