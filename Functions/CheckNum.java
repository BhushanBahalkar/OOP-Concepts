package Functions;

import java.util.Scanner;

public class CheckNum {

    // Returns 1 for positive, -1 for negative, 0 for zero
    public static int CheckNum(int num){
        if(num > 0){
            return 1;
        } else if(num < 0) {
            return -1;
        } else {
            return 0;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int positiveCount = 0;
        int negativeCount = 0;
        int zeroCount = 0;
        char choice;

        do {
            System.out.print("Enter a number: ");
            int num = sc.nextInt();

            int result = CheckNum(num);
            if (result == 1) {
                positiveCount++;
            } else if (result == -1) {
                negativeCount++;
            } else {
                zeroCount++;
            }

            System.out.print("Do you want to enter another number? (y/n): ");
            choice = sc.next().charAt(0);
        } while (choice == 'y' || choice == 'Y');

        System.out.println("\nCount of positive numbers: " + positiveCount);
        System.out.println("Count of negative numbers: " + negativeCount);
        System.out.println("Count of zeros: " + zeroCount);
    }
}
