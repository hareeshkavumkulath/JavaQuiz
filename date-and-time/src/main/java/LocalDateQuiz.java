import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class LocalDateQuiz {
    public static void main(String args[]){
        String pattern = "dd MMM yyyy HH:mm"; // HourOfDay isn't supported for LocalDate
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern(pattern);
        LocalDate x = LocalDate.of(2022, 11, 1);
        System.out.println(formatter.format(x));
    }
}
