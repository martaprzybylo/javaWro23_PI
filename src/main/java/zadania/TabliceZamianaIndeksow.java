package zadania;

import java.util.Random;
import java.util.Scanner;

public class TabliceZamianaIndeksow {
    private static final int upperBound = 100;
    private static int[] table;
    private static int number, i, index, index2, temp;

    /*
    Napiszmetodê, która bêdzie zamienia³a dwa wybrane elementy tablicy miejscam i i zwróci now¹
    tablicê(oryginalna tablica ma zostaæ niezmieniona).
    Nag³ówekmetody: public int[] swap(int[] tab, int firstIndex, int secondIndex)
     */
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        TabliceZamianaIndeksow tabliceZamianaIndeksow =new TabliceZamianaIndeksow();

        System.out.println("Podaj ilosc elementow tablicy");
        number = scanner.nextInt();
        table = new int[number];
        for (i = 0; i<number;i++){
            table[i] = random.nextInt(upperBound);
        }
        for (int i:table) {
            System.out.print(i + ", ");
        }

        System.out.println(" ");
        System.out.println("Teraz zamienie dwa dowolne indeksy tablicy miejscami i wyswietle nowa tablice.");
        System.out.println("Podaj pierwszy index tablicy");
        index = scanner.nextInt();
        System.out.println("Podaj drugi index tablicy");
        index2 = scanner.nextInt();

        System.out.println(tabliceZamianaIndeksow.swap(table,index,index2));

    }
    public int[] swap(int[] tab, int firstIndex, int secondIndex){
        index = firstIndex;
        index2 = secondIndex;
        temp = tab[firstIndex];
        tab[firstIndex] = tab[secondIndex];
        tab[secondIndex] = temp;

        for (int i:tab) {
            System.out.print(i + " ");
        }
        System.out.println(" ");
        return tab;

    }
}