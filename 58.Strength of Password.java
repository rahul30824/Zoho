import java.util.*;
import java.util.regex.*;

class Main {
    public static void Solution(String input) {
        int n = input.length();
        
        // Check if the password contains a lowercase letter
        boolean hasLower = Pattern.compile("[a-z]").matcher(input).find();
        
        // Check if the password contains an uppercase letter
        boolean hasUpper = Pattern.compile("[A-Z]").matcher(input).find();
        
        // Check if the password contains a digit
        boolean hasDigit = Pattern.compile("[0-9]").matcher(input).find();
        
        // Check if the password contains a special character
        boolean hasSpecial = Pattern.compile("[!@#$%^&*()_+\\-=\\[\\]{};':\"\\\\|,.<>/?]").matcher(input).find();
        
        System.out.println("Strength of Password");
        
        if (hasLower && hasUpper && hasDigit && hasSpecial && n >= 8) {
            System.out.print("Hard");
        } else if ((hasLower || hasUpper || hasDigit) && n >= 6) {
            System.out.print("Moderate");
        } else {
            System.out.print("Weak");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your Password");
        String input = scanner.nextLine();
        Solution(input);
    }
}
