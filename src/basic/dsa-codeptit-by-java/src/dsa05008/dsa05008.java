package dsa05008;
import java.util.*;
public class dsa05008 {
    public static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        // Write your code here
        int t = input.nextInt();
        while (t-- > 0) {
            testCase();
        }
    }
    public static void testCase() {
        int n = input.nextInt();
        int s = input.nextInt();
        Vector<Integer> dp = new Vector<>(Collections.nCopies(s + 1, 0));
        Vector<Integer> a = new Vector<>(Collections.nCopies(n, 0));
        for (int i  = 0; i < n; i++) {
            int x = input.nextInt();
            a.set(i, x);
        }
        dp.set(0, 1);
        for (int i = 0; i < n; i++) {
            for (int j = s; j >= a.get(i); j--) {
                if (dp.get(j) == 0 && (j - a.get(i) >= 0 && dp.get(j - a.get(i)) != 0)) {
                    dp.set(j, 1);
                }
            }
        }
        if (dp.get(s) == 1) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
