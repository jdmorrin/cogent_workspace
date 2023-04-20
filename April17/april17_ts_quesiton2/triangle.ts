export class Triangle{
    base:number;
    height:number;
    isIsosceles:boolean;

    constructor(base:number,height:number,isIsosceles:boolean){
        this.base=base;
        this.height=height;
        this.isIsosceles=isIsosceles;
    }


    calcArea():number{
        if(!this.isIsosceles){
            return 0.5*this.base*this.height;
        }
        else{
            return 0;
        }
    }
}