const express = require('express')
const app = express()

const path = 'D:/WT-2/Lab-6'
app.use(express.static(path));

app.get('/',(req,res)=>{
    res.send('<h1>Hello World<h1/>')
})


app.listen(5000,()=>{
    console.log('http://localhost:5000/');
    
});
