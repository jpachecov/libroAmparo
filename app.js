const express = require('express');
const http = require('http');
const path = require('path');


const app = express();


// API file for interacting with MongoDB
//const api = require('./api');


app.use(express.static(path.join(__dirname, 'dist')));


// API location
//app.use('/api', api);


app.get('*', (req, res) => {
	res.sendFile(path.join(__dirname, 'dist/index.html'));
});



app.get('/libro', (req, res) => {
	res.send("Book service! Hello!");
});

const port = process.env.PORT || '3001';
app.set('port', port);

const server = http.createServer(app);
server.listen(port, () => console.log('Running'));