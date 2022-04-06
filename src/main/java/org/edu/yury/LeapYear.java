package org.edu.yury;

public class LeapYear {

    public static boolean isLeapYear(int year) {
        boolean betweenZeroAnd999 = year > 0 && year < 9999;
        if (!betweenZeroAnd999) {
            return false;
        }

        if (year % 4 == 0 && year % 100 != 0) {
            return true;
        }

        return year % 100 == 0 && year % 400 == 0;
    }
}



