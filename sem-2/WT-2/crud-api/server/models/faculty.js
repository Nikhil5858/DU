const mongoose = require('mongoose')
const AutoIncrement = require('mongoose-sequence')(mongoose)

const facultuySchema = new mongoose.Schema({
    img: { type: String, required: true },
    name: { type: String, required: true },
    designation: { type: String, required: true },
    degree: { type: String, required: true },
    experience: { type: String, required: true }
})

facultuySchema.plugin(AutoIncrement,{inc_field:'factId'});

module.exports = mongoose.model('faculty',facultuySchema)