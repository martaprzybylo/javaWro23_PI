package ZadanieNaRozgrzewke;

import java.util.LinkedList;
import java.util.Random;
import java.util.Scanner;

public class ZadanieMain {
    private static final int upperBound = 100;

    public static void main(String[] args) {

        Random generator = new Random();
        int numbers = generator.nextInt(upperBound);

        Scanner sc = new Scanner(System.in);
        System.out.println("Podaj liczb�");


            for (int i = 0; i < 7; i++) {
                int number1 = sc.nextInt();
                if (number1 == numbers) {
                    System.out.println("Gratulacje, gra si� zako�czy�a");
                    return;
                }
                if (number1 < numbers)
                    System.out.println("Liczba jest za ma�a");
                else
                    System.out.println("Liczba jest za du�a");

            }

        System.out.println(numbers);
    }
}
