// Write a program using node js for eLearning System. Using different routing in
// express js(Student, Course).

const express = require('express');
const app = express();


app.use(express.urlencoded({extended:false}));
app.set('view engine','ejs');

app.get('/',(req,res)=>{
    res.render('home')
})

app.get('/student',(req,res)=>{
    res.render('student');
})

app.get('/course',(req,res)=>{
    res.render('course');
})
app.get('/contact',(req,res)=>{
    res.render('contact');
})

app.listen(3000,(err)=>{
    if(err) console.log("Error in listening to port");
    else console.log("Listening to port 3000");
})