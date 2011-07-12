package test;

/**
 *
 * @author mhh91
 */
public class Biggest {

    public static void main(String[] args) {
        int[] testNumbers = {90, 30, 9, 5, 7, 20, 50};
        Biggest biggest = new Biggest();
        System.out.println(biggest.getBiggest(testNumbers));
    }

    public int getBiggest(int[] numbers) {
        int result = numbers[0];
        for (int i : numbers) {
            result = isBigger(i, result) ? i : result;
        }
        return result;
    }

    public boolean isBigger(int a, int b) {
        if (a > b) {
            return true;
        } else {
            return false;
        }
    }
}