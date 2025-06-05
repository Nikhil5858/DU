const express = require('express')
const app = express()

const Faculty = require('../model/faculty')

const addFaculty = async(req,res)=>{
    const data = req.body
    try {
        const faculty = new Faculty(data)
        const facultyData = await faculty.save()
        res.status(201).json(facultyData) 
    } catch (error) {
        res.status(400).json({ error: error.message });
    }
}

const findFaculty = async(req,res)=>{
    try {
        const facultyfind = await Faculty.find()
        res.status(201).json(facultyfind)
    } catch (error) {
        res.status(400).json({error:error.message})
    }
}

const updateFaculty = async(req,res)=>{
    const data = req.body
    const {id} = req.params
    try {
        const newData = await Faculty.findByIdAndUpdate(id,data,{new:true})
        res.status(200).json(newData)
    } catch (error) {
        res.status(400).json({error:error.message})
    }
}

const deleteFaculty = async(req,res)=>{
    const {id} = req.params
    try {
        const data = await Faculty.findByIdAndDelete(id)
        res.status(200).json(data)
    } catch (error) {
        res.status(400).json({error:error.message})
    }
}

module.exports = {addFaculty,findFaculty,updateFaculty,deleteFaculty}