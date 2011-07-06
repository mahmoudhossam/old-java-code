package test;

import java.io.*;
import java.util.*;
/**
 * playing with the java API a bit
 * 
 * @author mhh91
 */
public class API {

    public static void main(String[] args) {
        new API().dateTime();
    }

    public void writeToFile(){
            FileWriter fw = null;
            try {
                File file = new File("/home/mhh91/Desktop/test.txt");
                fw = new FileWriter(file, true);
                Scanner scanner = new Scanner(System.in);
                System.out.print("Enter text to output to file: ");
                fw.write(scanner.nextLine());
                fw.write('\n');
                fw.flush();
                fw.close();
                FileReader fr = new FileReader(file);
                char[] buffer = new char[100];
                fr.read(buffer);
                for (char c : buffer) {
                    if (c != 0) {
                        System.out.print(c);
                    }
                }
            } catch (IOException ex) {
                
            } finally {
                try {
                    fw.close();
                } catch (IOException ex) {
                    
                }
            }
    }

    public void dateTime(){
        Calendar cal = Calendar.getInstance();
        int yoom = cal.get(Calendar.DAY_OF_MONTH);
        int sa3a = cal.get(Calendar.HOUR);
        int d2ee2a = cal.get(Calendar.MINUTE);
        int sanya = cal.get(Calendar.SECOND);
        System.out.println("day: " + yoom);
        System.out.println("hour: " + sa3a);
        System.out.println("minute: " + d2ee2a);
        System.out.println("second: " + sanya);
    }
}
