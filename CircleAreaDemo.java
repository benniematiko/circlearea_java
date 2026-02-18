import java.util.Scanner;
import java.util.InputMismatchException; // 1. Import the specific error type

class CircleAreaDemo {
  
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        try {
            // 2. The "Risky" code goes inside the try block
            System.out.print("Enter the radius of the circle: ");
            double userRadius = input.nextDouble();

            CircleArea myCircle = new CircleArea(userRadius);
            myCircle.calcArea();

        } catch (InputMismatchException e) {
            // 3. This runs ONLY if the user types something that isn't a number
            System.out.println("Error: Please enter a valid numeric value (e.g., 5.5).");
        } finally {
            // 4. This runs no matter what (clean up)
            input.close();
            System.out.println("\nProgram execution finished.");
        }
    }
}