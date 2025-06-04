package Arrays;

import java.util.*;

public class Array {

    public static void main(String[] args) {

        // Example of a simple array
        System.out.println("Example of a simple array:");

        int[] arr = { 1, 2, 3, 4, 5 };
        int sum = 0;
        int max = arr[0];
        int min = arr[0];

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);

            if (arr[i] > max) {
                max = arr[i];

            }
            if (arr[i] < min) {
                min = arr[i];
            }

            sum += arr[i];
        }

        System.out.println("\nThe maximum value in the array is: " + max);
        System.out.println("The minimum value in the array is: " + min);
        System.out.println("\nThe sum of the array elements is: " + sum);
        System.out.println("The average of the array elements is: " + sum / arr.length);
        System.out.println(" ");

        // Example of an array with user input

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int size = sc.nextInt();
        int[] userArray = new int[size];
        System.out.println("Enter " + size + " elements for the array:");

        for (int i = 0; i < size; i++) {
            userArray[i] = sc.nextInt();
        }
        System.out.println(" ");
        for (int i = 0; i < userArray.length; i++) {
            System.out.print(userArray[i] + " ");
        }

        // Example of a string array with user input

        String[] strArr = new String[size];
        System.out.println(" ");
        System.out.println("Enter " + size + " strings for the string array:");
        sc.nextLine();

        for (int i = 0; i < size; i++) {
            strArr[i] = sc.nextLine();
        }
        System.out.println(" ");
        for (int i = 0; i < strArr.length; i++) {
            System.out.print(strArr[i] + " ");
        }
        System.out.println("\n ");

    }

}
