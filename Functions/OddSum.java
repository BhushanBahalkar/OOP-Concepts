package Functions;

import java.util.*;

public class OddSum {

    public static void OddSumCalculator(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            if (i % 2 != 0) {
                sum += i;
            }
        }
        System.out.println("The sum of odd numbers from 1 to " + n + " is: " + sum);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a positive integer: ");
        // Read an integer from the user

        int n = sc.nextInt();

        int sum = 0;
        if (n < 1) {
            System.out.println("Please enter a positive integer.");
        } else {
            OddSumCalculator(n);
        }
    }

}
