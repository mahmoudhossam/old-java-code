package test;

import java.util.*;

/**
 *
 * @author mhh91
 */
public class Collection {

    public static void main(String[] args) {
        TreeSet<String> ts = new TreeSet<String>();
        ts.add("Ziad");
        ts.add("Mahmoud");
        ts.add("Yusra");
        ts.add("Sarah");
        ts.add("Ahmed");
        ts.add("Marwan");
        ts.add("Mohamed");
        Iterator<String> it = ts.descendingIterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
    }

}
