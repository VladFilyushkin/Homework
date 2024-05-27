import java.util.Scanner;

public class homework3 {
    public static void main(String[] args) {
        System.out.print("Введите abcd число: ");
        Scanner scanner = new Scanner(System.in);
        int number = 0;
        if (scanner.hasNextInt()) {


            number = scanner.nextInt();

            if (number > 9999 && number < 100000 || number < -9999 && number > -100000) {

                int a = Math.abs((number/100)%10);



                System.out.println("Третья цифра пятизначного числа: "+a);
            } else {
                System.out.println("Неверный формат числа!");
            }
        } else {
            System.out.println("Неверный формат числа!");

        }
    }
}

