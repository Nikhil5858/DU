const express = require('express')
const router = express.Router()
const {addFaculty,findFaculty,updateFaculty, deleteFaculty} = require('../controller/facultyController')


router.post('/add',addFaculty)
router.get('/',findFaculty)
router.put('/update/:id',updateFaculty)
router.delete('/delete/:id',deleteFaculty)

module.exports = router

