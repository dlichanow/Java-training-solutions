package pl.raiffeisen;

import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

/**
 * Created by rb22172 on 2016-07-18.
 * Solution programs from lesson 2
 */
public class Ex2_TimeFormatter {
    public static void main(String[] args) {
        int newDays = 10;
        System.out.println("Ex2_Solution: " + Ex2_Solution(50));
        System.out.println("Obsolete. Current time: " + showCurrentTime());
        System.out.println("Obsolete. Current time in ISO: " + showCurrentISOTime());
        System.out.println("Current time: " + myTime());
        System.out.println("Local time + " + newDays + " days: " + myTime(newDays));
    }

    private static String myTime(long i) {
        LocalDateTime currentDate = LocalDateTime.now();
        String addDate = currentDate.plusDays(i).format(DateTimeFormatter.ISO_DATE_TIME);
//        LocalDateTime lastDate = currentDate.with(TemporalAdjusters.lastDayOfMonth());
//        String addISODate = addDate.format(DateTimeFormatter.ISO_DATE_TIME);
        return addDate;
    }

    private static String myTime() {
        String myTime = LocalDateTime.now().format(DateTimeFormatter.ofPattern("dd MMMM yyyy HH:mm:ss"));
        //return LocalDateTime.now();
        return myTime;
    }

    private static String showCurrentISOTime() {
        String CurrentISOTime = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss'Z'").format(new Date());
        return CurrentISOTime;
    }

    private static String showCurrentTime() {
        String CurrentTimeStamp = new SimpleDateFormat("yyyy.MM.dd-HH.mm.ss").format(new Date());
        return CurrentTimeStamp;
    }


    private static double Ex2_Solution(int max) {
        double number = 0.0;

        for (int x = 0; x < max; x++)
            number += 0.01;
        return number;
    }
}