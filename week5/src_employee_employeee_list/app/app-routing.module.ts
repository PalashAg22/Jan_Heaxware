import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { HomeComponent } from './home/home.component';
import { ContactComponent } from './contact/contact.component';
import { PaymentComponent } from './payment/payment.component';
import { AboutComponent } from './about/about.component';
import { EmployeeComponent } from './employee/employee.component';
import { EmployeeListComponent } from './employee-list/employee-list.component';

const routes: Routes = [

  {path:'',redirectTo:'home',pathMatch:'full'},
  {path:'home',component:HomeComponent},
  {path:'contactus',component:ContactComponent},
  {path:'aboutus/:username',component:AboutComponent},
  {path:'payment/:bill',component:PaymentComponent},
  {path:'employee',component:EmployeeComponent},
  {path:'employee/:id',component:EmployeeListComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
