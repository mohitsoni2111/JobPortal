import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { SignupService } from '../services/signup.service';
import { NewUser } from './newuser';

@Component({
    selector: 'app-signup',
    templateUrl: './signup.component.html',
    styleUrls: ['./signup.component.css'],
})
export class SignupComponent implements OnInit {
    message: any;
    studentId: string;
    firstName: string;
    lastName: string;
    emailId: string;
    password: string;
    degree: string;
    course: string;
    phoneNumber: string;
    constructor(private service: SignupService, private router: Router) {
        this.message = '';
        this.studentId = '';
        this.firstName = '';
        this.lastName = '';
        this.emailId = '';
        this.password = '';
        this.degree = '';
        this.course = '';
        this.phoneNumber = '';
    }

    ngOnInit(): void {}

    public signupNow() {
        let newuser: NewUser = new NewUser(
            this.studentId,
            this.firstName,
            this.lastName,
            this.emailId,
            this.password,
            this.degree,
            this.course,
            this.phoneNumber
        );

        let resp = this.service.signup(newuser);
        resp.subscribe((data) => {
            this.message = data;
            this.router.navigate(['login'])
        });
    }
}
