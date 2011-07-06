package test;

/**
 * this class attempts to get the current time without using the Date class
 * @author mhh91
 */

import java.util.*;

public class Time {

    public static void main(String[] args) {
        Calendar cal = Calendar.getInstance(TimeZone.getTimeZone("EET"));
        Locale egloc = new Locale("Ar","EG");
        Calendar eg = Calendar.getInstance(egloc);
        System.out.println(eg.getDisplayName(Calendar.DAY_OF_WEEK,Calendar.SHORT,Locale.US));
        int hour = cal.get(Calendar.HOUR);
        int minute = cal.get(Calendar.MINUTE);
        int second = cal.get(Calendar.SECOND);
        System.out.println(hour + ":" + minute + ":" + second);
    }

}
