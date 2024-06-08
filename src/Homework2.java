public class Homework2 {
    public static void main(String[] args) {
        int count413 = 0;
        for (int i = 1; i <= 99999; i++) {
            String digits413 = String.valueOf(i);
            if(digits413.contains("4") || digits413.contains("13")){
                count413++;

            }


        }
        System.out.println(count413);

    }
}








