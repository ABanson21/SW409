import {Injectable} from '@angular/core';
@Injectable()
export class CourseService{
  // tslint:disable-next-line:max-line-length
  findAllCourses = () => fetch('http://blackboardbackend-env.eba-numkbtpn.us-east-2.elasticbeanstalk.com/api/courses').then(response => response.json());
}
