import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { NewUser } from '../signup/newuser';

@Injectable({
    providedIn: 'root',
})
export class SignupService {
    private url: string;
    constructor(private http: HttpClient) {
        this.url = 'http://localhost:8085/user/add';
    }

    public signup(newuser: NewUser) {
        console.log(newuser);
        return this.http.post(this.url, newuser, {
            responseType: 'text' as 'json',
        });
    }
}
