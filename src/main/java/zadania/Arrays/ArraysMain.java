package zadania.Arrays;

public class ArraysMain {
    private static int[] table = new int [20];
    private int sum, sum2, sum3;

    public static void main(String[] args) {
        ArraysMain arraysMain = new ArraysMain();

        for (int i=0; i<table.length; i++){
            table[i] = i+3;
        }

        System.out.println("Wszystkie elementy tablicy:");
        printArray(table);
        System.out.println("\n" + "Wszystkie elementy tablicy od ty³u:");
        printReverseArray(table);
        System.out.println("\n" + "Wszystkie elementy tablicy na nieparzystych pozycjach/indeksach:");
        getOddPosition(table);
        System.out.println("\n" + "Wszystkie elementy tablicy podzielne przez 3:");
        couldBeDividedBy3(table);
        System.out.print("\n" + "Suma wszystkich elementow tablicy: "+arraysMain.arraySum(table));
        System.out.print("\n"+"Suma pierwszych 4 elementow tablicy: "+arraysMain.first4ElementsSum(table));
        System.out.print("\n"+"Suma ostatnich 5 elementow tablicy: "+arraysMain.last5ElementsSum(table));
        System.out.print("\n"+"Ilosc liczb idac od poczatku tablicy, zeby ich suma przekroczyla 10: " );
        numberOfFirstElementWithSumTen(table);

    }

    public static void printArray(int [] tableToPrint) {
        for (int i : table) {
            System.out.print(i + " ");
        }
    }

    public static void printReverseArray(int[]tableToPrint) {
        for (int i = table.length - 1; i >= 0; i--) {
            System.out.print(table[i] + " ");
        }
    }

    public static void getOddPosition(int[]tableToPrint) {
        for (int i = 1; i < table.length; i+=2) {
                System.out.print(table[i] + " ");
        }
    }

    public static void couldBeDividedBy3(int[]tableToPrint){
        for (int i = 0; i < table.length; i++) {
            if (table[i] % 3 == 0)
                System.out.print(table[i] + " ");
        }
    }

    public int arraySum(int []tableToPrint){
        for (int i = 0; i < table.length; i++) {
            sum += table[i];
        }
        return sum;
    }

    public int first4ElementsSum(int [] tableToPrint) {
        for (int i = 0; i < 4; i++) {
                sum2 += table[i];
        }
        return sum2;
    }

    public int last5ElementsSum(int[]tableToPrint){
        for (int i = table.length - 1; i >= 15; i--) {
                sum3 += table[i];
        }
        return sum3;
    }

    public static void numberOfFirstElementWithSumTen(int[]tableToPrint){
        int sum4 = 0;
        for (int i = 0; i<table.length;i++){
            sum4+=table[i];
            if(sum4 >10){
                System.out.println(i+1);
                break;
            }
        }
    }

}
