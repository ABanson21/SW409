import {Injectable} from '@angular/core';

@Injectable()
export class UserService {
  users = [
    {_id: 123, username: 'bob', password: 'bobpassword'},
    {_id: 345, username: 'dad', password: 'dadpassword'}
  ];

  findUserByCredentials(username: String, password: String) {
    for (let i = 0; i < this.users.length; i++) {
      const user = this.users[i];
      if (username === user.username && password === user.password) {
        return user;
      }
    }
    return null;
  }
  findUserFromId(id: number){
    for (let a = 0; a < this.users.length; a++){
      const temp = this.users[a];
      if (id === temp._id){
        return temp;
      }
    }
    return null;
  }

}
