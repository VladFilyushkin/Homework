import java.util.Scanner;

public class homework4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float x1 = scanner.nextFloat();
        float y1 = scanner.nextFloat();
        float x2 = scanner.nextFloat();
        float y2 = scanner.nextFloat();

        if(x1<0){
            x1=Math.abs(x1);

        }
        if(x2<0){
            x2=Math.abs(x2);

        }
        if(y1<0){
            y1=Math.abs(y1);

        }

        if(y2<0){
            y2=Math.abs(y2);

        }
        if(x1==x2 && y1==y2) {
            System.out.println("Ошибка");
        } else if (x2==x1) {
            System.out.print("Длина отрезка: "+(y2-y1));
        } else if (y2==y1) {
            System.out.print("Длина отрезка: "+(x2-x1));
        } else {
            System.out.print("Длина отрезка: "+ Math.sqrt((y2-y1)*(y2-y1)+(x2-x1)*(x2-x1)));
        }






    }
}




