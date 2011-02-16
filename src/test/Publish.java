package test;

import java.io.*;
import java.net.*;

public class Publish {

    public static void main(String[] args) throws MalformedURLException {
        try {
            String quote = "something";
            String type = "quote";
            String source = "src";
            String pass = "it\'sme";
            String email = "mhh91@hotmail.com";
            //URL url = new URL("http://www.tumblr.com/api/authenticate?email=mhh91@hotmail.com&password=it\'sme");
            URL PostUrl = new URL("http://www.tumblr.com/api/write?email=" + email + "&password=" + pass + "&type=" + type + "&quote=" + quote + "&source=" + source);
            URLConnection conn = PostUrl.openConnection();
            conn.setDoOutput(true);
            BufferedReader reader = new BufferedReader(new InputStreamReader(conn.getInputStream()));
            while (reader.ready()) {
                System.out.println(reader.readLine());
            }
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }

}
