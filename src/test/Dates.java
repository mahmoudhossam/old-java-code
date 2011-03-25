package test;

import java.text.*;
import java.util.*;


public class Dates {

    public static void main(String[] args) {
        try {
            Locale eg = new Locale("Ar", "Eg");
            DateFormat df = DateFormat.getDateInstance(DateFormat.SHORT, eg);
            String date = "3/03/2003";
            Date d = df.parse(date);
            DateFormat df2 = DateFormat.getDateInstance(DateFormat.FULL);
            System.out.println(df2.format(d));
        } catch (ParseException ex) {
            System.out.println("Error parsing at " + ex.getErrorOffset());
        }
    }

}
