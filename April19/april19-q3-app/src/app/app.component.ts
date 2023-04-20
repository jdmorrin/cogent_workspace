import { Component } from '@angular/core';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title = 'Days of the Week';

  days: Day[]=[
    {day_name:'Mon'},
    {day_name:'Tue'},
    {day_name:'Wed'},
    {day_name:'Thu'},
    {day_name:'Fri'},
    {day_name:'Sat'},
    {day_name:'Sun'},
    {day_name:'Sab'}
  ];

  selectedValue1: string = 'Mon';
  

}

class Day{
  day_name!: string;
}
