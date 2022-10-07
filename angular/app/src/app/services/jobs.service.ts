import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Job } from '../jobs/job';

@Injectable({
  providedIn: 'root'
})
export class JobsService {

  private url: string;
    constructor(private http: HttpClient) {
        this.url = 'http://localhost:8085/dashboard/add';
    }

  public addjob(newjob: Job) {
        console.log(newjob);
        return this.http.post(this.url, newjob, {
            responseType: 'text' as 'json',
        });
    }
}
