# Job Portal

[![DOI](https://zenodo.org/badge/545554067.svg)](https://zenodo.org/badge/latestdoi/545554067)
<a href="https://github.com/mohitsoni2111/jobPortal/blob/main/LICENSE"><img 
alt="License" src="https://img.shields.io/github/license/mohitsoni2111/jobPortal"></a>
[![GitHub Release](https://img.shields.io/github/release/mohitsoni2111/jobPortal.svg)](https://github.com/mohitsoni2111/jobPortal/releases)
[![Build](https://github.com/mohitsoni2111/jobPortal/actions/workflows/build.yml/badge.svg)](https://github.com/mohitsoni2111/jobPortal/actions/workflows/build.yml)
[![Test](https://github.com/mohitsoni2111/jobPortal/actions/workflows/test.yml/badge.svg)](https://github.com/mohitsoni2111/jobPortal/actions/workflows/test.yml)
[![codecov](https://codecov.io/gh/mohitsoni2111/jobPortal/branch/main/graph/badge.svg?token=0VDF297S0Z)](https://codecov.io/gh/mohitsoni2111/jobPortal)
[![GitHub contributors](https://img.shields.io/github/contributors/mohitsoni2111/jobPortal)](https://github.com/mohitsoni2111/jobPortal/graphs/contributors)
[![Open Issues](https://img.shields.io/github/issues/mohitsoni2111/jobPortal)](https://github.com/mohitsoni2111/jobPortal/issues)
![Closed issues](https://img.shields.io/github/issues-closed/mohitsoni2111/jobPortal?color=bright-green)
[![Pull Requests](https://img.shields.io/github/issues-pr/mohitsoni2111/jobPortal)](https://github.com/mohitsoni2111/jobPortal)
![Lines of code](https://img.shields.io/tokei/lines/github.com/mohitsoni2111/jobPortal)
<!-- [![GitHub Repo Size](https://img.shields.io/github/repo-size/mohitsoni2111/jobPortal.svg)](https://img.shields.io/github/repo-size/mohitsoni2111/jobPortal.svg) -->

---

## Table of Contents

1. [About](#about)
2. [Application Preview](#application-preview)
3. [Getting started](#getting-started)
   - [Prerequisites](#prerequisites)
   - [Installation](#installation)
   - [Running the Application](#running-the-application)
4. [Development Specifications](#development-specifications)
5. [License](#license)
6. [Future Scope](#future-scope)
   - [Phase 2](#phase-2)
7. [Contributors](#contributors)



## About

"JobPortal" is a web application for students to find all the job listings at one place instead of going through a bunch of different websites for the same. Coordinators can post new job listing which can be viewed by the students.

Watch the following video to know more

https://user-images.githubusercontent.com/50794731/194797136-057f4986-afb8-48a0-acb5-86f1e2449452.mp4


## Application Preview

### Demonstration Video
https://user-images.githubusercontent.com/50794731/194788576-9d0ba593-b93a-4837-850e-71d28d2cf067.mp4


### Student Registration Page
<img width="1200"  src="/images/studentregistration.png">

### Login Page
<img width="1200"  src="/images/login.png">

### Invalid Login Attempt
<img width="1200"  src="/images/invalidlogin.png">

### Student Dashboard
<img width="1200"  src="/images/studentdashboard.png">

### Coordinator Dashboard
<img width="1200"  src="/images/coordinatordashboard.png">
     
### Adding a New Job
<img width="1200"  src="/images/addjob.png">

## Getting Started

### Prerequisites
Install the following dependencies

- [Java](https://www.oracle.com/java/technologies/javase/javase8u211-later-archive-downloads.html) 1.8
- [Maven](https://maven.apache.org/download.cgi) 3.8.6 or higher
- [node](https://nodejs.org/en/download/) 16.17.1
- [npm](https://www.npmjs.com/package/npm) 8.19.2
- [angular cli](https://angular.io/cli) 14.2.4
- [MySQL Workbench](https://dev.mysql.com/downloads/workbench/)
- [Intellij IDEA](https://www.jetbrains.com/idea/)

### Installation
Step 1: Clone the repository through the terminal.

```
git clone https://github.com/mohitsoni2111/jobPortal.git

cd jobPortal
```

Step 2: Set up the database by running [dbSetup.sql](./src/main/resources/dbSetup.sql). Update [application.properties](./src/main/resources/application.properties) with your db credentials.

Step 3: Install the required node modules.
```
cd angular/app
npm install
```

### Running the Application

Step 1:
While in the `angular/app` directory, run the following command for a dev server of the front-end.

```
ng serve --open
```
Navigate to `http://localhost:4200/`. The application will automatically reload if you change any of the source files.

Step 2: Within the Intellij IDEA IDE, run the SpringBoot Runner Class ([JobPortalApplicationRunner.java](src/main/java/edu/ncsu/group9/jobPortal/JobPortalApplicationRunner.java)) to start the backend server.

## Development Specifications

![springBoot](https://img.shields.io/badge/Spring_Boot-F2F4F9?style=for-the-badge&logo=spring-boot)
![Angular](https://img.shields.io/badge/Angular-DD0031?style=for-the-badge&logo=angular&logoColor=white)
![MySQL](https://img.shields.io/badge/MySQL-005C84?style=for-the-badge&logo=mysql&logoColor=white)
![junit5](https://img.shields.io/badge/Junit5-25A162?style=for-the-badge&logo=junit5&logoColor=white)
![html5](https://img.shields.io/badge/HTML5-E34F26?style=for-the-badge&logo=html5&logoColor=white)
![CSS3](https://img.shields.io/badge/CSS3-1572B6?style=for-the-badge&logo=css3&logoColor=white)
![VsCode](https://img.shields.io/badge/VSCode-0078D4?style=for-the-badge&logo=visual%20studio%20code&logoColor=white)
![git](https://img.shields.io/badge/GIT-E44C30?style=for-the-badge&logo=git&logoColor=white)

The above-mentioned technologies were used to develop the project.



## License

This project is licensed under [MIT](https://mit-license.org/).
Further details regarding the license can be found [here](https://github.com/mohitsoni2111/jobPortal/blob/main/LICENSE).


## Future Scope
Job Search can be a daunting task and although the availibility of multiple platforms makes it somewhat easier, it doesn't entirely streamline all tasks, or provide help for all categories of job vacancies. The future scope of Job Portal includes addition of various functionalities as mentioned below. 

### Phase 2
  

1. **User Profile Creation** - Job Portal will allow the users to define their own profiles, with the inclusion of their profile image, academic status and qualifications, it can also include the option to add legal status as certain jobs are not available to international students.

2. **Resume Upload** - The option to include and upload one's resume will be added in the phase, to provide a summarised statement of information for recruiters and allow easy sharing of profiles.

3. **Job Analysis** - Applicants can be provided with the option to analyse jobs and study their requirements, additionally they can be provided with features will allow them to compare pays for the same position across multiple companies.

4. **Profile Verification** - The next phase will integrate a verification step to ensure that only authorized and verified users are allowed to access the platform, thereby disallowing multiple profile creations.
5. **OTP and Email Verification** - The next phase will provide a functionality to verify a student by 2-way authentication, i.e., Authentication via OTP and email verification.

 
## Contributors

- [Mohit Soni](https://github.com/mohitsoni2111)
- [Tilak Satra](https://github.com/tilaksatra)
- [Akshat Savla](https://github.com/akshat22)
- [Madiha Mansoori](https://github.com/madiha2001)
- [Anagha Patil](https://github.com/Anagha-2000)
