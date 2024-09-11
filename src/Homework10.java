import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Map;


public class Homework10 {
    public static void main(String[] args) {
        Map<LocalDate, String> holidays = Map.of(
                LocalDate.of(2024, 1, 1), " - Новый год",
                LocalDate.of(2024, 1, 7), " - Рождество Христово ",
                LocalDate.of(2024, 3, 8), " - День Женщин ",
                LocalDate.of(2024, 5, 9), " - День победы "
        );

        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd MMMM yyyy");
        System.out.println("Список праздников в РБ: ");

        holidays.forEach((key, value) -> {
            System.out.println(key.format(dateTimeFormatter) + value);
        });

    }
}
