// 자바스크립트에서 함수는 구문(statement)이면서 동시에 값(value)
var f = function(){
    console.log(1+1);
    console.log(1+2);
  }
var a = [f];
a[0](); // a[0] => f => 2 3
   
var o = {
  func:f
}
o.func(); // 2 3