package basic.sw_case_3;

public class Sample {
    public static void main(String[] args) {
        String x = "c";
        switch (x.toLowerCase()) {
            case "a" -> System.out.println("X is a");
            case "b" -> System.out.println("X is b");
            case "c" -> System.out.println("X is c");
            default -> System.out.println("X is other than a, b, c");
        }
    }
}
