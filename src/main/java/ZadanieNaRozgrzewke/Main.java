package ZadanieNaRozgrzewke;

import java.util.Random;
import java.util.Scanner;

public class Main {

   private static final int upperBound = 100;

    public static void main(String[] args) {
        Random random = new Random();
        int randNumber = random.nextInt(upperBound);
        Scanner sc = new Scanner(System.in);

        System.out.println("Podaj liczbê");

        for (int i = 0; i<7; i++){
           int playerNumber = sc.nextInt();
           if (playerNumber==randNumber) {
               System.out.println("Win");
               return;
           }
           if (playerNumber<randNumber)
               System.out.println("Za ma³o");
           else
               System.out.println("Za du¿o");
        }
        System.out.println(randNumber);

    }
}
