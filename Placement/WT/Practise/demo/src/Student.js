import React, { useEffect, useState } from "react";

function Student() {
  const [student, setStudent] = useState([]);
  const [editStudent, setEditStudent] = useState([]);

  const [newStudent, setNewStudent] = useState({
    name: "",
    gender: "",
    course: "",
  });
  
  const fetchData = async () => {
    const data = await fetch("http://localhost:5000/api/student/show");
    const response = await data.json();
    setStudent(response);
  };

  useEffect(() => {
    fetchData();
  }, []);

  const onHandelInputChange = (e) => {
    setNewStudent({
      ...newStudent,
      [e.target.name]: e.target.value,
    });
  };
  
  const onEditHandelInputChange = (e) => {
    setEditStudent({
      ...editStudent,
      [e.target.name]: e.target.value,
    });
  };

  const handelEditDetails = (data) =>{
    setEditStudent(data)
  }

  const addStudent = async () => {
    try {
      const response = await fetch("http://localhost:5000/api/student/add", {
        method: "POST",
        headers: { "Content-Type": "application/json" },
        body: JSON.stringify(newStudent),
      });
      if (response.ok) {
        fetchData();
        setNewStudent({
          name: "",
          gender: "",
          course: "",
        });
      }
    } catch (error) {
      const data = await error.json();
      console.log("Error Adding : " + data);
    }
  };

  const deleteStudent = async(id)=>{
    try {
        const response = await fetch(`http://localhost:5000/api/student/delete/${id}`,{
            method:"DELETE",
            headers:{"Content-Type":"application/json"}
        });
        if (response.ok) {
            fetchData();
        }
    } catch (error) {
        const data = await error.json();
        console.log("Error Deleting : "+ data);
    }
  }

  const updateStudent = async() =>{
    try {
        const response = await fetch(`http://localhost:5000/api/student/update/${editStudent._id}`,{
            method:"PUT",
            headers:{"Content-Type":"application/json"},
            body:JSON.stringify(editStudent)
        });
        if (response.ok) {
            fetchData();
            setEditStudent(null);
        }
    } catch (error) {
        const response = await error.json();
        console.log("Error Updating : "+response);
    }
  }


  return (
    <>
      <div className="container">
        <h1>Add Student Data</h1>
        <form>
          <div className="mb-3">
            <label htmlFor="name" className="form-label">Name</label>
            <input type="text" className="form-control" name="name" onChange={onHandelInputChange} value={newStudent.name} placeholder="Enter Name" required/>
          </div>
          <label>Gender</label>
          <div className="form-check">
            <input className="form-check-input" onChange={onHandelInputChange} type="radio" name="gender" value="Male" checked={newStudent.gender == "Male"} defaultChecked/>
            <label className="form-check-label" htmlFor="male">{" "}Male{" "}
            </label>
          </div>
          <div className="form-check mb-3">
            <input className="form-check-input" type="radio" onChange={onHandelInputChange} name="gender" value="Female" checked={newStudent.gender == "Female"}/>
            <label className="form-check-label" htmlFor="female">{" "}Female{" "}
            </label>
          </div>
          <div className="mb-3">
            <label htmlFor="course" className="form-label">Course</label>
            <input type="text" className="form-control" onChange={onHandelInputChange} name="course" value={newStudent.course} placeholder="Enter course" required/>
          </div>
          <button type="submit" onClick={(e) => {e.preventDefault(); addStudent();}} className="btn btn-primary">Submit</button>
        </form>

        {
            editStudent && (
                <form>
                    <div className="mb-3">
                        <label htmlFor="name" className="form-label">Name</label>
                        <input type="text" className="form-control" name="name" onChange={onEditHandelInputChange} value={editStudent.name} placeholder="Enter Name" required/>
                    </div>
                    <label>Gender</label>
                    <div className="form-check">
                        <input className="form-check-input" onChange={onEditHandelInputChange} type="radio" name="gender" value="Male" checked={editStudent.gender == "Male"} defaultChecked/>
                        <label className="form-check-label" htmlFor="male">{" "}Male{" "}
                        </label>
                    </div>
                    <div className="form-check mb-3">
                        <input className="form-check-input" type="radio" onChange={onEditHandelInputChange} name="gender" value="Female" checked={editStudent.gender == "Female"}/>
                        <label className="form-check-label" htmlFor="female">{" "}Female{" "}
                        </label>
                    </div>
                    <div className="mb-3">
                        <label htmlFor="course" className="form-label">Course</label>
                        <input type="text" className="form-control" onChange={onEditHandelInputChange} name="course" value={editStudent.course} placeholder="Enter course" required/>
                    </div>
                <button type="submit" onClick={(e) => {e.preventDefault(); updateStudent();}} className="btn btn-primary">Save</button>
                </form>
            )
        }

        <table className="table table-striped mt-5">
          <thead>
            <tr>
              <th>Name</th>
              <th>Gender</th>
              <th>Course</th>
              <th>Action</th>
            </tr>
          </thead>
          <tbody>
            {student.map((s) => (
              <tr key={s._id}>
                <td>{s.name}</td>
                <td>{s.gender}</td>
                <td>{s.course}</td>
                <td>
                  <button onClick={()=>handelEditDetails(s)} className="btn btn-primary">Edit</button>
                </td>
                <td>
                  <button onClick={()=>deleteStudent(s._id)} className="btn btn-danger">Delete</button>
                </td>
              </tr>
            ))}
          </tbody>
        </table>
      </div>
    </>
  );
}

export default Student;
