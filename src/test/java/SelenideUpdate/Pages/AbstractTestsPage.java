package SelenideUpdate.Pages;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.concurrent.ThreadLocalRandom;

public abstract class AbstractTestsPage {

    public static LocalDate newDate() {
        LocalDate from = LocalDate.of(2020, 1, 1);
        LocalDate to = LocalDate.of(2020, 1, 10);
        long days = from.until(to, ChronoUnit.DAYS);
        long randomDays = ThreadLocalRandom.current().nextLong(days + 1);
        LocalDate randomDate = from.plusDays(randomDays);
        return randomDate;
    }

    public static String getDayOfMonthSuffix(LocalDate date) {
        int n = date.getDayOfMonth();

        if (n >= 11 && n <= 13) {
            return "th";
        }
        switch (n % 10) {
            case 1:  return "st";
            case 2:  return "nd";
            case 3:  return "rd";
            default: return "th";
        }
    }


}
