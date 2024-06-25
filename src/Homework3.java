import java.util.Arrays;
public class Homework3 {
    public static void main(String[] args) {
        int[] array = {5, 12, 9, -25, 8, 15, 7, 14, 20, -18, 9, 5};
        int[] array2 = new int[array.length];
        int count = 0;
        int index = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array2.length; j++) {
                if (array[i] == array2[j]) {
                    count++;
                }
            }
            if (count == 0) {
                array2[index] = array[i];
                index++;
            }
            count = 0;
        }
        int[] array3 = new int[index];
        for (int i = 0; i < array3.length; i++) {
            array3[i] = array2[i];
        }
        System.out.println(Arrays.toString(array3));
    }
}
