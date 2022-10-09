import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import DashboardService from '../services/dashboard.service';

@Component({
  selector: 'app-coordinatordashboard',
  templateUrl: './coordinatordashboard.component.html',
  styleUrls: ['./coordinatordashboard.component.css']
})
export class CoordinatordashboardComponent implements OnInit {
  companies: any;
    constructor(private service: DashboardService, private router: Router) {}

    ngOnInit(): void {
        let resp = this.service.getCompanies();
        resp.subscribe((data) => {
            this.companies = data;
        });
    }

    
    redirectAddNewJob(){
      this.router.navigate(['jobs']);
  }
  
  logout(){
    this.router.navigate(['login'])

}
}
