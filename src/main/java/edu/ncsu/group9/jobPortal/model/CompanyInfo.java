package edu.ncsu.group9.jobPortal.model;

import javax.persistence.Id;
import javax.validation.constraints.NotNull;

public class CompanyInfo {
    @Id
    private int companyId;
    @NotNull(message = "companyName is mandatory")
    private String companyName;
    @NotNull(message = "jobType is mandatory")
    private String jobType;
    @NotNull(message = "profileDescription is mandatory")
    private String profileDescription;
    @NotNull(message = "streamType is mandatory")
    private String streamType;
    @NotNull(message = "jobUrl is mandatory")
    private String jobUrl;
    @NotNull(message = "validity is mandatory")
    private String validity;

    public CompanyInfo(int companyId, String companyName, String jobType, String profileDescription, String streamType, String jobUrl, String validity) {
        this.companyId = companyId;
        this.companyName = companyName;
        this.jobType = jobType;
        this.profileDescription = profileDescription;
        this.streamType = streamType;
        this.jobUrl = jobUrl;
        this.validity = validity;
    }

    public CompanyInfo() {
    }

    public int getCompanyId() {
        return companyId;
    }

    public void setCompanyId(int companyId) {
        this.companyId = companyId;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getJobType() {
        return jobType;
    }

    public void setJobType(String jobType) {
        this.jobType = jobType;
    }

    public String getProfileDescription() {
        return profileDescription;
    }

    public void setProfileDescription(String profileDescription) {
        this.profileDescription = profileDescription;
    }

    public String getStreamType() {
        return streamType;
    }

    public void setStreamType(String streamType) {
        this.streamType = streamType;
    }

    public String getJobUrl() {
        return jobUrl;
    }

    public void setJobUrl(String jobUrl) {
        this.jobUrl = jobUrl;
    }

    public String getValidity() {
        return validity;
    }

    public void setValidity(String validity) {
        this.validity = validity;
    }
}
