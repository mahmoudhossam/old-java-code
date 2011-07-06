package test;

import java.util.Scanner;

/**
 *
 * @author mhh91
 */
public class Fibonacci {

    public static void main(String[] args) {
        System.out.println("Welcome to the fibonacci number generator!");
        System.out.print("Please enter an integer: ");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println("The number you requested is: " + getNumber(n));
        
    }

    public static int getNumber(int number){
        int[] sequence = new int[number];
        sequence[0] = 0;
        sequence[1] = 1;
        for(int i = 2; i < sequence.length; i++){
            sequence[i] = sequence[i-1] + sequence[i-2];
        }
        return sequence[sequence.length - 1];
    }

}
