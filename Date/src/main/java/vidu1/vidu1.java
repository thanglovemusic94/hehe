package vidu1;

import java.text.SimpleDateFormat;
import java.util.Date;

/*
http://tutorials.jenkov.com/java-date-time/parsing-formatting-dates.html
 */
public class vidu1 {
    public static void main(String[] args) {
        Date date = new Date();
        System.out.println(date);


//        SimpleDateFormat simpleFormatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        SimpleDateFormat simpleFormatter = new SimpleDateFormat();
        System.out.println(simpleFormatter.format(date));
    }
}
