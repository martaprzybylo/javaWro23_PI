package zadania;

import java.util.Random;
import java.util.Scanner;

public class MinMax2 {
    private static final int upperBounds = 100;
    private static int number, min, max;

    public static void main(String[] args) {
        MinMax2 minMax2 = new MinMax2();
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        System.out.println("Podaj liczbe elementow tablicy");
        number = scanner.nextInt();

        int[]table = new int[number];
        for (int index = 0; index<number;index++){
            table[index] = random.nextInt(upperBounds);
        }
        System.out.println(minMax2.findMin(table));
        System.out.println(minMax2.findMax(table));
    }

    public int findMin(int[] table) {
        min = table[0];
        for (int i =1; i<number; i++){
            if (min>table[i]){
                min = table[i];
            }
        }
        return min;
    }
    public int findMax(int[] table) {
       max=table[0];
       for (int i =1; i<number; i++){
           if (max<table[i]){
               max = table[i];
           }
       }
        return max;
    }
}
