package basic.loop1;

public class Sample {
    public static void main(String[] args) {
        int i = 5;
        for (i = 0; i <= 10; ++i) {
            System.out.println(i);
        }
        int x = 0;
        while (x < 10) {
            System.out.println("Iteration: " + x);
            x++;
        }
        int j = 0;
        do {
            System.out.println(j);
            j++;
        }while(j > 10);
    }
}
