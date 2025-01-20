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

module.exports = {addFaculty,findFaculty};