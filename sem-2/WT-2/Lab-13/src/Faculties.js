import React, { useState } from 'react';
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

    const [faculty, setfaculty] = useState(facultis)
    const [editFaculty,setEditFaculty] = useState(null)

    const [newfaculty, setnewfaculty] = useState({
        factId: 0,
        img: "",
        name: "",
        designation: "",
        degree: "",
        experiance: ""
    });

    const handelEditDetails = (faculty) =>{
        setEditFaculty(faculty)
    }

    const handelInputChange = (e) => {
        setnewfaculty({
            ...newfaculty,
            [e.target.name]: e.target.value
        });
    };

    const handelEditInputChange = (e) => {
        setEditFaculty({
            ...editFaculty,
            [e.target.name]: e.target.value
        });
    };

    const addFaculty = () => {
        setfaculty([
            ...faculty,
            { ...newfaculty, factId: faculty[faculty.length - 1].factId + 1 }
        ]);
        setnewfaculty({
            factId: 0,
            img: "",
            name: "",
            designation: "",
            degree: "",
            experiance: ""
        });
    };

    const updateFaculty = () =>{
        setfaculty((prev)=>
            prev.map((fac)=> (fac.factId === editFaculty.factId ? editFaculty:fac))
        )
        setEditFaculty(null)
    }

    return (
        
        <div className="container">

            <button type="button" className="btn btn-primary float-lg-end sticky-top mt-4" data-bs-toggle="modal" data-bs-target="#addfacultydata" data-whatever="@mdo">Add Faculty</button>

            <div className="row">
                <div className="modal fade" id="addfacultydata" tabIndex="-1" role="dialog" aria-labelledby="exampleModalLabel" aria-hidden="true">
                    <div className="modal-dialog" role="document">
                        <div className="modal-content">
                            <div className="modal-header">
                                <h5 className="modal-title" id="exampleModalLabel">Add Faculty Data</h5>
                            </div>
                            <div className="modal-body">
                                <form>
                                    <div className="mb-2">
                                        <label className="form-label">Add Faculty Name : </label>
                                        <input className="form-control form-control-md" onChange={handelInputChange} value={newfaculty.name} name="name" required type="text" aria-label=".form-control-sm example" />
                                    </div>
                                    <div className="mb-2">
                                        <label className="form-label">Add Designation : </label>
                                        <input className="form-control form-control-md" onChange={handelInputChange} value={newfaculty.designation} name="designation" required type="text" aria-label=".form-control-sm example" />
                                    </div>
                                    <div className="mb-2">
                                        <label className="form-label">Add Degree : </label>
                                        <input className="form-control form-control-md" onChange={handelInputChange} value={newfaculty.degree} name="degree" required type="text" aria-label=".form-control-sm example" />
                                    </div>
                                    <div className="mb-2">
                                        <label className="form-label">Add Experiance : </label>
                                        <input className="form-control form-control-md" onChange={handelInputChange} value={newfaculty.experiance} name="experiance" required type="text" aria-label=".form-control-sm example" />
                                    </div>
                                    <div className="mb-2">
                                        <label className="form-label">Add Image Url : </label>
                                        <input className="form-control form-control-md" onChange={handelInputChange} value={newfaculty.img} name="img" required type="text" aria-label=".form-control-sm example" />
                                    </div>
                                    <div className="modal-footer">
                                        <button type="button" className="btn btn-secondary" data-bs-dismiss="modal">Close</button>
                                        <button type="button" onClick={()=> addFaculty()} className="btn btn-primary">Send message</button>
                                    </div>
                                </form>
                            </div>
                        </div>
                    </div>
                </div>

                {editFaculty  &&  (
                    <form className='border mt-4'>
                    <h1 className='justify-content-center d-flex mt-2'>Faculty Data</h1>
                    <div className="mb-2">
                        <label className="form-label">Edit Faculty Name : </label>
                        <input className="form-control form-control-md" value={editFaculty.name} onChange={handelEditInputChange} type="text" name="name" aria-label=".form-control-sm example"/>
                    </div>
                    <div className="mb-2">
                        <label className="form-label">Edit Designation : </label>
                        <input className="form-control form-control-md" value={editFaculty.designation} onChange={handelInputChange} type="text" name="designation" aria-label=".form-control-sm example"/>
                    </div>
                    <div className="mb-2">
                        <label className="form-label">Edit Degree : </label>
                        <input className="form-control form-control-md" value={editFaculty.degree} onChange={handelInputChange} type="text" name="degree" aria-label=".form-control-sm example"/>
                    </div>
                    <div className="mb-2">
                        <label className="form-label">Edit Experiance : </label>
                        <input className="form-control form-control-md" type="text" value={editFaculty.experiance} name="experiance" onChange={handelInputChange}aria-label=".form-control-sm example"/>
                    </div>
                    <div className="mb-2">
                        <label className="form-label">Edit Image Url : </label>
                        <input className="form-control form-control-md" type="text" value={editFaculty.img} name="img" onChange={handelInputChange}aria-label=".form-control-sm example"/>
                    </div>
                   
                    <button type="submit" onClick={()=>updateFaculty()} className="btn btn-primary mb-3 mt-3 d-grid gap-2 col-6 mx-auto">Submit</button>
                </form>)}
                {/* <form className='border mt-4'>
                    <h1 className='justify-content-center d-flex mt-2'>Faculty Data</h1>
                    <div className="mb-2">
                        <label className="form-label">Add Faculty Name : </label>
                        <input className="form-control form-control-md" type="text" aria-label=".form-control-sm example"/>
                    </div>
                    <div className="mb-2">
                        <label className="form-label">Add Designation : </label>
                        <input className="form-control form-control-md" type="text" aria-label=".form-control-sm example"/>
                    </div>
                    <div className="mb-2">
                        <label className="form-label">Add Degree : </label>
                        <input className="form-control form-control-md" type="text" aria-label=".form-control-sm example"/>
                    </div>
                    <div className="mb-2">
                        <label className="form-label">Add Experiance : </label>
                        <input className="form-control form-control-md" type="text" aria-label=".form-control-sm example"/>
                    </div>
                    <div className="mb-2">
                        <label className="form-label">Add Image Url : </label>
                        <input className="form-control form-control-md" type="text" aria-label=".form-control-sm example"/>
                    </div>
                   
                    <button type="submit" className="btn btn-primary mb-3 mt-3 d-grid gap-2 col-6 mx-auto">Submit</button>
                </form> */}

                {faculty.map((fact) => (
                    <div className="col-md-4 p-3 mt-2" key={fact.factId}>
                        <Card style={{ width: '18rem' }}>
                            <Card.Img variant="top" src={fact.img} />
                            <Card.Body>
                                <Card.Title>{fact.name}</Card.Title>
                                <Card.Text>{fact.designation}</Card.Text>
                                <Card.Text>{fact.degree}</Card.Text>
                                <Button variant="primary">{fact.experiance}</Button>
                                <button className='btn btn-primary ms-4' onClick={() => handelEditDetails(fact)}>Edit</button>
                            </Card.Body>
                        </Card>
                    </div>
                ))}
            </div>
        </div>
    );
}

export default Faculties;
