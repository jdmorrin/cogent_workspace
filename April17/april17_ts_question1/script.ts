class Employee{
    id:number
    name:string
    title:string

    showInfo(){
        console.log(this.id);
        console.log(this.name);
        console.log(this.title);
    }
}

let emp = new Employee();
emp.id=1001;
emp.name="David";
emp.title="Software Developer";
emp.showInfo();