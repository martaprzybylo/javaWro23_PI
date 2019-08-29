package Stopwatch;

public class Stopwatch {

    private long startTime;
    private  boolean isRunning;

    public void start() {
        if (isRunning)
            return;
       long startTime = System.nanoTime();
       isRunning=true;
    }

    public long stop(){
        if (!isRunning)
            return -1;
        isRunning=false;
        return (System.nanoTime()-startTime)/1000000000;
    }
}
