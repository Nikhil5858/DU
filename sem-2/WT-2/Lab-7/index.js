const express = require('express')
const mongoose = require('mongoose');
const app = express();

const facultuyRouter = require('./routes/facultyRouter')

app.use(express.json())

try {
    mongoose.connect('mongodb://localhost:27017/mca')
    console.log("Database Connected Succesfully");
} catch (error) {
    console.log(`Connection was Failed :  ${error}`);
}

app.use('/api/faculty',facultuyRouter)
app.listen(3000)
