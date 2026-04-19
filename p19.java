package lab3b;


import java.util.Scanner;
import java.util.Random;

public class p19 {

    public static String generateRandomString(int length) {
        String chars = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
        Random rand = new Random();
        String result = "";

        for (int i = 0; i < length; i++) {
            int index = rand.nextInt(chars.length());
            result += chars.charAt(index);
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter length: ");
        int len = sc.nextInt();

        System.out.println("Random String: " + generateRandomString(len));

        sc.close();
    }
}
