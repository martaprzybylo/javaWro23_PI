package PrimeNumbers;

import java.util.ArrayList;
import java.util.List;

public class PrimeCalculator {

    public boolean isPrime(int n){
        if (n<2)
            return false;
        int d = (int)Math.sqrt(n);
        while (d>1){
            if (n%d==0) return false;
            d--;
        } return true;
    }
    public List <Integer> getPrimeNumber (int upperLimit){
        List<Integer> list = new ArrayList<Integer>();
        for (int i=2; i<=upperLimit;++i){
            if (isPrime(i))
                list.add(i);
        }
    return list;

    }
}
