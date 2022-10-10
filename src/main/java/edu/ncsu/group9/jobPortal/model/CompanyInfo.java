package edu.ncsu.group9.jobPortal.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.persistence.Id;
import javax.validation.constraints.NotNull;

@ApiModel(description = "Represent company information")
public class CompanyInfo {

    @Id
    @ApiModelProperty("Represents a unique comapny Id")
    private int companyId;

    @NotNull(message = "companyName is mandatory")
    @ApiModelProperty("Represents the company name")
    private String companyName;


    @NotNull(message = "jobType is mandatory")
    @ApiModelProperty("Represents the Job Type")
    private String jobType;

    @ApiModelProperty("Represents the job description")
    @NotNull(message = "profileDescription is mandatory")
    private String profileDescription;

    @NotNull(message = "streamType is mandatory")
    @ApiModelProperty("Represents the stream for which the role is open")
    private String streamType;

    @NotNull(message = "jobUrl is mandatory")
    @ApiModelProperty("Represents the application URL")
    private String jobUrl;

    @NotNull(message = "validity is mandatory")
    @ApiModelProperty("Represents uptil when a job seeker can apply")
    private String validity;

    public CompanyInfo() {
    }

    public CompanyInfo(int companyId, String companyName, String jobType, String profileDescription, String streamType, String jobUrl, String validity) {
        this.companyId = companyId;
        this.companyName = companyName;
        this.jobType = jobType;
        this.profileDescription = profileDescription;
        this.streamType = streamType;
        this.jobUrl = jobUrl;
        this.validity = validity;
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
