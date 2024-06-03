import java.io.File;
import java.io.FileNotFoundException;
import java.math.BigInteger;
import java.util.Scanner;

public class Ladringan_Jerdelyne_MidtermReq {

    // Function to calculate LCM of two large numbers
    // Best Practice: Using a method to encapsulate functionality for reusability and modularity
    public static BigInteger lcm(String a, String b) {
        // Convert string 'a' and 'b' into BigInteger for big number handling
        BigInteger s = new BigInteger(a); // Meaningful Variable Names
        BigInteger s1 = new BigInteger(b); // Meaningful Variable Names

        // Calculate multiplication of two BigIntegers
        BigInteger mul = s.multiply(s1); // Meaningful Variable Names

        // Calculate GCD of two BigIntegers
        BigInteger gcd = s.gcd(s1); // Meaningful Variable Names

        // Calculate LCM using formula: LCM * GCD = a * b
        BigInteger lcm = mul.divide(gcd); // Meaningful Variable Names, Efficient Algorithm
        return lcm;
        // Return the LCM
    }

    // Main method
    public static void main(String[] args) {
        try {
            // Read the values of 'a' and 'b' from input.txt
            Scanner scanner = new Scanner(new File("input.txt")); // Exception Handling
            String a = scanner.nextLine();
            String b = scanner.nextLine();
            scanner.close();

            // Calculate the LCM
            BigInteger result = lcm(a, b); // Code Modularity

            // Print the result to the console
            System.out.println("LCM of " + a + " and " + b + " is: " + result);
        } catch (FileNotFoundException e) {
            // If the file isn't found, show an error message
            System.out.println("File not found: " + e.getMessage()); // Exception Handling
        }
    }
}
