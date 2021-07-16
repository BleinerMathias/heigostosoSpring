function toogleVisibleCard(iconClick, blockToInsertsClass) {
    iconClick.addEventListener("click", function () {
        blockToInsertsClass.classList.toggle("minimize");
    })
}

window.onload = function (){
    let controlCardIngredients = document.getElementById("controlCardIngredients");
    let bodyIngredients =  document.getElementById("body-ingredients");
    let controlCardDIY = document.getElementById("controlCardDIY");
    let bodyDIY =  document.getElementById("body-diy");

    toogleVisibleCard(controlCardIngredients, bodyIngredients);
    toogleVisibleCard(controlCardDIY, bodyDIY);
}