import java.util.Scanner;

public class Dynamicadd {
    public static void main(String[] args) {
        Scanner Scanner = new Scanner(System.in);
        double result = 0;  
        
        System.out.println("Dynamic Addition Calculator");
        System.out.println("Enter numbers to add. Type 'exit' to quit.");
        
        while (true) {
            System.out.print("Enter a number (or type 'exit' to stop): ");
            String input = Scanner.nextLine();
            
            
            if (input.equalsIgnoreCase("exit")) {
                break;
            }
            
            try {
            
                double number = Double.parseDouble(input);
                result += number;  
                System.out.println("Current result: " +result);
            } catch (NumberFormatException e) { 
        
                System.out.println("Invalid input, please enter a valid number.");
            }
        }
        
        System.out.println("Final result: " + result);
        Scanner.close();
    }
}
