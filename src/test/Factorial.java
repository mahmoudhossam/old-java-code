package test;

import java.util.Scanner;

/**
 *
 * @author mhh91
 */
public class Factorial {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.print("Enter an integer: ");
        Scanner scanner = new Scanner(System.in);
        int i = scanner.nextInt();
        System.out.println(calculate(i));
    }

    public static double calculate(int number){
        if (number > 0){
            int result = 1;
        for(int i = 1; i <= number; i++){
            result *= i;
        }
        return result;
        } else if(number == 0) {
            return 0;
        } else {
            String message = "Cannot calculate factorial for a negative integer";
            throw new IllegalArgumentException(message);
        }
    }

}
