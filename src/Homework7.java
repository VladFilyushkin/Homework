import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Homework7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите ip адрес: ");
        String ipAddress = scanner.nextLine();


        Pattern pattern = Pattern.compile("^([0-9]|[1-9][0-9]|1[0-9][0-9]|2[0-4][0-9]|25[0-5])\\." +
                "([0-9]|[1-9][0-9]|1[0-9][0-9]|2[0-4][0-9]|25[0-5])\\." +
                "([0-9]|[1-9][0-9]|1[0-9][0-9]|2[0-4][0-9]|25[0-5])\\."+
                "([0-9]|[1-9][0-9]|1[0-9][0-9]|2[0-4][0-9]|25[0-5])$");
        Matcher matcher = pattern.matcher(ipAddress);


        if (matcher.find()) {

            System.out.println("IP Address " + ipAddress + " is valid.");
        }else{
            System.out.println("IP Address " + ipAddress +  " is invalid");
        }
    }
}

