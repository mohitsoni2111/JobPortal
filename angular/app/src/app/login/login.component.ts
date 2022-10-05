import { Component, OnInit } from '@angular/core';
import { LoginService } from '../services/login.service';
import { User } from './user';

@Component({
    selector: 'app-login',
    templateUrl: './login.component.html',
    styleUrls: ['./login.component.css'],
})
export class LoginComponent implements OnInit {
    message: any;
    userId: string;
    userPassword: string;
    constructor(private service: LoginService) {
        this.message;
        this.userId = '';
        this.userPassword = '';
    }

    ngOnInit(): void {}

    public loginNow() {
        let user: User = new User(this.userId, this.userPassword);
        let resp = this.service.login(user);
        resp.subscribe((data) => {
            this.message = data;
        });
    }
}
