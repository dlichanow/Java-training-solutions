/**
 * Created by rb22172 on 2016-07-25.
 */
public class ImmutablePerson {
    private String firstName;
    private String lastName;
    int age;

    //
    ImmutablePerson(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    public ImmutablePerson withFirstName(String firstName) {
        return new ImmutablePerson(this.firstName, lastName, age);
    }

    public ImmutablePerson withLastName(String lastName) {
        return new ImmutablePerson(firstName, this.lastName, age);
    }

    public ImmutablePerson withAge(int age) {
        return new ImmutablePerson(firstName, lastName, this.age);
    }

    @Override
    public String toString() {
        return "ImmutablePerson{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                '}';
    }
}