import { Injectable } from "@angular/core";
import {HttpClient} from "@angular/common/http";
import { Observable } from "rxjs";
import { User } from "./user.entity";

@Injectable({
    providedIn:'root'
})
export class UserService{
    //This url is the backend command
    backend_url="http://localhost:8080/api/v1/assesment/user";

    constructor(private http:HttpClient){

    }

    fetchAllUsers():Observable<User[]>{
        return this.http.get<User[]>(`${this.backend_url}/all`);
    }

    fetchOneUser(id:number):Observable<User>{
        return this.http.get<User>(`${this.backend_url}/get?id=${id}`);
    }

    postUsers(newUser:User):Observable<User[]>{
        return this.http.post<User[]>(`${this.backend_url}/post`, newUser);
    }

    deleteUser(id:number):Observable<User>{
        return this.http.delete<User>(`${this.backend_url}/delete?id=${id}`);
    }
}