package dsa05012;
import java.util.*;
public class dsa05012 {
    public static Scanner input = new Scanner(System.in);
    public static int [][]c = new int[1001][1001];
    public static int MOD = 1000000007;
    public static void main(String[] args) {
        
        // Write your code here
        int t = input.nextInt();
        init();
        while (t-- > 0) {
            testCase();
        }
    }
    public static void init() {
        for (int i = 0; i < 1001; i++) {
            for (int j = 0; j < 1001; j++) {
                if (i == 0 || j == 0 || i== j) {
                    c[i][j] = 1;
                } else {
                    c[i][j] = (c[i - 1][j] + c[i - 1][j - 1]) % MOD;
                }
            }
        }
    }
    public static void testCase( ) {
        int n = input.nextInt();
        int k = input.nextInt();
        System.out.println(c[n][k]);
    }
}
