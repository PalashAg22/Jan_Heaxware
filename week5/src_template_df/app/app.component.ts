import { Component } from '@angular/core';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
  // template: `
  // <h2> welcome {{name}}</h2>
  // <h2 [style.color]="'orange'">Style Binding</h2>
  // <h2 [style.color]="hasError ? 'red' : 'green'"> Style Binding</h2> 
  // <h2 [ngStyle]="titleStyle">Style Binding</h2>
  // <button type="button" (click)="onClick()">Greet </button><br><br>{{message}}<br>
  // <input #myInput type="text">
  // <button (click)="logMessage(myInput.value)">Enter</button>
  // <br><br>
  // <input [(ngModel)]="username" type="text">
  // {{username}}<br><br>

  // <div *ngIf="display; then thenBlock; else elseThen"></div>
  // <ng-template #thenBlock>
  //   <h2>Welcome BAck</h2>
  // </ng-template>
  // <ng-template #elseThen>
  // <h2>heyy</h2>
  // </ng-template>
  // `,
  // styles : []
})
export class AppComponent {
  title = 'basics';
  name="palash";
  hasError=true;
  hColor="orange";
  username:string="";
  message="";
  display=false;
  public titleStyle={
    color:"blue",
    fontStyle:"italic"
  }
  onClick(){
    console.log('hello from component')
    this.message="welcome back"
  }
  logMessage(value:any){
    console.log(value);
  }

  mydata:any='';
  getFormData(data:any){
    this.mydata=data;
  }
}
