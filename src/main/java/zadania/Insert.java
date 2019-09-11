package zadania;

import java.util.Scanner;

public class Insert {

    private static int [] table;
    private static int numbers;

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Ile liczb chesz posortowac.");
        numbers = sc.nextInt();
        System.out.println("Wypisz wszystkie liczby");
        table = new int[numbers];
        for(int i = 0; i< numbers; i++) {
            table[i] = sc.nextInt();
        }

        System.out.println("Tablica przed posortowaniem:");
        for(int i=0; i< numbers; i++)
            System.out.println(table[i]);
        insertionsort(table, numbers);
        System.out.println("Tablica po posortowaniu:");
        for(int i=0; i< numbers; i++)
            System.out.println(table[i]);
    }

    private static void insertionsort(int [] tableToSort, int ile_liczb) {
        int j,v;

        for (int i=1;i<ile_liczb;i++) {
            j=i;
            v=tableToSort[i];
            while ((j>0) && (tableToSort[j-1]>v)) {
                tableToSort[j]=tableToSort[j-1];
                j--;
            }
            tableToSort[j]=v;
        }
    }

}
