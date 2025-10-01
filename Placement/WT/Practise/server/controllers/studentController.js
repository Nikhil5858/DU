const express = require('express');
const app = express();
const Student = require('../models/student');

const addStudent = async (req,res)=>{
    const data = req.body;
    try {
        const student = new Student(data);
        const response = await student.save();
        res.status(200).json(response);
    } catch (error) {
        res.status(400).json({error:error.message});
    }
}

const showStudent = async (req,res)=>{
    try {
        const data = await Student.find();
        res.status(200).json(data) 
    } catch (error) {
        res.status(400).json({error:error.message})
    }
}

const deleteStudent = async(req,res)=>{
    const {id}= req.params;
    try {
        const data = await Student.findByIdAndDelete(id);
        res.status(200).json(data);
    } catch (error) {
        res.status(400).json({error:error.message})
    }
}

const updateStudent = async(req,res)=>{
    const {id} = req.params;
    const data = req.body;
    try {
        const newdata = await Student.findByIdAndUpdate(id,data,{new:true})
        res.status(200).json(newdata);
    } catch (error) {
        res.status(400).json({error:error.message})
    }
}

module.exports = {addStudent,showStudent,updateStudent,deleteStudent};