// 객체는 순서 X
var animals = ['cat', 'dog', 'lion'];
console.log(animals[1]); // dog

var i = 0;
while(i < animals.length) {
    console.log('array >> ', animals[i]);
    i += 1;
}

// 객체는 순서 O
var obj = {
  'Felidae':'cat',
  'Canidae' : 'dog'
}
console.log(obj.Canidae); // dog

for (var j in obj) {
    console.log('object >> ', j, ',', 'value >> ', obj[j]);
}