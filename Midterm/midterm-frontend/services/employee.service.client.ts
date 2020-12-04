
import {Injectable} from '@angular/core';

@Injectable()export class EmployeeService{findAllEmployees = () =>
  fetch('http://midtermbackend-env.eba-8atwttu4.us-east-2.elasticbeanstalk.com/api/v1/getEmployees').then(response => response.json())
}
