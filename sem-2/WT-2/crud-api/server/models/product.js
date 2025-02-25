const mongoose = require('mongoose')

const productSchema = new mongoose.Schema({
    name:{type:String,require:true},
    category:{type:String,require:true},
    descreption:{type:String,require:true},
    price:{type:Number,require:true},
    color:{type:String,require:true}
})

module.exports = mongoose.model('product',productSchema)    