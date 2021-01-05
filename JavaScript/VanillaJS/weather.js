const COORDS = "coords";
const API_KEY= "0754fe417e18b6ca2d0da3ef9c43fd70";
const weather = document.querySelector(".js-weather");

function getWeather(lat, lon) {
    fetch(`https://api.openweathermap.org/data/2.5/weather?lat=${lat}&lon=${lon}&appid=${API_KEY}&units=metric`
    ).then(function(response) {
        console.log(`https://api.openweathermap.org/data/2.5/weather?lat=${lat}&lon=${lon}&appid=${API_KEY}&units=metric`)
        return response.json();
        // 정보를 가져온 다음에 작업을 진행하기 위해 then 사용
    }).then(function(json) {
        const temperature = json.main.temp;
        console.log(temperature);
        const place = json.name;
        console.log(place);
        weather.innerText = `${temperature} | ${place}`;
    })
}
function saveCoords(coordsObj) {
    localStorage.setItem(COORDS, JSON.stringify(coordsObj)); // localStorage는 js의 오브젝트를 저장할 수 없기 때문
}

function handleGeoSucces(position) {
    const latitudeCode = position.coords.latitude;
    const longitudeCode = position.coords.longitude;
    const coordsObj = {
        latitude: latitudeCode,
        longitude: longitudeCode
    };
    saveCoords(coordsObj);
    getWeather(latitudeCode, longitudeCode);
}

function handleGeoError() {
    console.log("Can't access geo location");
}

function askForCoords() {
    navigator.geolocation.getCurrentPosition(handleGeoSucces, handleGeoError);
}

function loadCoords() {
    const loadedCoords = localStorage.getItem(COORDS);
    if(loadedCoords === null) {
        askForCoords();
    }
    else {
        const parsedCoords = JSON.parse(loadedCoords); // localStorage에서 오브젝트를 가져올 때는 parse를...
        getWeather(parsedCoords.latitude, parsedCoords.longitude);
    }
}

function init() {
    loadCoords();
}

init();