var http = require('http');
var fs = require('fs'); 
var url = require('url');

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
        <form action="http://localhost:3000/process_create"
        method="post"> 
          <p><input type="text" name="title" placehoder="제목에 아무거나 입력해보세요"></p>
          <p>
            <textarea name="description" placehoder="본문에 아무거나 입력해보세요"></textarea>
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
      else {
      response.writeHead(404); // 에러발생
      response.end('Not found');
    }
});
app.listen(3000);