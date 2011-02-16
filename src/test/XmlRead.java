package test;

import org.apache.commons.io.input.XmlStreamReader;
import org.apache.commons.io.output.XmlStreamWriter;
import java.io.*;
import java.net.*;

public class XmlRead {

    public static void main(String[] args) throws MalformedURLException, IOException {
        URL url = new URL("http://mahmoudhossam.tumblr.com/api/read?num=50");
        XmlStreamReader xmlread = new XmlStreamReader(url.openConnection(),"UTF-8");
        BufferedReader buffered = new BufferedReader(xmlread);
        File output = new File("/home/mhh91/Desktop/output.txt");
        if(output.exists()){
            output.delete();
            output.createNewFile();
        }
        PrintWriter writer = new PrintWriter(new XmlStreamWriter(output,"UTF-8"));
        while(buffered.readLine() != null){
            writer.println(buffered.readLine());
        }
        writer.flush();
    }

}
