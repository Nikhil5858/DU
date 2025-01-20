const mongoose = require('mongoose')

const facultuySchema = new mongoose.Schema({
    name:{type:String,require:true},
    age:{type:Number,require:true},
    email:{type:String,require:true},
    experience:{type:Number,require:true},
    designation:{type:String,require:true},
    salary:{type:Number,require:true}
})

module.exports = mongoose.model('faculty',facultuySchema)