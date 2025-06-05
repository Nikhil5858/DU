const express = require('express')
const mongoose = require('mongoose')
const app = express()
const cors = require('cors')
const facultyRouter = require('./router/facultyRouter')

app.use(cors())
app.use(express.json())

try {
    mongoose.connect("mongodb://localhost:27017/mca2")
    console.log("Database connected succesfull!");
    
} catch (error) {
    console.log(`Something wenet wrong : ${error}`);
    
}

app.use('/api/faculty',facultyRouter)

app.listen(5000,()=>{
    console.log("Server Running");
})