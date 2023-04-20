export class Rectangle{
    length:number
    width:number

    constructor(l:number,w:number){
        this.length=l;
        this.width=w;
    }

    calcArea(){
        return this.length*this.width;
    }
}