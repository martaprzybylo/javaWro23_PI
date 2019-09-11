package zadania;

import java.util.Scanner;

public class Silnia {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Podaj liczbe");
        int n = sc.nextInt();
        Silnia silnia = new Silnia();
        int iteracja=0;
        int rekurencja = 0;

        rekurencja = recursiveFactorial(n);
        iteracja = iterativeFactorial(n);

        System.out.println("Iteracja: "+ iteracja);
        System.out.println("Rekurencja: "+ rekurencja);
    }
    public static int recursiveFactorial(int n){
        if (n==0){
            return 1;
        }else {
            return n*recursiveFactorial(n-1);
        }
    }
    public static int iterativeFactorial(int n){
        int product = 1;
        if (n==0){
            return 1;
        }else {
            for (int i = 1; i<=n; i++){
                product=product*i;
            }
        }return product;
    }
}
