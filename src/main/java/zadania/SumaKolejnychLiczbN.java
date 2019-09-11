package zadania;

import java.util.Scanner;

public class SumaKolejnychLiczbN {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Podaj liczbe");
        int n = sc.nextInt();
        SumaKolejnychLiczbN skl = new SumaKolejnychLiczbN();
        int iteracja, rekurencja = 0;

        iteracja = skl.sumaIteracja(n);
        rekurencja = skl.sumaRekurencja(n);

        System.out.println("Iteracja: "+ iteracja);
        System.out.println("Rekurencja: "+ rekurencja);
    }

    public static int sumaIteracja(int n) {
        int suma = 0;
        while(n > 0) {
            suma +=n;
            n--;
        }
        return suma;
    }

    public static int sumaRekurencja(int n) {
        if(n>0) {
            return n + sumaRekurencja(n-1);
        } else {
            return 0;
        }
    }

}

