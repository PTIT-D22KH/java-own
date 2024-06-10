package basic.loop2;

public class Sample {
    public static void main(String[] args) {
        for (int i = 0, j = 0; (i < 10) && (j < 10); i++, j++) {
            j++;
            System.out.println("Value of i and j : " + i + " " + j);
        }

        int i = 0, j = 0;
        while (i < 10 && j < 10) {
            System.out.println("Value of i and j : " + i + " " + j);
            i++;
            j++;
        }
    }
}
