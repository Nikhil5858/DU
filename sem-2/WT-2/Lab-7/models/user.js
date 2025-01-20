const mongoose = require('mongoose');

const userSchema = new mongoose.Schema(
    {
        name:{type:String,require:true},
        age:{type:Number,require:true},
        email:{type:String,require:true},
        date:{type:Date,default:Date.now,require:true}
    }
)

module.exports = mongoose.model('user',userSchema)