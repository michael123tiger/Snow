import java.util.Scanner;

public class Dynamicadd {
    public static void main(String[] args) {
        Scanner Scanner = new Scanner(System.in);
        double result = 0;  // Initialize result variable
        
        System.out.println("Dynamic Addition Calculator");
        System.out.println("Enter numbers to add. Type 'exit' to quit.");
        
        while (true) {
            System.out.print("Enter a number (or type 'exit' to stop): ");
            String input = Scanner.nextLine();
            
            // Check if the user wants to exit
            if (input.equalsIgnoreCase("exit")) {
                break;
            }
            
            try {
                // Try to parse the input as a double
                double number = Double.parseDouble(input);
                result += number;  // Add the number to the result
                System.out.println("Current result: " + result);
            } catch (NumberFormatException e) {
                // If the input is not a valid number
                System.out.println("Invalid input, please enter a valid number.");
            }
        }
        
        System.out.println("Final result: " + result);
        Scanner.close();
    }
}
