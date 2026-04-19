package lab3b;


import java.util.Scanner;

public class p20 {

    public static int countWords(String str) {
        if (str == null || str.trim().isEmpty()) return 0;

        String[] words = str.trim().split("\\s+");
        return words.length;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        System.out.println("Number of words: " + countWords(input));

        sc.close();
    }
}
