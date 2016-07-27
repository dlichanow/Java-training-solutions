/**
 * Created by rb22172 on 2016-07-25.
 */
public class PowerDevices {
    public int voltage = 230;
    public int serial = 123;
    public String name = "Device";
}

class Scanner extends PowerDevices {
    public String scanningResolution;
}

class Printer extends PowerDevices {
    public int pagesPerMinute = 10;
}

class Photocopier extends Scanner {
    public boolean internetConnected = true;
}


//    public static void main(String[] args) {
//        Printer printer = new Printer();
//        printer.name = "aaa";
//        System.out.println(printer.name);
//    }