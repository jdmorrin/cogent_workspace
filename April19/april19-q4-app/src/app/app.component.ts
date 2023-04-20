import { Component, OnInit } from '@angular/core';
import { PostService } from './post.service';


@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent implements OnInit{
  title = 'april19-q4-app';
  posts: any;

  ngOnInit(): void {
    this.service.getPost().subscribe(
      response => {
        return this.posts=response;
      }
    );
  }

  constructor(private service: PostService){

  }

}
