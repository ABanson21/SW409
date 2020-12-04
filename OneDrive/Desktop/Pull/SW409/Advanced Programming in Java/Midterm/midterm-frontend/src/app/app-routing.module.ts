import { NgModule } from '@angular/core';
import {Routes, RouterModule } from '@angular/router';


import {EmployeeProfileComponent} from './employee-profile/employee-profile.component';


const routes: Routes = [
  {path: 'employeeProfile', component: EmployeeProfileComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
