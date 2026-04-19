package lab3b;
import java.util.Scanner;

public class p14 {

    // User-defined function to check palindrome
    public static boolean isPalindrome(String str) {

        if (str == null)
            return false;

        // Remove punctuation and whitespace, convert to lowercase
        String cleaned = str.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

        // Reverse the cleaned string
        String reversed = new StringBuilder(cleaned).reverse().toString();

        return cleaned.equals(reversed);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        if (isPalindrome(input)) {
            System.out.println("The string is a palindrome.");
        } 
        else {
            System.out.println("The string is NOT a palindrome.");
        }

        sc.close();
    }
}
