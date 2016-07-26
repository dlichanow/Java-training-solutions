package pl.raiffeisen;

import java.text.SimpleDateFormat;
import java.util.*;
import java.util.Date;

public class MyFirstProgram {
    public static void main(String[] args) {
        System.out.println("Hello World");
//        System.out.println("Names: " + getNames());
        List<String> names = getNames();
        System.out.println("Names: " + names.toString());
        System.out.println("Names: " + formatList(names));
        System.out.println("Names: " + formatList(names, "{", "}", "-"));
        System.out.println("Names: " + format3(names));
        System.out.println("Names: " + format4(names));
        System.out.println("Current time is: " + getCurrentTime());
//        System.out.println("Current time is in ISO 8601: " + getCurrentTimeISO());
    }

    private static String getCurrentTime() {
        String timeStamp = new SimpleDateFormat("yyyy.MM.dd_HH.mm.ss").format(new Date());
        return timeStamp;
    }


    private static String format4(List<String> names) {
        StringJoiner stringJoiner = new StringJoiner("=", "(", ")");
        for (String name : names) {
            stringJoiner.add(name);
        }
        return stringJoiner.toString();
    }

    private static String format3(List<String> names) {
        return "(" + String.join(";", names) + ")";
    }

    private static String formatList(List<String> names) {
        return formatList(names, "(", ")", ";");
    }


    private static String formatList(List<String> names, String open, String close, String delimiter) {
        String result = open;
        Iterator<String> iterator = names.iterator();
        while (iterator.hasNext()) {
            result += iterator.next();
            if (iterator.hasNext()) {
                result += delimiter;
            }
        }
        result += close;
        return result;

    }

    private static List<String> getNames() {
        List<String> names = new ArrayList<String>();
        names.add("Jan");
        names.add("Robert");
        names.add("Karol");
        return names;
    }

}