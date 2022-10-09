import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import DashboardService from '../services/dashboard.service';

@Component({
    selector: 'app-dashboard',
    templateUrl: './dashboard.component.html',
    styleUrls: ['./dashboard.component.css'],
})
export class DashboardComponent implements OnInit {
    companies: any;
    constructor(private service: DashboardService, private router: Router) {}

    ngOnInit(): void {
        let resp = this.service.getCompanies();
        resp.subscribe((data) => {
            this.companies = data;
        });
    }

    logout(){
        this.router.navigate(['login'])

    }
}
