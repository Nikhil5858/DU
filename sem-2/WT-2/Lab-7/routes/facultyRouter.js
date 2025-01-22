const express = require('express')
const app = express();
const router = express.Router()

const {addFaculty,findFaculty,findFacultyById,facultyDelete,facultyUpdate} = require('../controller/facultyController')

router.post('/create',addFaculty)
router.get('/find',findFaculty)
router.get('/find/:id',findFacultyById)
router.get('/delete/:id',facultyDelete)
router.post('/update/:id',facultyUpdate)

module.exports = router