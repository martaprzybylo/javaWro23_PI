package PrimeNumbers;

import java.util.List;
import java.util.Scanner;

public class MainPrimeNumber {
    public static void main(String[] args) {

PrimeCalculator primeCalculator = new PrimeCalculator();
        System.out.println(primeCalculator.isPrime(99));

        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj liczb¹ wiêksz¹ od 2, a ja podam Ci wszystkie liczby pierwsze od 2 do Twojej liczby.");
        int upperLimit = scanner.nextInt();

        List<Integer> list = primeCalculator.getPrimeNumber(upperLimit);
        for (int i:list
             ) {
            System.out.print(i+" ");
        }
    }

}
