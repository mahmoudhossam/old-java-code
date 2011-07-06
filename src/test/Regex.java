package test;

import java.io.*;
import java.util.Scanner;
import java.util.regex.*;

/**
 * playing around with regex
 *
 * @author mhh91
 */
public class Regex {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//        File src = new File("/home/mhh91/Desktop/text");
//        String input = null;
//        try {
//            input = readFile(src);
//        } catch (FileNotFoundException ex) {
//            Logger.getLogger(Regex.class.getName()).log(Level.SEVERE, null, ex);
//        } catch (IOException ex) {
//            Logger.getLogger(Regex.class.getName()).log(Level.SEVERE, null, ex);
//        }
        System.out.print("Enter something to look for: ");
        Pattern p = Pattern.compile(scanner.nextLine());
        System.out.print("Enter text to search in: ");
        Matcher m = p.matcher(scanner.nextLine());
        while(m.find()){
            System.out.println("Match starts at " + m.start() + " and ends at " + m.end());
        }
        
    }

    private static String readFile(File input) throws FileNotFoundException, IOException{
        StringBuilder read = new StringBuilder();
        if (input.exists()){
            FileReader reader = new FileReader(input);
            BufferedReader buffered = new BufferedReader(reader);
            while(buffered.ready()){
                read.append(buffered.readLine());
            }
        }
        return read.toString();
    }

}
