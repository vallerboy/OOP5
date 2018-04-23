import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class Dates {
    public static void main(String[] args) {
        LocalDateTime now = LocalDateTime.now();
        LocalDateTime birthday = LocalDateTime.of(2016, 10, 1, 0, 0);

        System.out.println(Math.abs(now.until(birthday, ChronoUnit.HOURS)) * 15);
    }
}
