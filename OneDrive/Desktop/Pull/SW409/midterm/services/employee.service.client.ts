
import {Injectable} from '@angular/core';

@Injectable()export class EmployeeService{findAllEmployees = () =>
  fetch('http://localhost:8080/api/v1/getEmployees').then(response => response.json())
}
