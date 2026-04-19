package lab3b;


import java.util.Scanner;

public class p17 {

    public static String truncate(String str, int length) {
        if (str == null) return null;

        if (str.length() <= length) return str;

        return str.substring(0, length) + "...";
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        System.out.print("Enter max length: ");
        int len = sc.nextInt();

        System.out.println("Truncated: " + truncate(input, len));

        sc.close();
    }
}
