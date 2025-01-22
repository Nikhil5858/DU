const express = require('express')
const mongoose = require('mongoose');
const app = express();

const facultuyRouter = require('./routes/facultyRouter')
const productRouter = require('./routes/productRouter')
app.use(express.json())

try {
    mongoose.connect('mongodb://localhost:27017/mca2')
    console.log("Database Connected Succesfully");
} catch (error) {
    console.log(`Connection was Failed :  ${error}`);
}

app.use('/api/faculty',facultuyRouter)
app.use('/api/product',productRouter)

app.listen(3000)
