package test;

import org.apache.commons.codec.digest.DigestUtils;
import java.io.Console;

/**
 *
 * @author mhh91
 */
public class Auth {
    private static final String HASH = "e49390f1e6b803831ba36e6bdbd05220";

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Console con = System.console();
        con.printf("Enter password: ");
        char[] pw = con.readPassword();
        String input = new String(pw);
        String InputHash = DigestUtils.md5Hex(input);
        pw = null;
        input = null;
        if (InputHash.equals(HASH)){
            System.out.println("Access Granted.");
        } else {
            System.out.println("Access Denied!");
        }
    }

}
