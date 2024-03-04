import { Component } from '@angular/core';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title = 'routing';

   id:number = 101;
   username:string = 'palash';
   addressJson = {'city':'Hyderabad','state':'Telangana'};

    hello(){


        alert('hello world!');

    }


}
