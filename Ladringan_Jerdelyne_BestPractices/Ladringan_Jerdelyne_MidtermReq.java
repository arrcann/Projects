import java.io.File;
import java.io.FileNotFoundException;
import java.math.BigInteger;
import java.util.Scanner;

public class Ladringan_Jerdelyne_MidtermReq {

    // Function to calculate LCM of two large numbers
    public static BigInteger lcm(String a, String b) {
        // Convert string 'a' and 'b' into BigInteger
        BigInteger s = new BigInteger(a);
        BigInteger s1 = new BigInteger(b);

        // Calculate multiplication of two BigIntegers
        BigInteger mul = s.multiply(s1);

        // Calculate GCD of two BigIntegers
        BigInteger gcd = s.gcd(s1);

        // Calculate LCM using formula: LCM * GCD = a * b
        BigInteger lcm = mul.divide(gcd);
        return lcm;
    }

    // Main method
    public static void main(String[] args) {
        try {
            // Read the values of 'a' and 'b' from input.txt
            Scanner scanner = new Scanner(new File("input.txt"));
            String a = scanner.nextLine();
            String b = scanner.nextLine();
            scanner.close();

            // Calculate the LCM
            BigInteger result = lcm(a, b);

            // Print the result to the console
            System.out.println("LCM of " + a + " and " + b + " is: " + result);
        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + e.getMessage());
        }
    }
}
