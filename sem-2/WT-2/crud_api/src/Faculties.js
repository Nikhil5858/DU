import React, { useState } from 'react';
import Button from 'react-bootstrap/Button';
import Card from 'react-bootstrap/Card';
import {useEffect} from 'react'


function Faculties() {

    const [faculty, setfaculty] = useState([])
    const [editFaculty,setEditFaculty] = useState(null)

    const API_URl = "https://67b41442392f4aa94fa930eb.mockapi.io/api/faculties"

    const [newfaculty, setnewfaculty] = useState({
        factId: 0,
        img: "",
        name: "",
        designation: "",
        degree: "",
        experiance: ""
    });

    const fetchData = async () =>{
        const response = await fetch(API_URl)
        const data = await response.json()
        setfaculty(data)
    }

    useEffect(()=>{
        fetchData()
    },[])
    
    
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

    const deleteFaculty = async (factId) =>{
        await fetch(API_URl + "/" + factId,{method:"DELETE"} )    
        // setfaculty((prev)=>prev.filter((fac)=>fac.factId !== factId))
        fetchData()
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
                        <input className="form-control form-control-md" value={editFaculty.designation} onChange={handelEditInputChange} type="text" name="designation" aria-label=".form-control-sm example"/>
                    </div>
                    <div className="mb-2">
                        <label className="form-label">Edit Degree : </label>
                        <input className="form-control form-control-md" value={editFaculty.degree} onChange={handelEditInputChange} type="text" name="degree" aria-label=".form-control-sm example"/>
                    </div>
                    <div className="mb-2">
                        <label className="form-label">Edit Experiance : </label>
                        <input className="form-control form-control-md" type="text" value={editFaculty.experiance} name="experiance" onChange={handelEditInputChange}aria-label=".form-control-sm example"/>
                    </div>
                    <div className="mb-2">
                        <label className="form-label">Edit Image Url : </label>
                        <input className="form-control form-control-md" type="text" value={editFaculty.img} name="img" onChange={handelEditInputChange  }aria-label=".form-control-sm example"/>
                    </div>
                   
                    <button type="submit" onClick={()=>updateFaculty()} className="btn btn-primary mb-3 mt-3 d-grid gap-2 col-6 mx-auto">Submit</button>
                </form>)}

                {faculty.map((fact) => (
                    <div className="col-md-4 p-3 mt-2" key={fact.factId}>
                        <Card style={{ width: '18rem' }}>
                            <Card.Img variant="top" src={fact.img} />
                            <Card.Body>
                                <Card.Title>{fact.name}</Card.Title>
                                <Card.Text>{fact.designation}</Card.Text>
                                <Card.Text>{fact.degree}</Card.Text>
                                <Button variant="primary">{fact.experiance}</Button>
                                <button className='btn btn-warning ms-3' onClick={() => handelEditDetails(fact)}>Edit</button>
                                <button className='btn btn-danger ms-3' onClick={() => deleteFaculty(fact.factId)}>Delete</button>
                            </Card.Body>
                        </Card>
                    </div>
                ))}
            </div>
        </div>
    );
}

export default Faculties;
