// Write a node js program to displaying the user's name, convert it to upper case
// letters. For example, if the user's name is Raj, then display greet message as
// "Hello, RAJ, nice to meet you!"


const http = require('http');
const fs = require('fs');
const upperCase = require('upper-case');
const formidale = require('formidable');


http.createServer((req, res) => {
    try {
        res.writeHead(200, { 'Content-Type': 'text/html' });
        if (req.url == '/') {
            fs.readFile('./slip3/index.html', 'utf-8', (err, data) => {
                res.end(data);
            })
        }
        else if(req.url == '/submit'){
            console.log(20);
            const form = new formidale.IncomingForm();
            form.parse(req,(err,fields,files)=>{
                const name = fields.username;
                console.log(upperCase("name"));
                res.end(`Hello, nice to meet you`);
            })
        }
    }
    catch{
        res.writeHead(404,"Error Caught, Please try again");
    }
}).listen(3000);
