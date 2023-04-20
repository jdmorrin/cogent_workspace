"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
exports.Rectangle = void 0;
var Rectangle = /** @class */ (function () {
    function Rectangle(l, w) {
        this.length = l;
        this.width = w;
    }
    Rectangle.prototype.calcArea = function () {
        return this.length * this.width;
    };
    return Rectangle;
}());
exports.Rectangle = Rectangle;
