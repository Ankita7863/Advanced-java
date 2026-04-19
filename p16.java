package lab3b;



import java.util.Scanner;

public class p16 {

    public static String capitalizeWords(String str) {
        if (str == null || str.isEmpty()) return str;

        String[] words = str.toLowerCase().split("\\s+");
        String result = "";

        for (String word : words) {
            result += Character.toUpperCase(word.charAt(0)) + word.substring(1) + " ";
        }

        return result.trim();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        System.out.println("Capitalized: " + capitalizeWords(input));

        sc.close();
    }
}