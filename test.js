const http = require('http');
const hostname = '127.0.0.1';
const port = 9082;

http.createServer(function(req,res){
  res.writeHead(200,{'Content-Type':'text/plain'});
  res.end('Hello World\n');
}).listen(port,hostname);
console.log('Server is running at http://127.0.0.1:9082');
