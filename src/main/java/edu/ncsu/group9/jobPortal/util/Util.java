package edu.ncsu.group9.jobPortal.util;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Util {

    public static String getYYYYMMDDDate() {
        LocalDate dateObj = LocalDate.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        String date = dateObj.format(formatter);
        return date;
    }

}
