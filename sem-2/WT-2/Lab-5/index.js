const express = require('express')
const fs = require('fs')
const server = express();

server.get('/',(req,res)=>{
    res.send('Hello World!');
})
server.get('/about',(req,res)=>{
    fs.readFile('about.txt','utf8',(error,data)=>{
        if (error) {
            console.log("Data Not Found")
        }
        res.send(data);
    })  
})
server.get('/contact',(req,res)=>{
    fs.readFile('contact.txt','utf8',(error,data)=>{
        if (error) {
            console.log("Data Not Found")
        }
        res.send(data);
    })
})

server.get('*',(req,res)=>{
    res.status(404).send('Page Not Found')
})

server.listen(5000)
