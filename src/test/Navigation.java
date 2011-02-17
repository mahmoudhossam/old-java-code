package test;

import java.io.*;

/**
 *  a class to navigate a folder
 * 
 * @author mhh91
 */

public class Navigation {

    public static void main(String[] args) {
        File library = new File("/media/Data/Music Library/");
        Filter filter = new Filter();
        for (File f : library.listFiles(filter)){
            if (f.isFile()){
                System.out.println(f.getName());
            }
        }
    }

}

class Filter implements FilenameFilter{

    public boolean accept(File dir, String name) {
        if (dir.isDirectory() && name.endsWith(".mp3")){
            return true;
        } else return false;
    }

}