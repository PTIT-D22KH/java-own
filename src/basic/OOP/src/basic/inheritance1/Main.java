package basic.inheritance1;

public class Main {
    public static void main(String[] args) {
        Bike bike = new Bike("Petrol", 2, 2, 21, "LED", "Short");

        // bike.handle = "Short";
        // bike.engine = "Petrol";
        System.out.println(bike.run());
    }
}
