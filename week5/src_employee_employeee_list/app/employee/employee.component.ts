import { Component } from '@angular/core';
import { ActivatedRoute, Router } from '@angular/router';
import { Action } from 'rxjs/internal/scheduler/Action';

@Component({
  selector: 'app-employee',
  templateUrl: './employee.component.html',
  styleUrls: ['./employee.component.css']
})
export class EmployeeComponent {

  constructor(private router:Router, private route:ActivatedRoute){

  }
  selected!:number;
  ngOnInit(){
    this.route.params.subscribe(params => this.selected= +params['val']);
  }
    eid:number = 111;
    ename:string = 'king';
    salary:number = 50000;

    employees = [
      {"id": 1, "name": "Angular"},
      {"id": 2, "name": "Node"},
      {"id": 3, "name": "MongoDB"},
      {"id": 4, "name": "Ruby"},
      {"id": 5, "name": "Bootstrap"}
    ]

    onSelect(list:any){
        this.router.navigate(['/employee/'+list.id]);
    }
    isSelected(list:any){
      return list.id===this.selected;
    }

}
