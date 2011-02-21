package test;

/**
 * this class attempts to get the current time without using the Date class
 * @author mhh91
 */

import java.util.Calendar;
import java.util.TimeZone;

public class Time {

    public static void main(String[] args) {
        Calendar cal = Calendar.getInstance(TimeZone.getTimeZone("EET"));
        int hour = cal.get(Calendar.HOUR);
        int minute = cal.get(Calendar.MINUTE);
        int second = cal.get(Calendar.SECOND);
        System.out.println(hour + ":" + minute + ":" + second);
    }

}
