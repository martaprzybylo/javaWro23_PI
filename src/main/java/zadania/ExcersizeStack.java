package zadania;

import java.util.Scanner;
import java.util.Stack;

public class ExcersizeStack {

    private static String someText;
    private static String finalWord = "";
    private static Stack <Character> ws;

    public static void main(String[] args) {

        ExcersizeStack es = new ExcersizeStack();
        Scanner sc = new Scanner(System.in);
        System.out.println("Podaj tekst, a ja wyswietle go w odwrotnej kolejnosci");
        someText = sc.nextLine();
        es.reverseText(someText);
    }

    public void reverseText (String message){
        ws = new Stack<Character>();

        for(Character item : someText.toCharArray()){
            ws.push(item);
        }

        for(int i = 0; i < someText.length(); i++){
            finalWord += ws.pop();
        }

        System.out.println(finalWord);
    }
}


