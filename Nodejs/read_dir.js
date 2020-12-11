var testFolder = './data(web)'; // ./ 는 현재 디렉토리
var fs = require('fs');
 
fs.readdir(testFolder, function(error, filelist){
  console.log(filelist);
})