const express = require('express')
const app = express()

const router = express.Router()

const {addStudent,findStudent,findStudentById,deleteStudentByid,updateStudentByid} = require('../controller/studentController')

router.post('/create',addStudent)
router.get('/find',findStudent)
router.get('/find/:id',findStudentById)
router.delete('/delete/:id',deleteStudentByid)
router.put('/update/:id',updateStudentByid)

module.exports = router;