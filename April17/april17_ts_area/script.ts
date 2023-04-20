function areaTriangle(l:number,h:number){
    return 0.5*l*h;
}

function areaRect(l:number,w:number){
    return l*w;
}

let t = areaTriangle(10,40);
let x = areaRect(10,40);

console.log("Triangle area: " + t);
console.log("Reactangle area: "+x);