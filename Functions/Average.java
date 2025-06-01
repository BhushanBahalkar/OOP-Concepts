package Functions;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Average {

    public static void AverageCalculator(int a, int b, int c){
        int sum = a + b + c ;
        double average = sum/3.0;
        System.out.println("The average of these three numbers is:" + average);
    }

    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter the first number:");
        int a = Integer.parseInt(br.readLine());

        System.out.print("Enter the second number:");
        int b = Integer.parseInt(br.readLine());

        System.out.print("Enter the third number:");
        int c = Integer.parseInt(br.readLine());

        AverageCalculator(a, b, c);

    }

}
