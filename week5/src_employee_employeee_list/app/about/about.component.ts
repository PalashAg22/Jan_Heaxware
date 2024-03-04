import { Component } from '@angular/core';
import { ActivatedRoute } from '@angular/router';

@Component({
  selector: 'app-about',
  templateUrl: './about.component.html',
  styleUrls: ['./about.component.css']
})
export class AboutComponent {
  name:string="";
  constructor(private route:ActivatedRoute){
    route.params.subscribe(params => this.name = params['username'] );
  }
  
}
