//*Write a Java Program for Eliminating all whitespace characters from a string using user defined function removeWhitespace()


package lab3b;


import java.util.Scanner;

public class p15 {

    // User-defined function to remove whitespace
    public static String removeWhitespace(String str) {
        if (str == null) return null;

        return str.replaceAll("\\s", "");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        String result = removeWhitespace(input);

        System.out.println("String after removing whitespace: " + result);

        sc.close();
    }
}
