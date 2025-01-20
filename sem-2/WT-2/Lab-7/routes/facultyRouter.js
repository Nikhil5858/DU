const express = require('express')
const app = express();
const router = express.Router()

const {addFaculty,findFaculty} = require('../controller/facultyController')

router.post('/create',addFaculty)
router.get('/find',findFaculty)
module.exports = router