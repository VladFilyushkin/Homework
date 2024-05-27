import java.util.Scanner;

public class homework21 {
    public static void main(String[] args) {
        System.out.print("Введите abcd число: ");
        Scanner scanner = new Scanner(System.in);
        int number = 0;
        if (scanner.hasNextInt()) {
            number = scanner.nextInt();

            if (number > 999 && number < 10000 || number < -999 && number > -10000) {


                int a = (number / 1000);
                int b = ((number / 100)%10);
                int c = ((number/10)%10);
                int d = (number%10);


                System.out.println("Сумма ab+cd = " + (a*b + c*d));//Вывод суммы.
            } else {
                System.out.println("Неверный формат числа!");
            }


        }
    }
}

