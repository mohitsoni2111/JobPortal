import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';

@Injectable({
    providedIn: 'root',
})
export class LoginService {
    private url: string;
    constructor(private http: HttpClient) {
        this.url = 'http://localhost:8085/user/login';
    }

    public login(user: any) {
        console.log(user);
        return this.http.post(this.url, user, {
            responseType: 'text' as 'json',
        });
    }
}
