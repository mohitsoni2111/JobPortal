import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { JobsService } from '../services/jobs.service';
import { Job } from './job';

@Component({
    selector: 'app-jobs',
    templateUrl: './jobs.component.html',
    styleUrls: ['./jobs.component.css'],
})
export class JobsComponent implements OnInit {
    message: any;
    companyName: string;
    jobType: string;
    profileDescription: string;
    streamType: string;
    jobUrl: string;
    validity: string;
    constructor(private service: JobsService, private router: Router) {
        this.message = '';
        this.companyName = '';
        this.jobType = '';
        this.profileDescription = '';
        this.streamType = '';
        this.jobUrl = '';
        this.validity = '';
    }

    ngOnInit(): void {}

    public addJob() {
        let newjob: Job = new Job(
            this.companyName,
            this.jobType,
            this.profileDescription,
            this.streamType,
            this.jobUrl,
            this.validity
        );

        let resp = this.service.addjob(newjob);
        resp.subscribe((data) => {
            this.message = data;
            this.router.navigate(['coordinatordashboard']);
        });
    }

    redirectCoordinatorDashboard() {
        this.router.navigate(['coordinatordashboard']);

    }

    logout() {
        this.router.navigate(['login']);
    }
}
