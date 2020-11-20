import { Component, OnInit } from '@angular/core';
import {ActivatedRoute} from '@angular/router';

@Component({
  selector: 'app-profile',
  templateUrl: './profile.component.html',
  styleUrls: ['./profile.component.css']
})
export class ProfileComponent implements OnInit {

  constructor(private activatedRoure: ActivatedRoute) { }
  userId: String;

  ngOnInit(): void {
    this.activatedRoure.params.subscribe(params => this.userId = params['userId']);
  }

}
