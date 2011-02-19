package test;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Scanner;
import org.apache.commons.codec.binary.Hex;

/**
 * a class to encode a string using SHA-1 algorithm
 * @author mhh91
 */
public class Digest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws NoSuchAlgorithmException {
        MessageDigest md = MessageDigest.getInstance("sha1");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter text to be encoded: ");
        String data = scanner.nextLine();
        scanner = null;
        md.update(data.getBytes());
        data = null;
        byte[] digest = md.digest();
        md = null;
        String hash = Hex.encodeHexString(digest);
        System.out.println("Your code is: " + hash);
    }

}
