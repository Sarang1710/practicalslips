// Write node js script to interact with the file system, and serve a web page from a file.

const http = require('http');
const fs = require('fs');



http.createServer((req,res)=>{
    try{
    res.writeHeader(200,{'Content-Type':'text/html'});
    fs.readFile('./slip5/index.js','utf-8',(err,data)=>{
        if(err) res.end(err);
        else res.end(data);
    })
    }
    catch{
        res.end("Error in handeling file system");
    }
}).listen(3000,(err)=>{
    if(err) console.log(err.message)
    else console.log('Listening to port 3000');
});