import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import {EmployeeProfileComponent } from './employee-profile/employee-profile.component';
import {RouterModule} from '@angular/router';
import {FormsModule} from '@angular/forms';
import {EmployeeService} from '../../services/employee.service.client';

@NgModule({
  declarations: [
    AppComponent,
    EmployeeProfileComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    RouterModule,
    FormsModule
  ],
  providers: [
    EmployeeService
  ],
  bootstrap: [AppComponent]
})
export class AppModule { }
