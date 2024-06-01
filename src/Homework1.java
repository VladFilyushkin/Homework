import java.util.Scanner;

public class Homework1 {
    public static void main(String[] args) {
        System.out.print("Введите количество предметов: ");
        Scanner scanner = new Scanner(System.in);
        int subj = 0;
        int grade = 0;
        int b = 0;
        float q = 0;


        if (scanner.hasNextInt()) {

            subj = scanner.nextInt();
            while (subj <= 0 || subj > 20) {
                System.out.println("Ошибка, количество предметов не может быть меньше 1 и больше 20");
                System.out.print("Введите количество предметов: ");
                subj = scanner.nextInt();



            }
            for (int a = 1; a <= subj; a++) {
                System.out.print("Введите оценку за предмет " + a + " : ");
                grade = scanner.nextInt();

                while (grade < 1 || grade > 10) {
                    System.out.print("Ошибка! Введите оценку от 1 до 10: ");
                    grade = scanner.nextInt();

                }
                b = b + grade;


            }
            q = (float) b / subj;
            System.out.println("Среднее " + q);


        }

    }

}
