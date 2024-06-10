package basic.methods;
public class Sample {
    public static void main(String[] args) {
        loop1(1, 10);
        System.err.println("-------------------");
        // loop2();
        loop1(20, 40);
    }
    public static void loop1(int start, int stop) {
        for (; start <= stop; start++) {
            System.out.println(start);
        }
    }
    // public static void loop2() {
    //     for (int i = 20; i <= 40; i++) {
    //         System.out.println(i);
    //     }
    // }
}
