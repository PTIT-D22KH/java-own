package basic.encapsulation1;

public class Main {
    public static void main(String[] args) {
        Person person = new Person("duong", 20, "Male");
        person.setName("Nam");
        person.setAge(-21);
        System.out.println(person);
    }
}
