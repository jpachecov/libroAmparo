const express = require('express');
const bodyParser = require('body-parser');
const http = require('http');
const path = require('path');


const app = express();


// API file for interacting with MongoDB
const api = require('./api/api');

// Parsers
app.use(bodyParser.json());
app.use(bodyParser.urlencoded({ extended: false}));

app.use(express.static(path.join(__dirname, 'dist')));


// API location
app.use('/api', api);


app.get('*', (req, res) => {
	res.sendFile(path.join(__dirname, 'dist/index.html'));
});

const port = process.env.PORT || '3001';
app.set('port', port);

const server = http.createServer(app);
server.listen(port, () => console.log('Running'));