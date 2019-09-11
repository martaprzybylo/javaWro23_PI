package zadania.gcd;

public class Gcd {

    public int recursive(int a, int b){
        if (a==b){
            return a;
        }
        int newA = a > b ? a - b : a;
        int newB = a < b ? b - a : b ;

        return recursive(newA,newB);
    }

    public int iterative(int a, int b) {
        while (a != b) {
            if (a > b)
                a = a - b;
             else
                 b = b - a;
            }
        return a;
    }
}
