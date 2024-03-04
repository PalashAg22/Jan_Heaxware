import { Component } from '@angular/core';
import { ActivatedRoute, Router } from '@angular/router';

@Component({
  selector: 'app-employee-list',
  templateUrl: './employee-list.component.html',
  styleUrls: ['./employee-list.component.css']
})
export class EmployeeListComponent {

epm!:number;
  constructor(private route:ActivatedRoute, private router:Router){
route.params.subscribe(parmas => this.epm= +parmas['id']);
console.log(this.epm);
  }

  goPrevious(){
    let previous=this.epm - 1;
    this.router.navigate(['/employee/',previous]);
  }
  goNext(){
    let next=this.epm + 1;
    this.router.navigate(['/employee/',next]);
  }

  goBack(){
    let val=this.epm;
    this.router.navigate(['/employee/',val]);
  }

}
