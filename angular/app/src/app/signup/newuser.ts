export class NewUser {
    studentId: string;
    firstName: string;
    lastName: string;
    emailId: string;
    password: string;
    degree: string;
    course: string;
    phoneNumber: string;
    constructor(
        studentId: string,
        firstName: string,
        lastName: string,
        emailId: string,
        password: string,
        degree: string,
        course: string,
        phoneNumber: string
    ) {
        this.studentId = studentId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.emailId = emailId;
        this.password = password;
        this.degree = degree;
        this.course = course;
        this.phoneNumber = phoneNumber;
    }
}
