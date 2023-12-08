// Using node js create a web page to read two file names from user and
// append contents of first file into second file.

const http = require('http');
const fs = require('fs');
const formidable = require('formidable')


http.createServer((req,res)=>{
    if(req.url == '/' ){
        const data = fs.readFileSync('./slip1/index.html','utf-8');
        res.writeHead(200,{'Content-Type':'text/html'})
        res.write(data);
        res.end()
    }
    else if(req.url == '/submit'){
        const form = new formidable.IncomingForm();
        form.parse(req,(err,fields,files)=>{
            if(err) console.log(err);
            else{
                const file1 = fields.file1;
                const file2 = fields.file2;
                const data = fs.readFileSync(`./slip1/${file1}`,'utf-8');
                console.log(data);
                fs.appendFileSync(`./slip1/${file2}`,data);
                res.writeHead(200,{'Content-Type':'text/html'});
                res.write("File Appended Sucessfully");
                res.end()
            }
        })
    }
    else{
        res.writeHead(404,{'Content-type':'text/html'});
        res.write("Error Occured");
        res.end();
        
    }
}).listen(3000,(err)=>{
    if(err) console.log("Error in listening to port 3000");
    else console.log("Listenign to port 3000");
});