package zadania;

public class SumaCyfrLiczby {
    private static int sumaCyfr(int number) {
        int sum = 0;
        do {
            int digit =  number % 10;
            sum += digit;
            number = (number - digit) / 10;
        }
        while ( number != 0 );
        return sum;
    }
}
