package test;

/**
 *
 * @author mhh91
 */

import java.util.*;

public class Maps {

    public static void main(String[] args) {
        TreeMap<String, String> map = new TreeMap<String, String>();
        map.put("type", "regular");
        map.put("stuff", "that blows");
        for (String key : map.keySet()){
            System.out.println("key is " + key + ", value is \"" + map.get(key)+ "\"");
        }
    }
}
