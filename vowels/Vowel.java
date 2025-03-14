import java.util.Scanner;

public class Vowel{
    public static void main(String[] args) {
        Scanner Scanner = new Scanner(System.in);
        
        System.out.print("Enter a single letter: ");
        char letter = Scanner.next().toLowerCase().charAt(0); 

        if (letter == 'a' || letter == 'e' || letter == 'i' || letter == 'o' || letter == 'u') {
            System.out.println("The letter '" + letter + "' is a vowel.");
        } else if (Character.isLetter(letter)) {
            System.out.println("The letter '" + letter + "' is not a vowel.");
        } else {
            System.out.println("That's not a valid letter!");
        }

        Scanner.close();
    }
}