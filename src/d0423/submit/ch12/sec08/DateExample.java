package d0423.submit.ch12.sec08;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateExample {
    public static void main(String[] args) {
        Date date = new Date();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy.MM.dd hh.mm.ss");
        System.out.println(simpleDateFormat.format(date));

    }
}
