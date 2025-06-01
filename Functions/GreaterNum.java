package Functions;

public class GreaterNum {
    public static void GreaterNumCalculator(int a, int b) {
        if (a > b) {
            System.out.println("The greater number is: " + a);
        } else if (b > a) {
            System.out.println("The greater number is: " + b);
        } else {
            System.out.println("Both numbers are equal.");
        }
    }

    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        System.out.print("Enter the first number: ");
        int a = sc.nextInt();

        System.out.print("Enter the second number: ");
        int b = sc.nextInt();

        GreaterNumCalculator(a, b);
    }
}
