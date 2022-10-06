import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';

@Injectable({
    providedIn: 'root',
})
export default class UsersService {
    private url: string;
    constructor(private http: HttpClient) {
        this.url =
            'http://localhost:8085/dashboard/get/all';
    }

    public getCompanies() {
        return this.http.get(this.url);
    }
}
