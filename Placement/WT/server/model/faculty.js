const mongoose = require('mongoose')
const autoIncrement = require('mongoose-sequence')(mongoose);

const facultySchema = new mongoose.Schema({
    name: { type: String, required: true },
    img: { type: String, required: true },
    degree: { type: String, required: true },
    experience: { type: String, required: true },
});

facultySchema.plugin(autoIncrement,{inc_field:'factId'})
module.exports = mongoose.model('newfaculty',facultySchema)