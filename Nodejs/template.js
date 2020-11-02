var name = 'nodejs'
var letter = 'Web and ' + name +'\n\
\Lorem ipsum dolor sit amet, \n\
\consectetur adipisicing elit, sed d'
console.log(letter);
// \n 은 줄 바꿈
// 그러나 불편하므로 Template Literals 를 사용하면 더 쉽다.
// 맥에서 백쿼트(``) 기호는 option 키와 함께 원화키를 누르면 된다.
var a = '1';
var letter = `Dear ${name}
 Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. ${name} Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. ${1+1} Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa egoing qui officia deserunt mollit anim id est laborum. ${name}`;
 console.log(letter);
