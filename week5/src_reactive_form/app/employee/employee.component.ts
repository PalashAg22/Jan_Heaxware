import { Component } from '@angular/core';

@Component({
  selector: 'app-employee',
  template: '<h1>Hello I am Employee</h1>',
  styles: ['h1{color:green}']
})
export class EmployeeComponent {


    eid:number = 111;
    ename:string = 'king';
    salary:number = 50000;

}
