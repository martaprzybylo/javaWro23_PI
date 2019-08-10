package Sort;

public class BubbleSort {
    public int [] sort (int [] table) {
        boolean isSorted = false;
        while (!isSorted) {
            isSorted = true;
            for (int i = 0; i < table.length - 1; i++) {
                if (table[i] > table[i + 1]) {
                    int tmp = table[i];
                    table[i] = table[i + 1];
                    table[i + 1] = tmp;
                    isSorted = false;
                }
            }

        }
        return table;
    }
}
