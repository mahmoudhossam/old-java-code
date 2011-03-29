package test;

public class BetterProgrammerTask {

    public static int countWords(String s) {
        String[] words = s.split("\\s");
        return words.length;
    }
}
