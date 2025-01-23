const express = require('express')
const app = express()

const Student = require('../models/student')

const addStudent = async (req,res)=>{
    const data = req.body;
    try {
        const student = new Student(data);
        const addstudents = await student.save()
        res.status(200).json(addstudents) 
    } catch (error) {
        res.status(400).json({error:error.message})
    }
}

const findStudent = async(req,res)=>{
    try {
        const studentfind = await Student.find();
        res.status(200).json(studentfind)        
    } catch (error) {
        res.status(400).json({error:error.message})
    }
}

const findStudentById = async(req,res)=>{
    const {id} = req.params;

    try {
        const studentById = await Student.findById(id)
        res.status(200).json(studentById); 
    } catch (error) {
        res.status(400).json({error:error.message})
    }
}

const deleteStudentByid = async(req,res)=>{
    const {id} = req.params;
    try {
        const deleteStudentById = await Student.findByIdAndDelete(id)
        res.status(200).json(deleteStudentById); 
    } catch (error) {
        res.status(400).json({error:error.message})
    }
}

const updateStudentByid = async(req,res)=>{
    const {id} = req.params;
    const data = req.body;
    try {
        const updateStudentById = await Student.findByIdAndUpdate(id,data ,{new:true})
        res.status(200).json(updateStudentById); 
    } catch (error) {
        res.status(400).json({error:error.message})
    }
}



module.exports = {addStudent,findStudent,findStudentById,deleteStudentByid,updateStudentByid}