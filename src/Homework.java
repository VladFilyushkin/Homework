import java.util.Scanner;

public class Homework {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int i = scanner.nextInt();
        if(i<0){
            i=Math.abs(i);
        }
        System.out.println("Последняя цифра числа = "+i%10);

    }
}
