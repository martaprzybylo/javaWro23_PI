package Stopwatch;

public class Stopwatch {

    private static long startTime;
    private  static boolean isRunning;
    private static int c = 2;
    private static int n = 10;
    private static int[]tab = new int[n];

    public void start() {
        if (isRunning)
            return;
       this.startTime = System.nanoTime();
       this.isRunning=true;
       for (int i = 0; i<n; i++){
           tab[i]+=c;
       }
    }

    public long stop(){
        if (!isRunning)
            return -1;
        this.isRunning=false;
        return ((System.nanoTime()-startTime));
    }
}
