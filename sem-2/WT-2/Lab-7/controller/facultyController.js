const express = require('express')
const app = express();

const Faculty = require('../models/faculty')

const addFaculty = async(req,res)=>{
    const data = req.body
    try {
        const faculty = new Faculty(data)
        const facultyData = await faculty.save()
        res.status(201).json(facultyData) 
    } catch (error) {
        res.status(400).json({ error: err.message });
    }
}

const findFaculty = async(req,res)=>{
    try {
        const facultyfind = await Faculty.find()
        res.status(200).json(facultyfind)
    } catch (error) {
        res.send(400).json({error:err.message})
    }
}

const findFacultyById = async(req,res)=>{
    const {id} = req.params 
    try {
        const findFaculty = await Faculty.findById(id)
        res.status(200).json(findFaculty);
    } catch (error) {
        res.status(400).json({error:err.message})
    }
}

const facultyDelete = async(req,res)=>{
    const {id} = req.params;
    try {
        const deleteFaculty = await Faculty.findByIdAndDelete(id);
        res.status(200).json(deleteFaculty) 
    } catch (error) {
        res.status(400).json({error:err.message})
    }
}

const facultyUpdate = async(req,res)=>{
    const {id} = req.params;
    const data = req.body; 
    try {
        const updateFaculty = await Faculty.findByIdAndUpdate(id,data,{new:true})
        res.status(200).json(updateFaculty);
    } catch (error) {
        res.status(400).json({error:err.message})
    }
}

module.exports = {addFaculty,findFaculty,findFacultyById,facultyDelete,facultyUpdate};