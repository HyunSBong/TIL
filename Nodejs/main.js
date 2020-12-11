var http = require('http');
var fs = require('fs'); 
var url = require('url');
var qs = require('querystring');

function templateHTML(title, list, body) {
  return `
  <!doctype html>
   <html>
   <head>
     <title>WEB1 - ${title}</title>
     <meta charset="utf-8">
   </head>
   <body>
     <h1><a href="/">WEB</a></h1>
     ${list}
     <a href="/create">create</a>
     ${body}
   </body>
   </html>
   `;
}
function templateList(filelist) {
  var list = '<ul>'; // 파일리스트를 불러와서 표시
  var i = 0;
  while(i < filelist.length) {
    list += `<li><a href="/?id=${filelist[i]}">${filelist[i]}</a></li>`
    i += 1;
  }
  list += '</ul>';
  return list;
}
var app = http.createServer(function(request,response){
    var _url = request.url;
    var queryData = url.parse(_url, true).query;
    var pathname = url.parse(_url, true).pathname;
    var read_dir = './data(web)'; // ./ 는 현재 디렉토리
    if(pathname == '/'){
      if(queryData.id == undefined){

        fs.readdir('/Users/hyunsubong/Developer/Web/TIL/data(web)', function(err, filelist) {
          console.log(filelist);
          var title = 'Welcome';
          var description = 'Hello, Node.js';
          var list = templateList(filelist);
          var template = templateHTML(title, list, `<h2>${title}</h2>${description}`);
          response.writeHead(200); //파일이 성공적으로 전송됨
          response.end(template);
        })
        
      } else {
        fs.readdir('/Users/hyunsubong/Developer/Web/TIL/data(web)', function(err, filelist) {
          fs.readFile(`/Users/hyunsubong/Developer/Web/TIL/data(web)/${queryData.id}`, 'utf8', function(err, description){
            var title = queryData.id;
            var list = templateList(filelist);
            var template = templateHTML(title, list, `<h2>${title}</h2>${description}`);
            response.writeHead(200); //파일이 성공적으로 전송됨
            response.end(template);
          });
        });
      }
    } else if (pathname == '/create') {
      fs.readdir('/Users/hyunsubong/Developer/Web/TIL/data(web)', function(err, filelist) {
        console.log(filelist);
        var title = 'WEB - create';
        var description = 'Hello, Node.js';
        var list = templateList(filelist);
        var template = templateHTML(title, list, `
        <form action="http://localhost:3000/create_process"
        method="post"> 
          <p><input type="text" name="title" placeholder="title"></p>
          <p>
            <textarea name="description" placeholder="description"></textarea>
          </p>
          <p>
            <input type="submit">
          </p>
        </form>

        `);
        response.writeHead(200); //파일이 성공적으로 전송됨
        response.end(template);
      })
    }
    else if (pathname == '/create_process') {
      var body = '';
      request.on('data', function(data) {
        body += data;

        if (body.length > 1e6) {
          request.connection.destroy(); // 너무 길어질 때 부하를 줄이기 위해 연결을 강제로 끊음
        }
      });
      request.on('end', function() {
        var post = qs.parse(body);
        console.log(body);
        var title = post.title;
        var description = post.description;
        console.log(title);
        console.log(description);
      });
      response.writeHead(200); //파일이 성공적으로 전송됨
      response.end('success');
    }
      else {
      response.writeHead(404); // 에러발생
      response.end('Not found');
    }
});
app.listen(3000);