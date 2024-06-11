package basic.polymorphism1;
import basic.polymorphism1.Phone;
import basic.polymorphism1.Nokia3310;
import basic.polymorphism1.Iphone;
public class Main {
    public static void main(String[] args) {
        Phone p = new Phone();
        p.feature();
        Nokia3310 p1 = new Nokia3310();
        p1.feature();
        Iphone p2 = new Iphone();
        p2.feature();

        Phone p3 = new Nokia3310();
        p3.feature();

        Nokia3310 nokia = (Nokia3310) new Phone();
        nokia.feature();
    }
}
