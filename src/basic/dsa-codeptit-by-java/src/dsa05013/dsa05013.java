package dsa05013;
import java.util.*;
public class dsa05013 {
    public static Scanner input = new Scanner(System.in);
    public static final int MOD = 1000000007;
    public static void main(String[] args) {
        // Write your code here
        int t = input.nextInt();
        while (t-- > 0) {
            testCase();
        }
    }
    public static void testCase() {
        int n = input.nextInt();
        int k = input.nextInt();
        int []dp = new int[n + 1];
        dp[0] = 1;
        dp[1] = 1;
        dp[2] = 2;
        for (int i = 3; i <= n; i++) {
            for (int j = i - k; j < i; j++) {
                if (j >= 0) {
                    dp[i] += dp[j];
                    dp[i] %= MOD;
                }
                
            }
        }
        System.out.println(dp[n]);
    }
}
