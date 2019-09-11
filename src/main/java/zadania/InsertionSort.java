package zadania;

import java.util.Random;
import java.util.Scanner;

public class InsertionSort {

    private static final int upperBound = 1000;
    private static int [] table;
    private static int number;


    public static void main(String[] args){
        System.out.println("Insertion Sort\n");
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        System.out.println("Ile liczb chcesz posortowac?");
        number = scanner.nextInt();

        table = new int[number];
        for(int i = 0; i<number; i++){
            table[i] = random.nextInt(upperBound);
        }

        System.out.println("Wylosowane liczby to:");
        for (int i:table) {
            System.out.println(i);
        }
        System.out.println("Posortowane liczby to:");
        insertionSort(table);
    }

    public static void insertionSort(int[] tableToSort){
        int currrent, otherIndex;
        for (int i = 1; i<number; i++){
            currrent = tableToSort[i];
            otherIndex = i;
            while (otherIndex>0&&currrent<tableToSort[otherIndex-1]){
                tableToSort[otherIndex] = tableToSort[otherIndex-1];
                otherIndex--;
            }
            tableToSort[otherIndex] = currrent;
        }

        for(int index = 0 ; index<tableToSort.length; index++){
            System.out.println("#"+ (index+1) +" :\t" + tableToSort[index]);
        }
    }
}