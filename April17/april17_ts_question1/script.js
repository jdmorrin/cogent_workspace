var Employee = /** @class */ (function () {
    function Employee() {
    }
    Employee.prototype.showInfo = function () {
        console.log(this.id);
        console.log(this.name);
        console.log(this.title);
    };
    return Employee;
}());
var emp = new Employee();
emp.id = 1001;
emp.name = "David";
emp.title = "Software Developer";
emp.showInfo();
