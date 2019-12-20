package SelenideUpdate.tests;

import java.text.SimpleDateFormat;
import java.util.Date;

public abstract class BaseTests {

    public int CurrentTime (String timeType) {
        Date date = new Date();
        switch (timeType) {
            case "HOUR":  String currentHour = new SimpleDateFormat("HH").format(date);
                return  Integer.parseInt(currentHour);
            case "MINUTE":  String currentMinute = new SimpleDateFormat("mm").format(date);
                return Integer.parseInt(currentMinute);
            case "COMBINEMINUTE":  String combineMinute = new SimpleDateFormat("mm").format(date);
                return Integer.parseInt(combineMinute)+21;
            case "COMBINEHOUR":  String combineHour = new SimpleDateFormat("HH").format(date);
                return  Integer.parseInt(combineHour)+1;
        }
        return -1;
    }
}
