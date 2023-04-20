let nbr=42;
{
    let nbr=1000;
    
}
document.write(nbr);
const val = 43;
console.log(val);

let arr=[];
for(let i=0;i<2;i++){
    arr.push(function(){return i});
}
let value = arr[1]();
console.log(value);

let getNum=()=>42;
console.log(typeof getNum);
console.log(getNum());

let getPrice=(qty,tax)=>(qty*5)*(tax+1);
console.log(getPrice(2,0.95));
const gl=(msg)=>console.log(msg);
gl("Welcome David");

let getSum=function(a=1,b=41){
    console.log(a+b);
}
getSum();
getSum(1,6);
getSum(10);
getSum(null,6);

let getName=function(first="John", last="Doe"){
    console.log(first+" "+last);

}
getName("Jane");

let showCollections=function(id,...collection){
    console.log(collection);
}
showCollections(41, "movies","music");

let vall=[100,300,500];
let newSet=[100,...vall,500];
console.log(newSet);

let price=4.20,qnty=20;
let invocieData={
    price:price,
    quantity:qnty
}
console.log(invocieData);

//template literal
let user='Kevin';
console.log(`Hi ${user}!`);

class Car{
    constructor(brand){
        this.brand=brand;

    }

    start(){
        console.log(`${this.brand} is ready to go`);
    }
}

const myHonda=new Car("Honda City");
myHonda.start();

