/**
 * Created by rb22172 on 2016-07-25.
 */
public class Main {
    public static void main(String[] args) {
        ImmutablePerson();
        MutablePerson();
        PowerDevices powerDevices = new PowerDevices();
        System.out.println("Power device name: " + powerDevices.name);
        Printer printer = new Printer();
        System.out.println("Printer pages per minute: " + printer.pagesPerMinute);
        System.out.println("Printers voltage: " + printer.voltage);
        Scanner scanner = new Scanner();
        scanner.scanningResolution = "duza";
        System.out.println("Scanner resolution: " + scanner.scanningResolution);

    }

    private static void MutablePerson() {
        MutablePerson mutablePerson = new MutablePerson();
        mutablePerson.setFirstName("Alan");
        mutablePerson.setLastName("Bordo");
        mutablePerson.setAge(230);
        System.out.println(mutablePerson);
        mutablePerson.setFirstName("Alan2");
        System.out.println("Nowa imię: " + mutablePerson);
    }

    private static void ImmutablePerson() {
        ImmutablePerson immutablePerson = new ImmutablePerson("nie da", "się", -1);
        immutablePerson.withFirstName("Daniel");
        immutablePerson.withAge(30);
        immutablePerson.withLastName("Kowal");
        System.out.println(immutablePerson);
    }
}
