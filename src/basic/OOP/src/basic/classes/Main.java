package basic.classes;

public class Main {
    public static void main(String[] args) {
        Car car = new Car("closed", "on", "seated", 10);
        System.out.println(car.run());
        // car.setDoors(4);
        // System.out.println(car.getDoors());
    }
}
