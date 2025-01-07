const express = require('express')
const app = express()
const path = 'D:\WT-2\Lab-6'


const middleWare = (req,res,next)=>{
    console.log('Middleware Executed');
    next();
}

// app.use(middleWare);


app.get('/',middleWare,(req,res)=>{
    res.send('<h1>Hello World<h1/>')
})

app.listen(3000,()=>{
    console.log('http://localhost:3000/');
    
});
