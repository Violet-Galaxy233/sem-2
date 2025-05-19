import java.util.Scanner;

public class Question2 { 
    public static int hex2Dec(String hex) { //
        // Remove any leading "0x" or "0X" if present
        if (hex.startsWith("0x") || hex.startsWith("0X")) { 
            hex = hex.substring(2); // Remove the prefix
        }
        return Integer.parseInt(hex, 16); 
        // Parse the string as a base-16 integer
    }

    public static void main(String[] args) { 
        Scanner input = new Scanner(System.in); 
        System.out.print("Enter a hex string: "); // Prompt user for input
        String userInput = input.nextLine(); // Read user input
        try {
            int decimal = hex2Dec(userInput); // Convert input to decimal
            System.out.println("Decimal value: " + decimal); 
        } catch (NumberFormatException e) { // Handle invalid hex string
            System.out.println("Invalid hex string!"); //errror message
        }
    }
}
