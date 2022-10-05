import { Component, OnInit } from '@angular/core';
import { LoginService } from '../login.service';
import { User } from '../user';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css'],
})
export class LoginComponent implements OnInit {
  user: User = new User('', '');
  message: any;
  constructor(private service: LoginService) {}

  ngOnInit(): void {}

  public loginNow() {
    let resp = this.service.login(this.user);
    resp.subscribe((data) => {
      this.message = data
      console.log(this.message)});
  }
}
