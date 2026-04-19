package lab3b;


import java.util.Scanner;

public class p18 {

    public static boolean isNumeric(String str) {
        if (str == null || str.isEmpty()) return false;

        return str.matches("\\d+");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        if (isNumeric(input)) {
            System.out.println("The string contains only numeric characters.");
        } else {
            System.out.println("The string is NOT numeric.");
        }

        sc.close();
    }
}

