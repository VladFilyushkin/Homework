import java.util.Scanner;

public class homework2 {
    public static void main(String[] args) {
        System.out.print("Введите abcd число: ");
        Scanner scanner = new Scanner(System.in);
        int number = 0;
        if (scanner.hasNextInt()) {
            number = scanner.nextInt();

            if (number > 999 && number < 10000) {


                int ab = (number / 100);
                int cd = (number % 100);

                System.out.println("Сумма ab+cd = " + (ab + cd));//Вывод суммы.
            } else {
                System.out.println("Неверный формат числа!");
            }


        }
    }
}

