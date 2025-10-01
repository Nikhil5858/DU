const express = require('express');
const app = express();
const mongoose = require('mongoose');
const studentRouter = require('./router/studentRouter');
const cors = require('cors')

app.use(cors());
app.use(express.json());

try {
    mongoose.connect("mongodb://localhost:27017/demo2")
    console.log("Database connected succesfully");
} catch (error) {
    console.log(error);
}

app.use('/api/student',studentRouter);

app.listen(5000,()=>{
    console.log("Server was Running on port no 5000");
})