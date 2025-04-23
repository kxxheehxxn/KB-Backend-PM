package d0423.submit.ch12.sec08;

import java.util.Calendar;

public class CalendarExample {
    public static void main(String[] args) {
        Calendar now = Calendar.getInstance();

        int year = now.get(Calendar.YEAR);
        int month = now.get(Calendar.MONTH) + 1;
        int day = now.get(Calendar.DAY_OF_MONTH);

        int dayOfWeek = now.get(Calendar.DAY_OF_WEEK);
        String[] week = {"일요일", "월요일", "화요일", "수요일", "목요일", "금요일", "토요일"};
        String dayName = week[dayOfWeek - 1];

        int amPm = now.get(Calendar.AM_PM);
        String amPmStr = (amPm == Calendar.AM) ? "오전" : "오후";

        int hour = now.get(Calendar.HOUR);
        int minute = now.get(Calendar.MINUTE);
        int second = now.get(Calendar.SECOND);

        System.out.println(year + "년 " + month + "월 " + day + "일");
        System.out.println(dayName + " " + amPmStr);
        System.out.println(hour + "시 " + minute + "분 " + second + "초");
    }
}
