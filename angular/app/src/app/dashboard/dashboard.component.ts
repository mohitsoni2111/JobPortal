import { Component, OnInit } from '@angular/core';
import DashboardService from '../services/dashboard.service';

@Component({
    selector: 'app-dashboard',
    templateUrl: './dashboard.component.html',
    styleUrls: ['./dashboard.component.css'],
})
export class DashboardComponent implements OnInit {
    companies: any;
    constructor(private service: DashboardService) {}

    ngOnInit(): void {
        let resp = this.service.getCompanies();
        resp.subscribe((data) => {
            this.companies = data;
        });
    }
}
