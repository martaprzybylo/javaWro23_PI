package Sort;

public class MainSort {
    public static void main(String[] args) {
        int [] table = new int[] {3,2,6,1,3,7};
        BubbleSort bubbleSort = new BubbleSort();
        table=bubbleSort.sort(table);

        for (int n:table){
            System.out.print(n + " ");
        }
    }
}
