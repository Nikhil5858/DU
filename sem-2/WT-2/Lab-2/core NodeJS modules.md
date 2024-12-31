# Demonstrate the use of core NodeJS modules
### Demonstrate “path” core module in NodeJS.
The path module provides utilities for working with file and directory paths. 
```js
const path = require('path');

const filePath = '/home/user/project/app.js';
console.log('Directory Name:', path.dirname(filePath));
console.log('Base Name:', path.basename(filePath));
console.log('Extension Name:', path.extname(filePath));
console.log('Join Path:', path.join('home', 'user', 'docs', 'file.txt'));
console.log('Relative Path:',path.relative('abc/pqr/xyz/asd.txt', 'abc/pqr/web/dfg.txt'));
```

### Demonstrate “fs” core module in NodeJS.
The fs module is where all the file query and manipulation functions are stored.
With these functions, we can open, read from, write to and close files.
```js
const fs = require('fs');

fs.writeFile('example.txt', 'Hello, this is a test file.', (err)=>{
    if(err) throw err;
    console.log("File Written Sucessfully!");
});

fs.readFile('example.txt', (err, data)=>{
    if(err) throw err;
    console.log('File Contents:', data.toString());
});

fs.appendFile('example.txt', '\nAppended text.', (err)=>{
    if(err) throw err;
});

fs.rename("example.txt", "rename.txt", (err)=>{
    if(err) throw err;
})

fs.unlink("rename.txt", (err)=>{
    if(err) throw err;
})
```

### Demonstrate “child_process” core module in NodeJS.
```js
// const { exec } = require('child_process');
const child_process = require('child_process');

child_process.exec('node path.js', (error, stdout, stderr) => {
    if (error) {
        console.log(`Error: ${error.message}`);
        return;
    }
    if (stderr) {
        console.log(`Stderr: ${stderr}`);
        return;
    }
    console.log(`Node.js Version: ${stdout}`);
});
```

### Demonstrate “EventEmmiter” core module in NodeJS.
The event emitter provides a great way of making a programming interface more generic. When we use a common understood pattern, clients bind to events instead of invoking functions, making our program more flexible.
In order to create an event emitter in Node, we need our class to inherit EventEmitter class from the events module.
Then we can use emit method of EventEmitter to emit the event.
```js
const EventEmitter = require('events');

const myEmitter = new EventEmitter();

myEmitter.on('greet', (name, lname) => {
    console.log(`Hello, ${name} ${lname}!`);
});

myEmitter.emit('greet', 'Sujal', 'Rabadiya');
```

### WAP in NodeJS to store the student details in text file.
```js
const fs = require('fs');

const students = [
    { id: 1, name: 'John Doe', age: 20, grade: 'A' },
    { id: 2, name: 'Jane Smith', age: 22, grade: 'B' },
    { id: 3, name: 'Arjun Rathod', age: 21, grade: 'A+' },
];

for(std of students){
    let data = `id:${std.id}\nname:${std.name}\nage:${std.age}\ngrade:${std.grade}\n\n`
    fs.appendFile('students.txt', data, (err)=>{
        if (err) throw err;
    })
}
```
