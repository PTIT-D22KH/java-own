package basic.type_casting1;

public class Sample {
    @SuppressWarnings("unused")
    public static void main(String[] args) {
        short a1 = 200;
        // byte a2 = a1;//cannot casting smaller to larger
        int a2 = a1;
        byte a3 = (byte)a1;
        System.out.println(a3);
    }
}
