
import java.time.*;
public class DatePrintingUsingTimePackage {
    public static void main(String[] args) {
        //LocalDate dd= LocalDate.of(2020,Month.AUGUST,12);
        //LocalTime t=LocalTime.now();
       // System.out.println(t);
       for(String s: ZoneId.getAvailableZoneIds())
       {
           System.out.println(s);
       }
       LocalTime t=LocalTime.now(ZoneId.of("Asia/Baghdad"));
         System.out.println(t);
    }
}

