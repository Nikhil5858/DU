const express = require('express')
const mongoose = require('mongoose');
const cors = require('cors');
const app = express();

const facultuyRouter = require('./routes/facultyRouter')
const productRouter = require('./routes/productRouter')
const studentRouter = require('./routes/studentRouter')

app.use(cors());
app.use(express.json())

try {
    mongoose.connect('mongodb://127.0.0.1/mca2')
    console.log("Database Connected Succesfully");
} catch (error) {
    console.log(`Connection was Failed :  ${error}`);
}

app.use('/api/faculty',facultuyRouter)
app.use('/api/product',productRouter)
app.use('/api/student',studentRouter)

app.listen(5000, () => {
    console.log("Server running on port 5000");
});