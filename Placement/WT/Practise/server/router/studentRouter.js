const express = require('express')
const router = express.Router();
const {addStudent,showStudent,updateStudent,deleteStudent} = require('../controllers/studentController');

router.get('/show',showStudent);
router.post('/add',addStudent);
router.put('/update/:id',updateStudent);
router.delete('/delete/:id',deleteStudent);

module.exports = router;