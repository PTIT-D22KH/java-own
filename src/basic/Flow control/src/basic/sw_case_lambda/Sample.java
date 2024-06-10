package basic.sw_case_lambda;

public class Sample {
    public static void main(String[] args) {
        int x = 1;
        switch(x) {
            case 1 -> System.out.println("X is 1");
            case 2 -> System.out.println("X is 2");
            case 3 -> System.out.println("X is 3");
            default -> System.out.println("X is other than 1, 2 ,3");
        }
    }
}
