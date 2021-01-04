// const title = document.getElementById("title");
const title = document.querySelector("#title");
const CLICKED_CLASS = "clicked";

function init() {
    title.innerHTML = "Hi From JS";
    document.title = 'I own you now';
    title.addEventListener("click", handleClick);
}

function handleClick() {
    const hasClass = title.classList.contains(CLICKED_CLASS);
    if(!hasClass) {
        title.classList.add(CLICKED_CLASS);
    }
    else {
        title.classList.remove(CLICKED_CLASS);
    }
}

init();