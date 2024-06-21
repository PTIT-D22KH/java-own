package user_input;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // System.out.println("What's your name? " );
        Scanner scanner = new Scanner(System.in);
        // String name = scanner.nextLine();
        // String name = scanner.next();
        // System.out.println("Hello " + name);

        System.out.println("What's your age: ");
        int age = scanner.nextInt();
        System.out.println("Age : " + age);;
        scanner.close();
    }
}
