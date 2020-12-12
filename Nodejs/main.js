var http = require('http');
var fs = require('fs'); 
var url = require('url');
var qs = require('querystring');

var template = require('/Users/hyunsubong/Developer/Web/TIL/lib/template.js');
var path = require('path'); // 보안

var app = http.createServer(function(request,response){
    var _url = request.url;
    var queryData = url.parse(_url, true).query;
    var pathname = url.parse(_url, true).pathname;
    var read_dir = './data(web)'; // ./ 는 현재 디렉토리
    if(pathname == '/'){
      if(queryData.id == undefined){
        fs.readdir('/Users/hyunsubong/Developer/Web/TIL/data(web)', function(err, filelist) {
          console.log(filelist);
          var title = 'Welcome!';
          var description = 'Hello, Node.js.';

          var list = template.list(filelist);
          var html = template.html(title, list, 
            `<h2>${title}</h2>${description}`,
            `<a href="/create">create</a>`
            ); // home에서는 update가 보이지 않도록함
          response.writeHead(200); //파일이 성공적으로 전송됨
          response.end(html);
          /*
          var list = templateList(filelist);
          var template = templateHTML(title, list, 
            `<h2>${title}</h2>${description}`,
            `<a href="/create">create</a>`
            );
          response.writeHead(200);
          response.end(template);
          */
        });
        
      } else {
        fs.readdir('/Users/hyunsubong/Developer/Web/TIL/data(web)', function(err, filelist) {
          var filteredId = path.parse(queryData.id).base; // 임의로 파일 탐색하는 것을 차단
          fs.readFile(`/Users/hyunsubong/Developer/Web/TIL/data(web)/${filteredId}`, 'utf8', function(err, description){
            var title = queryData.id;
            var list = template.list(filelist);
            var html = template.html(title, list, 
              `<h2>${title}</h2>${description}`,
              `<a href="/create">create</a>
               <a href="/update?id=${title}">update</a>
              <form action="/delete_process" method="post"> 
                <input type="hidden" name="id" value="${title}">
                <p>
                  <input type="submit" value="delete">
                </p>
              </form>`
              ); // update 버튼을 눌렀을 때 주소창은 /update?id=queryString
            response.writeHead(200); //파일이 성공적으로 전송됨
            response.end(html);
          });
        });
      }
    } else if (pathname == '/create') {
      fs.readdir('/Users/hyunsubong/Developer/Web/TIL/data(web)', function(err, filelist) {
        console.log(filelist);
        var title = 'WEB - create';
        var description = 'Hello, Node.js';
        var list = template.list(filelist);
        var html = template.html(title, list, `
        <form action="/create_process"
        method="post"> 
          <p><input type="text" name="title" placeholder="title"></p>
          <p>
            <textarea name="description" placeholder="description"></textarea>
          </p>
          <p>
            <input type="submit">
          </p>
        </form>
        `,'');
        response.writeHead(200); //파일이 성공적으로 전송됨
        response.end(html);
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
        var title = post.title;
        var description = post.description;
        fs.writeFile(`/Users/hyunsubong/Developer/Web/TIL/data(web)/${title}`, description, 'utf-8', function(err) {
        // fs.watchFile(file,data[,options], callback)
          // 아래 코드는 Callback함수가 명령을 처리하고 난 다음의 코드
          response.writeHead(302, {Location: `/?id=${title}`}); //페이지를 리다이렉션
          response.end('success');
        })
      });
    }
      else if(pathname == '/update') { // 업데이트 페이지에서 queryData.id를 가져와 해당 페이지에 form을 통해 정보 수정
        fs.readdir('/Users/hyunsubong/Developer/Web/TIL/data(web)', function(err, filelist) {
          var filteredId = path.parse(queryData.id).base; // 임의로 파일 탐색하는 것을 차단
          fs.readFile(`/Users/hyunsubong/Developer/Web/TIL/data(web)/${filteredId}}`, 'utf8', function(err, description){
            var title = queryData.id;
            var list = template.list(filelist);
            var html = template.html(title, list, `
              <form action="/update_process"
              method="post"> 
                <input type="hidden" name="id" value="${title}">
                <!-- id값은 유지하면서 정보수정 --!>
                <p><input type="text" name="title" placeholder="title" value="${title}"></p>
                <p> 
                <!-- input태그는 value의 속성이 있고 여기에 querystring을 넣어주면 기존의 정보를 불러와줌 --!>
                  <textarea name="description" placeholder="description">${description}"</textarea>
                </p>
                <p>
                  <input type="submit">
                </p>
              </form>
              `,
              `<a href="/create">create</a> <a href="/update?id=${title}">update</a>`
              );// update 버튼을 눌렀을 때 주소창은 /update?id=queryString
            response.writeHead(200); //파일이 성공적으로 전송됨
            response.end(html);
          });
        });
      } 
      else if(pathname == '/update_process') {
        var body = '';
        request.on('data', function(data) {
          body += data;
        });
        request.on('end', function() {
          var post = qs.parse(body);
          var id = post.id;
          var title = post.title;
          var description = post.description;
          fs.rename(`/Users/hyunsubong/Developer/Web/TIL/data(web)/${id}`, 
          `/Users/hyunsubong/Developer/Web/TIL/data(web)/${title}`, 
          function(err) {
            fs.writeFile(`/Users/hyunsubong/Developer/Web/TIL/data(web)/${title}`, description, 'utf-8', function(err) {
              // fs.writeFile(file,data[,options], callback)
                // 아래 코드는 Callback함수가 명령을 처리하고 난 다음의 코드
                response.writeHead(302, {Location: `/?id=${title}`}); //페이지를 리다이렉션
                response.end();
              })
          });
        });
      } 
      else if(pathname == '/delete_process') {
        var body = '';
        request.on('data', function(data) {
          body += data;
        });
        request.on('end', function() {
          var post = qs.parse(body);
          var id = post.id;
          // fs.unlink(path, callback)
          var filteredId = path.parse(id).base; // 임의로 파일 탐색하는 것을 차단
          fs.unlink(`/Users/hyunsubong/Developer/Web/TIL/data(web)/${filteredId}`, function(err){
            response.writeHead(302, {Location: `/`}); //페이지를 리다이렉션
            response.end();
            // 파일 삭제 후 홈으로 이동
          });
        });
      } else {
        response.writeHead(404); // 에러발생
        response.end('Not found');
    }
});
app.listen(3000);