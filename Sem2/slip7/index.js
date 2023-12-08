// Write queries on Company Database. Creating collections ‘Product’ and
// ‘service’ company insert documents in both the collections. Find Document
// which is ‘Product’ company name =”TCS”.

const mongoose = require('mongoose');

mongoose.connect('mongodb://localhost:27017/Company',{
    family:4
})
.then(()=>{
    console.log("Connection Established Sucessfully..")
})
.catch((err)=>{
    console.log(err);
});

// Creating product 
const productSchema = mongoose.Schema({
    product_name:String,
    product_qty:Number,
    company_name:String
})

const product = mongoose.model('product',productSchema);

var documents = [
    {product_name:'P1',product_qty:5,company_name:'Infosys'},
    {product_name:'P2',product_qty:3,company_name:'TCS'},
    {product_name:'P3',product_qty:4,company_name:'Google'},
] 
product.insertMany(documents).then((result)=>{console.log(result);}).catch((err)=>{console.log(err)})


// Creating Services
const serviceSchema = mongoose.Schema({
    name : String,
    type : String
});
const service = mongoose.model('service',serviceSchema);

documents = [
    {name : 'ABC', type : 'AAA'},
    {name : 'OPK', type : 'BBB'},
    {name : 'KOL', type : 'CCC'},
    {name : 'ABA', type : 'DDD'},
]
service.insertMany(documents).then((result)=>{console.log(result);}).catch((err)=>{console.log(err)});

// fiding specific document

product.find({company_name:'TCS'}).then((result)=>{console.log("Product with Comapny Name TCS is ", result);}).catch((err)=>{console.log(err)});