
public class ToyotaCars {

    NonStaticInner nonStaticInner = new NonStaticInner();
    private int x = 10;

    public static class Brand {
        private static String brandName = "Toyota";
        public static void tagLine() {
            System.out.println("Reliable car");
        }
    }

    public class NonStaticInner{
        public void model(String model) {
            System.out.println("Make of the car: "+model);
            System.out.println("Brand name: "+ Brand.brandName);
            System.out.println("Value of x is "+ x);
        }

    }

    public NonStaticInner getNonStaticInner() {
        return nonStaticInner;
    }


}
