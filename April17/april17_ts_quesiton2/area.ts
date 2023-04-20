import * as Rect from "./reactangle"
import * as Tri from "./triangle"

let rec = new Rect.Rectangle(20,10);
let tri = new Tri.Triangle(10,30,false);

console.log("Recatangle: "+rec.calcArea());
console.log("Triangle: "+tri.calcArea());