package Stopwatch;

public class MainStopwatch {

    public static void main(String[] args) {

        Stopwatch stopwatch = new Stopwatch();

        stopwatch.start();

        System.out.println(stopwatch.stop() + " nanosekund");
    }

}
