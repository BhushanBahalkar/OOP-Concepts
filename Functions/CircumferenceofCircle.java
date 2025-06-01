package Functions;

public class CircumferenceofCircle {
    
    public static void CircumferenceCalculator(double radius) {
        double circumference = 2 * 3.14 * radius;
        System.out.println("The circumference of the circle with radius " + radius + " is: " + circumference);
    }

    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        System.out.print("Enter the radius of the circle: ");
        double radius = sc.nextDouble();

        if (radius < 0) {
            System.out.println("Please enter a non-negative radius.");
        } else {
            CircumferenceCalculator(radius);
        }
    }
    

}
