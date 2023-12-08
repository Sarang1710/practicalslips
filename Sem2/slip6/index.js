// Write a program for Movie Database Creating Collections Film and Actor and
// inserting documents in both the collections. 

const mongoose = require('mongoose');

mongoose.connect('mongodb://localhost:27017/movie', {
    family: 4
}).then(() => {
    console.log("Connecction Established Sucessfully...");
}).catch((err) => {
    console.log("Error in Connection", err);
})

// film Model
const filmSchema = new mongoose.Schema({
    name: String,
    year: Number
});

const film = new mongoose.model('film', filmSchema);
const createdoc = async () => {
    try {
        const documents = new film({ name: 'Tare Zameen Par', year: 2008 });
        const result = await documents.save()
        console.log(result);
    } catch (err) {
        console.log(err);
    }
}
createdoc();


// Actor Model

const actorSchema = new mongoose.Schema({
    name: String,
    movie_name: String,
    birthplace: String,
});
const actor = mongoose.model('actor', actorSchema);

const doc = [{ name: 'ABC', movie_name: 'Hello',birthplace:'California' },
{ name: 'ZZZ', movie_name: 'Mike',birthplace:'US' },
{ name: 'XXX', movie_name: 'Fruit',birthplace:'UK' }]

actor.insertMany(doc).then((result)=>{console.log(result);}).catch((err)=>{console.log(err);})