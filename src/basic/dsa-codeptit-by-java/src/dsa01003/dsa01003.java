package dsa01003;
import java.util.*;
public class dsa01003 {
    public static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        // Write your code here
        int t = input.nextInt();
        while (t > 0) {
            testCase();
            t--;
        }
    }
    public static void testCase() {
        int n = input.nextInt();
        int []a = new int[n + 1];
        for (int i = 1; i <= n; i++) {
            a[i] = input.nextInt();
        }
        int j = n - 1;
        while (j >= 1 && a[j] > a[j + 1]) {
            j--;
        }
        if (j == 0) {
            for (int i = 1; i <= n; i++) {
                System.out.printf("%d ", i);
            }
            System.out.println();
            return;
        }
        int k = n;
        while (k >= 1 && a[j] > a[k]) {
            k--;
        }
        int temp = a[j];
        a[j] = a[k];
        a[k] = temp;
        int l = j + 1, r = n;
        while (l <= r) {
            int tmp = a[l];
            a[l] = a[r];
            a[r] = tmp;
            l++;
            r--;
        }        
        for (int i = 1; i <= n; i++) {
            System.out.printf("%d ", a[i]);
            
        }
        System.out.println();
        
    }
}
