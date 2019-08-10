package Bunny;

public class MainBunny {

    public static void main(String[] args) {
        BunnyCounter bunnyCounter = new BunnyCounter();
        System.out.println(bunnyCounter.bunnyRec1(19));
        System.out.println(bunnyCounter.bunnyRec2(19));
        System.out.println(bunnyCounter.bunnyIter(19));
    }
}
