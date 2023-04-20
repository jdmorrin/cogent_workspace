function areaTriangle(l, h) {
    return 0.5 * l * h;
}
function areaRect(l, w) {
    return l * w;
}
var t = areaTriangle(10, 40);
var x = areaRect(10, 40);
console.log("Triangle area: " + t);
console.log("Reactangle area: " + x);
