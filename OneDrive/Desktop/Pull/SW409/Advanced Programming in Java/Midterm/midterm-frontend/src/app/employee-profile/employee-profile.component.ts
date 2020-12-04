import { Component, OnInit } from '@angular/core';
import {EmployeeService} from '../../../services/employee.service.client';

@Component({
  selector: 'app-employee-profile',
  templateUrl: './employee-profile.component.html',
  styleUrls: ['./employee-profile.component.css']
})
export class EmployeeProfileComponent implements OnInit {
  public employees: any;

  constructor(private employeeService: EmployeeService) { }

  ngOnInit(): void {
  this.employeeService.findAllEmployees().then(employee => this.employees = employee);
  }
}
