import { Component, OnInit } from "@angular/core";
import { User } from "./user.entity";
import { UserService } from "./user.service";


@Component({
    selector:'user',
    templateUrl:'./user.html'
})
export class UserComponent implements OnInit{
    users:User[];
    oneUser:User;

    constructor(public service:UserService){
        this.users=[];
        this.oneUser= new User();
    }

    createUser(userform:any){
        console.log("This method will call the service to post a new user");
        console.log(userform.value);

        this.service.postUsers(userform.value).subscribe(
            (data:User[]) => {
                console.log(data);
                this.users=data;
            }
        )
    }

    delete(id:number){
        this
    }

    ngOnInit(): void {
        this.service.fetchAllUsers().subscribe(
            (data:User[]) => {
                console.log(data);
                this.users=data;
            }
        )

        this.service.fetchOneUser(1).subscribe(
            (data:User)=>{
                console.log(data);
                this.oneUser=data;
            }
        )

        // this.service.deleteUser().subscribe(

        // )
    }

}