import {Component, OnInit} from "@angular/core";
import { BookService } from "./book.service";
import { Book } from "./book.entity";

@Component({
    selector:'book-component',
    templateUrl:'./book.component.html',
    styleUrls: ['./book.component.css']
})
export class BookComponent implements OnInit{
    books:Book[];
    
    constructor(private service:BookService){
        this.books=[];
    }

    ngOnInit(): void {
        this.service.fetchBooks().subscribe(
            (data:Book[]) => {
                console.log(data);
                this.books=data;
            }
        )
    }
}