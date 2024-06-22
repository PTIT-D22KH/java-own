package dsa01002;

import java.util.*;

public class dsa01002 {
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
        int k = input.nextInt();
        ArrayList<Integer> a = new ArrayList<>();
        for (int i = 1; i <= k; i++) {
            int x = input.nextInt();
            a.add(x);
        }
        int i = k - 1;
        while (i >= 0 && a.get(i) == (n - k + i + 1)) {
            i--;
        }
        if (i >= 0) {
            a.set(i, a.get(i) + 1);
            for (int j = i + 1; j < k; j++) { // Correctly iterate over the ArrayList
                a.set(j, a.get(j - 1) + 1);
            }
        } else {
            for (int j = 1; j <= k; j++) {
                System.out.printf("%d ", j);
            }
            System.out.println();
            return; // Correctly return to avoid further execution
        }
    
        // Correctly print the updated ArrayList
        for (int num : a) {
            System.out.printf("%d ", num);
        }
        System.out.println();
    }
}
