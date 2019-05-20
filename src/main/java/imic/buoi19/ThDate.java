package imic.buoi19;

import java.time.LocalDate;
import java.util.Date;

public class ThDate {
    public static void setDate()
    {
        LocalDate newdate = LocalDate.now();
        Integer endmonth = newdate.lengthOfMonth();
        LocalDate ngaycuoithang = newdate.withDayOfMonth(endmonth);
        Long songay = ngaycuoithang.toEpochDay() - newdate.toEpochDay();
        System.out.println(newdate);
        System.out.println(songay);

    }
}


