import {Injectable} from '@angular/core';
import {HttpClient} from '@angular/common/http';
import {Observable} from 'rxjs';
import {Book} from './book.entity';

@Injectable({
    providedIn: 'root'
})
export class BookService{
    private backendUrl = 'http://localhost:8080/api/books/all';

    constructor(private http:HttpClient){
        
    }

    // I don't understand this part
    // What is an observable?
    // Why is it of type Book Array?
    fetchBooks():Observable<Book[]>{
        return this.http.get<Book[]>(`${this.backendUrl}`);
    }
}