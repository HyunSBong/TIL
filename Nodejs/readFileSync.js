var fs = require('fs');
 
/*
//readFileSync --> Sync가 있다면 동기적임. 리턴 값이 있다.
console.log('A');
var result = fs.readFileSync('syntax/sample.txt', 'utf8');
console.log(result);
console.log('C');
*/
 
 
console.log('A');
// 비동기적이므로 리턴 값이 없고 Callback을 포함해주어야한다(funtion을 인자로 주어야함)
fs.readFile('Nodejs/sample.txt', 'utf8', function(err, result){
    console.log(result);
});
console.log('C');

// A를 출력되고 readFile이 실행되는 동안 C를 먼저 출력하고 function가 호출되어 B가 출력됨