package Patterns;

public class PalindromicPyramid {
    public static void main(String[] args) {
        int n = 5;

        for (int i = 1; i <= n; i++) {
            // Print spaces for centering
            for (int j = 1; j <= n - i; j++) {
                System.out.print("  "); // two spaces for alignment
            }

            // 1st half (descending)
            for (int j = i; j >= 1; j--) {
                System.out.print(j + " ");
            }

            // 2nd half (ascending)
            for (int j = 2; j <= i; j++) {
                System.out.print(j + " ");
            }

            System.out.println(); // move to next line
        }
    }
}
