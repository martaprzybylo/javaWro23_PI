package zadania;

import java.util.Random;
import java.util.Scanner;

public class MinMax {

    private static final int upperBound = 100;
    private static int number, max, min;

    public static void main(String[] args) {
        MinMax minMax = new MinMax();
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.println("Podaj liczbe elementow tablicy");
        number = scanner.nextInt();

        int [] table = new int[number];
        for (int i=0; i<number; i++) {
            table[i] = random.nextInt(upperBound);
        }
        System.out.println("Najmniejszy element w tablicy to " + minMax.findMin(table));
        System.out.println("Najwiekszy element w tablicy to " + minMax.findMax(table));
    }
    public int findMin(int [] table){
        min = table[0];
        for (int i=1; i<number; i++) {
            if (min > table[i]) {
                min = table[i];
            }
        }return min;
    }

    public int findMax(int[] table) {
        max = table[0];
        for (int i = 1; i < number; i++) {
            if (max < table[i]) {
                max = table[i];
            }
        } return max;
    }

}