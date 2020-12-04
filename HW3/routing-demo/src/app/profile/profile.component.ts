import { Component, OnInit } from '@angular/core';
import {ActivatedRoute} from '@angular/router';
import {UserService} from '../../services/user.service.client';


@Component({
  selector: 'app-profile',
  templateUrl: './profile.component.html',
  styleUrls: ['./profile.component.css']
})
export class ProfileComponent implements OnInit {

  constructor(private activatedRoute: ActivatedRoute, private userService: UserService) {
  }

  userId: String;
  userName: String;
  ngOnInit(): void {this.activatedRoute.params.subscribe(params => this.userId = params.userId);
  }

  displayUserName(userId){
    const user = this.userService.findUserFromId(Number(userId));
    if (user != null){
      return user.username;
    }
  }
}

