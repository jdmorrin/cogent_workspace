import { Component, OnInit } from '@angular/core';
import { AppService } from './app.service';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent implements OnInit{
  products=[] as any;
  title = 'APRIL 19';

  constructor(private service:AppService){

  }

  ngOnInit(): void {
    this.products=this.service.getProduct();
  }

  // getProduct(){
  //   return [
  //     {'id':1,'title':'Screw Driver','price':300,'sotck':400},
  //     {'id':2,'title':'Makita Drill','price':200,'sotck':40},
  //     {'id':3,'title':'PT plywood','price':50.00,'sotck':1500},
  //     {'id':4,'title':'Soilr','price':310,'sotck':400},
  //     {'id':5,'title':'Galvanized Steel Roofing','price':300,'sotck':400},
  //     {'id':6,'title':'Spanish Shingle','price':500.00,'sotck':1000},
  //     {'id':7,'title':'Fast-Setting Concrete','price':6.60,'sotck':2500},
  //     {'id':8,'title':'4x4x8','price':13.33,'sotck':450},
  //     {'id':9,'title':'Eggshell Backsplash','price':25.55,'sotck':400},
  //     {'id':10,'title':'Cedar Shims','price':1.00,'sotck':4000},
  //   ]
  // }
}
