import java.text.SimpleDateFormat;
import java.util.Date;

public class DatePrintingInFormat {
    public static void main(String[] args) {
        SimpleDateFormat s=new SimpleDateFormat("dd/MM/yyyy");
        System.out.println(s.format(new Date()));

    }
}
