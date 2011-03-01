package test;

import java.util.*;
import java.text.*;

/**
 * playing with the java API a bit
 * @author mhh91
 */
public class IO {

    public static void main(String[] args) {
        Date now = new Date();
        Locale loc = new Locale("AR","EG");
        DateFormat df = DateFormat.getDateInstance(DateFormat.LONG, loc);
        NumberFormat nf = NumberFormat.getCurrencyInstance(loc);
        String num = nf.format(2300);
        String formatted = df.format(now);
        System.out.println(formatted);
        System.out.println(num);
    }

}
