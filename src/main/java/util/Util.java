package util;

import edu.ncsu.group9.jobPortal.model.Student;

import java.util.Random;
import java.util.UUID;

public class Util {

    public static String generateStudentId(Student student) {
        return UUID.fromString(student.getFirstName()+student.getLastName()).toString();
    }

}
