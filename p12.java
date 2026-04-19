package lab3b;

import java.util.Scanner;

public class p12 {

    // User-defined function to count occurrences of a substring
    public static int countOccurrences(String mainStr, String subStr) {

        int count = 0;
        int index = 0;

        // Loop to find all occurrences
        while ((index = mainStr.indexOf(subStr, index)) != -1) {
            count++;
            index = index + subStr.length(); // move ahead
        }

        return count;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the main string: ");
        String mainStr = sc.nextLine();

        System.out.print("Enter the substring: ");
        String subStr = sc.nextLine();

        int result = countOccurrences(mainStr, subStr);

        System.out.println("Number of occurrences: " + result);

        sc.close();
    }
}
