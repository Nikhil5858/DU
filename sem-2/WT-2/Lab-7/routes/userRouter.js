const express = require('express')
const app = express() 
const userRouter = express.Router()

userRouter.get('/user',(req,res)=>{
    res.send("Hello World");
    console.log("Data");
})
