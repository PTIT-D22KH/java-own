package dsa05005;
import java.util.*;

public class dsa05005 {
    public static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        int t = input.nextInt();
        while (t-- > 0) {
            testCase();
        }
    }

    public static void testCase() {
        int n = input.nextInt();
        ArrayList<Integer> a = new ArrayList<>(n); // Use generics for type safety
        for (int i = 0; i < n; i++) {
            int x = input.nextInt();
            a.add(x);
        }

        // Initialize dp with all elements set to 1
        Vector<Integer> dp = new Vector<>(Collections.nCopies(n, 1)); // Correct way to initialize with all elements as 1

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i; j++) {
                if (a.get(i) > a.get(j)) { // Compare elements in 'a', not 'dp'
                    dp.set(i, Math.max(dp.get(i), dp.get(j) + 1)); // Use get and set methods for Vector
                }
            }
        }

        // Assuming you want to print the maximum value in dp
        System.out.println(n - Collections.max(dp)); // Print the maximum value in dp
    }
}