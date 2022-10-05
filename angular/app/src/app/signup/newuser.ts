export class NewUser {
    studentid: string;
    firstname: string;
    lastname: string;
    password: string;
    emailid: string;
    degree: string;
    course: string;
    phone: string;
    constructor(
        studentid: string,
        firstname: string,
        lastname: string,
        password: string,
        emailid: string,
        degree: string,
        course: string,
        phone: string
    ) {
        this.studentid = studentid;
        this.firstname = firstname;
        this.lastname = lastname;
        this.password = password;
        this.emailid = emailid;
        this.degree = degree;
        this.course = course;
        this.phone = phone;
    }
}
