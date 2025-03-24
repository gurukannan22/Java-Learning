package Programs;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Datetime {
    public static void main(String[] args) {
        Date date = new Date();  // Create Date object
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        System.out.println("Current Date and Time: " + sdf.format(date));
    }
}