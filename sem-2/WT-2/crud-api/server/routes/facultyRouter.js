const express = require('express')
const router = express.Router()

const {addFaculty,findFaculty,findFacultyById,facultyDelete,facultyUpdate} = require('../controller/facultyController')

router.post('/create',addFaculty)
router.get('/find',findFaculty)
router.get('/find/:id',findFacultyById)
router.delete('/delete/:id',facultyDelete)
router.put('/update/:id',facultyUpdate)

module.exports = router