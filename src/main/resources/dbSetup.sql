-- Job portal is the schema name

CREATE TABLE Jobportal.User (
    userId varchar(255) primary key,
    userPassword varchar(255)
);

CREATE TABLE Jobportal.Student (
    studentId varchar(255) primary key,
    firstname varchar(255),
    lastname varchar(255),
    password varchar(255),
    emailId varchar(255),
    degree varchar(255),
    course varchar(255),
    phoneNumber varchar(255)
);

CREATE TABLE Jobportal.Dashboard (
    companyId Integer AUTO_INCREMENT primary key,
    companyName varchar(255),
    jobType varchar(255),
    profileDescription varchar(255),
    streamType varchar(255),
    jobUrl varchar(255),
    validity date
);