"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
exports.Triangle = void 0;
var Triangle = /** @class */ (function () {
    function Triangle(base, height, isIsosceles) {
        this.base = base;
        this.height = height;
        this.isIsosceles = isIsosceles;
    }
    Triangle.prototype.calcArea = function () {
        if (!this.isIsosceles) {
            return 0.5 * this.base * this.height;
        }
        else {
            return 0;
        }
    };
    return Triangle;
}());
exports.Triangle = Triangle;
