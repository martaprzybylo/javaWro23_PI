package zadania;

class FindDuplicate {
    public static void main (String[] args) {
        int[] A = { 4, 3, 2, 4, 1, 6 };
        System.out.println("Duplicate element is " + findDuplicate(A));
    }

    public static int findDuplicate(int[] A) {
        boolean visited[] = new boolean[A.length+1];

        for (int i = 0; i < A.length; i++) {
            if (visited[A[i]]) {
                return A[i];
            }
            visited[A[i]] = true;
        }
        return -1;
    }
}