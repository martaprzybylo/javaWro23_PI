package zadania;

import java.util.Random;
import java.util.Scanner;

public class QuickSort {
    private static int tablica[];
    private static int ile_liczb;
    private static int upperBounds = 1000;

    private static void quicksort(int tablica[], int x, int y) {
        int i,j,v,temp;
        i=x;
        j=y;
        v=tablica[(x+y) / 2];
        do {
            while (tablica[i]<v)
                i++;
            while (v<tablica[j])
                j--;
            if (i<=j) {
                temp=tablica[i];
                tablica[i]=tablica[j];
                tablica[j]=temp;
                i++;
                j--;
            }
        }
        while (i<=j);
        if (x<j)
            quicksort(tablica,x,j);
        if (i<y)
            quicksort(tablica,i,y);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        int i,liczba;

        System.out.println("Ile liczb chesz posortowac.");
        ile_liczb = sc.nextInt();
        tablica = new int[ile_liczb];
        for(i=0; i<ile_liczb; i++) {
            tablica[i] = random.nextInt(upperBounds);
        }

        System.out.println("Tablica przed posortowaniem:");
        for(i=0; i<ile_liczb; i++)
            System.out.print(tablica[i] + " ");
        quicksort(tablica,0, ile_liczb-1);
        System.out.println(" ");
        System.out.println("Tablica po posortowaniu:");
        for(i=0; i<ile_liczb; i++)
            System.out.print(tablica[i] + " ");
    }

}
