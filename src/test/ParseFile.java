package test;


import java.io.*;
import java.util.*;
/**
 *
 * @author mhh91
 */
public class ParseFile {

    public static void main(String[] args) throws Exception {
        File src = new File("/home/mhh91/Desktop/text");
        HashMap<Integer, String> map = null;
        if(src.exists()){
            Scanner scanner = new Scanner(src);
            map = new HashMap<Integer, String>();
            while(scanner.hasNext()){
                map.put(scanner.next().hashCode(), scanner.next());
            }
        }
        Scanner scanner = new Scanner(System.in);
        String find = "";
        while (true){
            System.out.print("Enter a word to search for: ");
            find = scanner.next();
            String element = map.get(find.hashCode());
            if (element != null){
                System.out.println("Match found.");
            } else if (find.equals("exit")){
                System.exit(0);
            } else System.out.println("Match not found.");
        }
    }

}
