const http = require('http');
const fs = require('fs');

const server = http.createServer((req, res) => {
    res.writeHead(200, {'Content-Type': 'text/html'});
    
    if (req.url === '/') {
        res.write('<h1>Index Page</h1>');
    } else if (req.url === '/about') {
        res.write('<h1>This Is About Page</h1>');
        fs.readFile('about.txt','utf8',(error,data)=>{
            if (error) {
                console.log(error);
            }1
            res.end(data);
        })
    } else if (req.url === '/contact') {
        res.write('<h1>This Is Contact Page</h1>');
        fs.readFile('contact.txt','utf8',(error,data)=>{
            if (error) {
                console.log(error);
            }
            res.end(data);
        })
    } else if (req.url === '/home') {
        res.write('<h1>This Is Home Page</h1>');
        fs.readFile('home.txt','utf8',(error,data)=>{
            if (error) {
                console.log(error);
            }
            res.end(data);
        })
    } else {
        res.write('<h1>Page Not Found</h1>');
    }
    
}).listen(3000, () => {
    console.log("Server is running at: http://localhost:3000/");
});