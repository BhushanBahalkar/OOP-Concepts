package Functions;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Average {

    public static void AverageCalculator(double a, double b, double c) {
        double sum = a + b + c;
        double average = sum / 3.0;
        System.out.println("The average of these three numbers is:" + average);
    }

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter the first number:");
        double a = Double.parseDouble(br.readLine());

        System.out.print("Enter the second number:");
        double b = Double.parseDouble(br.readLine());

        System.out.print("Enter the third number:");
        double c = Double.parseDouble(br.readLine());

        AverageCalculator(a, b, c);

    }

}
