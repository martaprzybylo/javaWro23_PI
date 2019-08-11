package Stopwatch;

public class MainStopwatch {
    private static final int c = 2;
    private static int liczbaElementow = 10;

    public static void main(String[] args) {

        Stopwatch stopwatch = new Stopwatch();


        int result;
        int [] table = new int[liczbaElementow];
        stopwatch.start();

        for (int number:table) {
            result = number*c;
        }
        System.out.println(stopwatch.stop()/100000000);
    }

}
