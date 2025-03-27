import java.time.*;
import java.time.format.DateTimeFormatter;

public class lp99 {
    public static void main(String[] args) {
        LocalDate date = LocalDate.now();
        LocalDateTime dateTime = LocalDateTime.now();
        System.out.println("Date: " + date + "\nDateTime: " + dateTime.format(DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss")));
        System.out.println("Next Week: " + date.plusDays(7) + "\nLast Week: " + date.minusDays(7));
    }
}
