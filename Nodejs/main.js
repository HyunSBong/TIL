var http = require('http');
var fs = require('fs'); 
var url = require('url');
 
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
          /*
          var list = `<ul>
          <li><a href="/?id=HTML">HTML</a></li>
          <li><a href="/?id=CSS">CSS</a></li>
          <li><a href="/?id=JavaScript">JavaScript</a></li>
        </ul>`
        */
          var list = '<ul>';
          
          var i = 0;
          while(i < filelist.length) {
            list += `<li><a href="/?id=${filelist[i]}">${filelist[i]}</a></li>`
            i += 1;
          }
          list += '</ul>'

          var template = `
         <!doctype html>
          <html>
          <head>
            <title>WEB1 - ${title}</title>
            <meta charset="utf-8">
          </head>
          <body>
            <h1><a href="/">WEB</a></h1>
            ${list}
            <h2>${title}</h2>
            <p>${description}</p>
          </body>
          </html>
          `;
          response.writeHead(200); //파일이 성공적으로 전송됨
          response.end(template);
        })
        
      } else {
        fs.readdir('/Users/hyunsubong/Developer/Web/TIL/data(web)', function(err, filelist) {
          console.log(filelist);
          var title = 'Welcome';
          var description = 'Hello, Node.js';
          var list = '<ul>'; // 파일리스트를 불러와서 표시
          
          var i = 0;
          while(i < filelist.length) {
            list += `<li><a href="/?id=${filelist[i]}">${filelist[i]}</a></li>`
            i += 1;
          }
          list += '</ul>';

          fs.readFile(`/Users/hyunsubong/Developer/Web/TIL/data(web)/${queryData.id}`, 'utf8', function(err, description){
            var title = queryData.id;
            var template = `
            <!doctype html>
            <html>
            <head>
              <title>WEB1 - ${title}</title>
              <meta charset="utf-8">
            </head>
            <body>
              <h1><a href="/">WEB</a></h1>
              <ul>
                <li><a href="/?id=HTML">HTML</a></li>
                <li><a href="/?id=CSS">CSS</a></li>
                <li><a href="/?id=JavaScript">JavaScript</a></li>
              </ul>
              <h2>${title}</h2>
              <p>${description}</p>
            </body>
            </html>
            `;
            response.writeHead(200); //파일이 성공적으로 전송됨
            response.end(template);
          });
        });
      }
    } else {
      response.writeHead(404); // 에러발생
      response.end('Not found');
    }
});
app.listen(3000);