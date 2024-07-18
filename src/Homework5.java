import java.util.Arrays;
import java.util.Scanner;

public class Homework5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        String[] words = str.split(" ");
        System.out.println(Arrays.toString(words));

        int maxWordLength = 0;
        int minWordLength = words[0].length();
        int maxWordLengthIndex = 0;
        int minWordLengthIndex = 0;
        for (int i = 0; i < words.length; i++) {
            int maxlength = words[i].length();
            if (maxlength > maxWordLength) {
                maxWordLength = maxlength;
                maxWordLengthIndex = i;
            }
        }
        for (int j = 0; j < words.length; j++) {
            int minlength = words[j].length();
            if (minlength <= minWordLength) {
                minWordLength = minlength;
                minWordLengthIndex = j;
            }

        }
        String swap = words[minWordLengthIndex];
        words[minWordLengthIndex] = words[maxWordLengthIndex];
        words[maxWordLengthIndex] = swap;
        System.out.println(Arrays.toString(words));
    }
}


