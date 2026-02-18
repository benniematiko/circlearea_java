import java.util.Scanner;
import java.util.InputMismatchException;

// 1. The Logic Class
class CircleArea {
    double radius;
    double area;
    final double PI = Math.PI; // Using the high-precision built-in PI

    CircleArea(double r) {
        radius = r;
    }

    void calcArea() {
        area = PI * radius * radius;
        // Formatting to 2 decimal places for a cleaner look
        System.out.printf("The Area of the circle is: %.2f%n", area);
    }
}

// 2. The Execution Class
public class CircleAreaDemo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean success = false;

        System.out.println("--- Welcome to the Circle Calculator ---");

        // Keep asking until we get a valid number
        while (!success) {
            try {
                System.out.print("Please enter the radius: ");
                double userRadius = input.nextDouble();

                // If input is negative, we can throw our own logic error
                if (userRadius < 0) {
                    System.out.println("Radius cannot be negative. Try again.");
                    continue; 
                }

                // Create object and run calculation
                CircleArea myCircle = new CircleArea(userRadius);
                myCircle.calcArea();
                
                success = true; // Break the loop

            } catch (InputMismatchException e) {
                System.out.println("Invalid input! Please enter a number (e.g., 12 or 3.5).");
                input.next(); // CRITICAL: Clears the "bad" text from the scanner buffer
            }
        }

        System.out.println("Thank you for using the calculator!");
        input.close();
    }
}