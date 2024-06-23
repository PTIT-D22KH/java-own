package dsa05004;
import java.util.*;

public class dsa05004 {
    public static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        int n = input.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = input.nextInt();
        }
        int[] dp = new int[n];
        dp[0] = 1;
        for (int i = 0; i < n; i++) {
            dp[i] = 1;
            for (int j = 0; j < i; j++) {
                if (a[i] > a[j]) {
                    dp[i] = Math.max(dp[i], dp[j] + 1);
                }
            }
        }
        // Find the maximum value in dp array
        int max = dp[0];
        for (int i = 1; i < dp.length; i++) {
            max = Math.max(max, dp[i]);
        }
        System.out.println(max);
    }
}