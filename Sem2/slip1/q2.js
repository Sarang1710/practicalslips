// Create a Node.js file that open the requested file and returns the content
// to the client. If anything goes wrong, throw a 404 error.

const http = require('http');
const fs = require('fs');

http.createServer((req,res)=>{
    if(req.url == '/'){
        res.writeHead(404,{"Content-Type":'text/text'});
        res.write('Error no file found');
        res.end();
    }
    else{
    const file = req.url;
    const data = fs.readFileSync(`./slip1${file}`,'utf-8');;
    res.writeHead(200,{'Content-Type':'text/text'});
    res.end(data)
    }
}).listen(3000,(err)=>{
    if(err) console.log("Error in listening to port");
    else console.log("Listening to port 3000");
});