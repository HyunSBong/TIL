const clockContainer = document.querySelector(".js-clock");
const clockTitle = clockContainer.querySelector("h1");
const dayContainer = document.querySelector(".js-day");
const clockDay = dayContainer.querySelector("h5");

function getTime() {
    const date = new Date();
    const year = date.getFullYear();
    const month = (date.getMonth()+1);
    const day1 = date.getDate();
    const weeks = ["Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat"];
    const day2 = date.getDay();
    const minutes = date.getMinutes();
    const hours = date.getHours();
    const seconds = date.getSeconds();
    clockTitle.innerText = `${hours < 10 ? `0${hours}` : hours}:${
        minutes < 10 ? `0${minutes}` : minutes}:${
        seconds < 10 ? `0${seconds}` : seconds
    }`;
    clockDay.innerText = `${year} . ${month < 10 ? `0${month}`: month} . ${
        day1 < 10 ? `0${day1}`: day1} . ${weeks[day2]}`;
}


function init() {
    getTime();
    setInterval(getTime, 1000);
}

init();