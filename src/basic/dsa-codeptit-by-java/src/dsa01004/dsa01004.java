package dsa01004;
import java.util.*;
public class dsa01004 {
    public static Scanner input = new Scanner(System.in);
    static int []a = new int[101];
    static int n, k;
    public static void main(String[] args) {
        // Write your code here
        int t = input.nextInt();
        while (t-- > 0) {
            testCase();
            System.out.println();
        }
    }
    public static void testCase() {
        n = input.nextInt();
        k = input.nextInt();
        a[0] = 0;
        Try(1);
    }
    public static void Try(int i) {

        for (int j = a[i - 1] + 1; j <= (n - k + i); j++) {
            a[i] = j;
            if (i == k) {
                result();
            } else {
                Try(i + 1);
            }
        }

        
    }
    public static void result(){ 
        for (int i = 1; i <= k; i++) {
            System.out.printf("%d", a[i]);
        }
        System.out.printf(" ");
    }
}
