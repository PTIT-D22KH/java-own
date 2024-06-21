package basic.java_core.src.abstract_class;

public class Main {
    public static void main(String[] args) {
        Person john = new John();
        john.eat();
        john.speak();

        Person person = new Pooja();
        person.eat();
        person.speak();

        Person p2 = new Person() {
            @Override
            public void eat() {
                System.out.println("Eat food");
            }
        };
        p2.speak();
        p2.eat();
    }
}
