package basic.type_casting2;

public class Sample {
    @SuppressWarnings("unused")
    public static void main(String[] args) {
        String a1 = "10";
        // int i = (int)a1;//not works
        int i = Integer.parseInt(a1);
        long a2 = 5000;
        byte c = (byte)a2;
        float b = a2;
        float d = 10.0f;
        int j = (int)d;
        float e = 10.5f;
        int k = (int)e;
        System.out.println(i);
        System.out.println(b);
        System.out.println(j);
        System.out.println(k);
    }
}
