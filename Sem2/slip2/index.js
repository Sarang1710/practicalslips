// Write node js program create a User Login System. If username and password is same
// then throw message is “login successfully” otherwise throw error message “login fail
// “using then and catch method.

const http = require('http');
const fs = require('fs');
const formidable = require('formidable');

http.createServer((req, res) => {
    try {
        if (req.url == '/') {
            fs.readFile('./slip2/index.html', (err, data) => {
                res.writeHead(200, { 'Content-Type': 'text/html' });
                res.write(data);
                res.end();
            })
        }
        else if (req.url == '/submit') {
            res.writeHead(200, { 'Content-Type': 'text/html' });
            const form = new formidable.IncomingForm();
            form.parse(req, (err, fields, files) => {
                if (err) console.log(err);
                else {
                    const username = fields.username;
                    const password = fields.password;
                    if (username == password) res.end("Login Sucessfull...");
                    else res.end("Login Failed");
                }
            })
        }
    }
    catch{
        res.writeHead(404,{'Content-Type':'text/html'});
        res.write("Error In Login System");
    }
}).listen(3000)