package test;

import java.awt.*;
import java.io.*;


public class Tk {

    public static void main(String[] args) throws IOException {
        Toolkit tk = Toolkit.getDefaultToolkit();
        Dimension size = tk.getScreenSize();
        String message = "Your screen resolution is " + size.width + " * " + size.height;
        System.out.println(message);
    }

}
