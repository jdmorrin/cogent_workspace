import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent implements OnInit{
  products=[] as any;
  title = 'APRIL 19';

  ngOnInit(): void {
    this.products=this.getProduct();
  }

  getProduct(){
    return [
      {'id':1,'title':'Screw Driver','price':300,'sotck':400},
      {'id':2,'title':'Makita Drill','price':200,'sotck':40},
      {'id':3,'title':'PT plywood','price':50.00,'sotck':1500},
      {'id':4,'title':'Soilr','price':310,'sotck':400},
      {'id':5,'title':'Galvanized Steel Roofing','price':300,'sotck':400}
    ]
  }
}
