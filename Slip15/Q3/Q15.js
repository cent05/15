const http = require('http');

const datetime = require('./modules.js').datetime;

var server = http.createServer(function(req,res){
    res.writeHead(200,{'content-type':'text/html'});
    const result = datetime();
    res.write('current date and time is ');
    res.write(result);
    res.end();

});
server.listen(1234);

console.log("Server Started....");