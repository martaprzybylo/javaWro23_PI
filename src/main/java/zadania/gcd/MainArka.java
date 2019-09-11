package zadania.gcd;

import java.util.Scanner;

public class MainArka {
    // najwiekszy wspolny mianownik

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Podaj pierwsza liczbe:");
        int a = sc.nextInt();
        System.out.println("Podaj druga liczbe:");
        int b = sc.nextInt();
        Gcd gcd = new Gcd();

        System.out.println("Njwiekszy wspolny mianownik metoda iteracyjna to:");
        System.out.println(gcd.iterative(a,b));
        System.out.println("Njwiekszy wspolny mianownik metoda rekurencyjna to:");
        System.out.println(gcd.recursive(a,b));
    }
}
