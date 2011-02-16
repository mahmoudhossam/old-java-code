package test;

/**
 *  This class copies a file to another location
 * @author mhh91
 */

import java.io.*;
import org.apache.commons.io.FileUtils;

public class Copy {

    public static void main(String[] args) throws FileNotFoundException, IOException {
        File src = new File("/home/mhh91/Desktop/tutor");
        FileUtils.copyFile(src,new File("/home/mhh91/Desktop/copy"));
        System.out.println("Done");
    }

}
