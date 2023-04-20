"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
var Rect = require("./reactangle");
var Tri = require("./triangle");
var rec = new Rect.Rectangle(20, 10);
var tri = new Tri.Triangle(10, 30, false);
console.log("Recatangle: " + rec.calcArea());
console.log("Triangle: " + tri.calcArea());
