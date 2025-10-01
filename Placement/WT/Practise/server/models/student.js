const mongoose = require("mongoose");

const studentSchema = new mongoose.Schema(
    {
        name:{type:String,required:true},
        gender:{type:String,required:true},
        course:{type:String,required:true}
    }
)

module.exports = mongoose.model('newstudent',studentSchema);