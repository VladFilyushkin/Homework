import java.util.Scanner;

public class homework4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float x1 = scanner.nextFloat();
        float y1 = scanner.nextFloat();
        float x2 = scanner.nextFloat();
        float y2 = scanner.nextFloat();

        if(x1==x2 && y1==y2) {
            System.out.println("Ошибка, отрезок является точкой");
        } else {
            System.out.print("Длина отрезка: "+ Math.sqrt((y2-y1)*(y2-y1)+(x2-x1)*(x2-x1)));
        }

    }
}




