package zadaniaDomowe;


import java.util.Random;
import java.util.Scanner;

public class MinMax {

    private static final int upperBound = 100;
    private static int a[];

    public static void main(String[] args) {
        int n, wynik;
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();


        System.out.println("Podaj liczbe elementow tablicy");
        n = scanner.nextInt();
        a = new int[n];
        for (int i=0; i<n; i++) {
            a[i] = random.nextInt(upperBound);
        }

        wynik = a[0];
        for (int i=1; i<n; i++) {
            if (wynik > a[i]) {
                wynik = a[i];
            }
        }

        System.out.println("Najmniejszy element w tablicy to " + wynik);

        wynik = a[0];
        for (int i=1; i<n; i++) {
            if (wynik < a[i]) {
                wynik = a[i];
            }
        }

        System.out.println("Najwiekszy element w tablicy to " + wynik);

    }

}