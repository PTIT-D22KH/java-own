package basic;

public class Float {
    public static void main(String[] args) {
        float max = 3.4023423f;//4 byte
        float min = 1.40e-45f;
        double doubleMax = 1.7976e+308d; //8 byte
        System.out.println(doubleMax);
        System.out.printf("%.2f\n", doubleMax);
    }
}
