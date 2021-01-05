const body = document.querySelector("body");
const IMG_NUMBER = 6;

function paintImage(imgNumber) {
    const image = new Image();
    image.src = `images/img_${imgNumber}.jpg`;
    image.classList.add("bgImage");
    body.prepend(image);
}
function genRandom() {
    const num = Math.floor(Math.random()*IMG_NUMBER);
    return num;
}

function init() {
    const randomNumber = genRandom();
    paintImage(randomNumber);
}

init();