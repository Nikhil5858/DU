const mongoose = require('mongoose')

const studentSchema = new mongoose.Schema({
    name:{type:String,require:true},
    age:{type:Number,require:true},
    email:{type:String,require:true},
    department:{type:String,require:true},
    semester:{type:Number,require:true},
    enrollmentN:{type:Number,require:true}
}) 

module.exports = mongoose.model('student',studentSchema)