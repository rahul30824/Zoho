import java.util.Scanner;
import java.math.BigInteger;


public class Main{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a hexadecimal number: ");
        String hex = scanner.nextLine();
        
        // Convert hexadecimal to binary
        String binary = new BigInteger(hex, 16).toString(2);
        
        System.out.println("Binary equivalent: " + binary);
        scanner.close();
    }
}
