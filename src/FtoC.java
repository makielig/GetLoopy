import java.util.Scanner;

public class FtoC {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double fahrenheit, celsius;
        boolean validInput = false;

        while (!validInput) {
            try {
                System.out.print("Enter temperature in Fahrenheit: ");
                fahrenheit = scanner.nextDouble();
                celsius = (fahrenheit - 32) * 5.0 / 9.0;
                System.out.println("Temperature in Celsius: " + celsius);
                validInput = true;
            } catch (Exception e) {
                System.out.println("Invalid input. Please enter a valid number.");
                scanner.nextLine();  // Clear the scanner buffer
            }
        }
    }
}
