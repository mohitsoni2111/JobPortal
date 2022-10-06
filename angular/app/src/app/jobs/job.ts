export class Job {
    companyName: string;
    jobType: string;
    profileDescription: string;
    streamType: string;
    jobUrl: string;
    validity: string;
    constructor(
        companyName: string,
        jobType: string,
        profileDescription: string,
        streamType: string,
        jobUrl: string,
        validity: string
    ) {
        this.companyName = companyName;
        this.jobType = jobType;
        this.profileDescription = profileDescription;
        this.streamType = streamType;
        this.jobUrl = jobUrl;
        this.validity = validity;
    }
}
