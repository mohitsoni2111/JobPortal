import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';

@Injectable({
    providedIn: 'root',
})
export default class DashboardService {
    private url: string;
    constructor(private http: HttpClient) {
        this.url =
            'http://localhost:8085/dashboard/get/all';
            //'https://run.mocky.io/v3/3e635cbe-68cc-4cf4-8c33-59babd753437';
    }

    public getCompanies() {
        return this.http.get(this.url);
    }
}
