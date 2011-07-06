package test;

import java.util.Scanner;

/**
 * a class to reverse a string
 *
 * @author mhh91
 */
public class Reverse {

    public static void main(String[] args) {
        System.out.print("Enter a string to reverse: ");
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        for (int i = input.length()-1 ; i > -1 ; i--){
            System.out.print(input.charAt(i));
        }
        System.out.println();
    }

}