package zadania;

import java.util.Scanner;

public class CesarEncryption {

    public static void main(String[] args) {
        CesarEncryption cesarEncryption = new CesarEncryption();
        String input = cesarEncryption.inputFromUser().toUpperCase();
        System.out.println(input);
        String encrypted = cesarEncryption.encrypt(input);
        System.out.println(encrypted);
//        String decrypted = cesarEncryption.decrypt(encrypted);
//        System.out.println(decrypted.toUpperCase());
    }

    public String inputFromUser() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your text to encrypt");
        String result = sc.nextLine();
        sc.close();
        return result;
    }

    public String encrypt(String message) {
        StringBuilder stringBuilder = new StringBuilder(message);
        int distance = 3;
        for (int i = 0; i < stringBuilder.length(); i++) {
            int c = (int) stringBuilder.charAt(i);
            if (c + distance > 90) {
                c = 64 + (distance - (90 - c));
            }
            else{
                c += distance;
            }
            stringBuilder.setCharAt(i, (char) c);
        }
        return stringBuilder.toString();
    }
    public String decrypt(String message) {
        StringBuilder stringBuilder = new StringBuilder(message);
        int distance = 3;
        for (int i = 0; i < stringBuilder.length(); i++) {
            int c = (int) stringBuilder.charAt(i);
            if (c - distance > 64) {
                c = 91 - (distance - (c-64));
            }
            else{
                c -= distance;
            }
            stringBuilder.setCharAt(i, (char) c);
        }
        return stringBuilder.toString();
    }
}
