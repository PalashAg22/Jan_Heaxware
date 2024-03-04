import { Component } from '@angular/core';
import { ActivatedRoute } from '@angular/router';

@Component({
  selector: 'app-contact',
  templateUrl: './contact.component.html',
  styleUrls: ['./contact.component.css']
})
export class ContactComponent {
list:any =[];
constructor(private route:ActivatedRoute){

  route.queryParams.subscribe(
    (input)=>{
      this.list=input;
      console.log(this.list);
    }
  )

}
}
