package test;


import javax.swing.*;
import java.awt.*;
import java.io.*;

public class Tray extends JFrame {

    public static void main(String[] args) {
        if(SystemTray.isSupported()){
            SystemTray tray = SystemTray.getSystemTray();
            String imgPath = new Tray().readPath("path.conf");
            TrayIcon icon = new TrayIcon(Toolkit.getDefaultToolkit().getImage(imgPath));
            try {
                tray.add(icon);
            } catch (AWTException ex) {
                System.out.println(ex.getMessage());
            }
        } else {
            System.out.println("Sorry!");
            System.exit(1);
        }
    }
    public String readPath(String src){
        String path = "";
        File f = new File(src);
        try {
            BufferedReader reader = new BufferedReader(new FileReader(f));
            reader.readLine();
        } catch (FileNotFoundException ex) {
            System.out.println(ex.getMessage());
        } catch (IOException ex){
            System.out.println(ex.getMessage());
        }
        return path;
    }
}