package listy;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.*;


public class ListaZamianaElementyMiejscami {

    public static void main(String[] args) {
        ListaZamianaElementyMiejscami object = new ListaZamianaElementyMiejscami();
        List list = new ArrayList();

        Scanner sc = new Scanner(System.in);

        for (int i = 1; i<11;i++){
            list.add(i);
        }
        System.out.println("My list contains the following arguments: " + list);

        System.out.println("Please, give me first index: ");
        int fIndex = sc.nextInt();
        System.out.println("Please, give me second index: ");
        int sIndex = sc.nextInt();
        System.out.println("Please, give me once again first index: ");
        int fIndex2 = sc.nextInt();
        System.out.println("Please, give me once again second index: ");
        int sIndex2 = sc.nextInt();

        List newList = object.swapValue(list,fIndex,sIndex);
        List newList2 = object.swapValue(newList,fIndex2,sIndex2);
        System.out.println("Your list contains the same arguments, but in a diffrent order:" + newList2);
    }

    public List swapValue(List tempList, int firstIndex, int secondIndex){
        int firstValue = (int) tempList.get(firstIndex);
        int sceondValue = (int) tempList.get(secondIndex);
        tempList.set(firstIndex,sceondValue);
        tempList.set(secondIndex,firstValue);
        return tempList;
    }

}
