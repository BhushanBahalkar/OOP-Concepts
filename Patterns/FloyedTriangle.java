package Patterns;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FloyedTriangle {
    public static void main(String[] args) throws IOException {
        System.out.println("Enter the number of row's : ");

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int m = Integer.parseInt(br.readLine());
        int number = 1;
        // int n = Integer.parseInt(br.readLine());
        System.out.println(" ");

        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(number + " ");
                number++;
            }
            System.out.println(" ");

        }

        System.out.println(" ");
    }
}
