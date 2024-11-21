package Task;
import java.util.*;
import java.util.concurrent.TimeUnit;

public class RandomAlphabetsPrinter {

    public static void main(String[] args) {
        // Creation of lists of alphabets
        List<Character> alphabets = new ArrayList<>();
        for (char c = 'A'; c <= 'Z'; c++) {
            alphabets.add(c);
        }

        // Loop for random alphabets 26
        for (int i = 0; i < 26; i++) {
            // it will shuffle the alphabets
            Collections.shuffle(alphabets);
            
            // It will pick random alphabets
            char randomChar = alphabets.get(0);

            // for printing random character
            System.out.print(randomChar + " ");

            // Random digits delay 100 to 500ms
            int randomDelay = 100 + (int)(Math.random() * 400);
            try {
                TimeUnit.MILLISECONDS.sleep(randomDelay);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
