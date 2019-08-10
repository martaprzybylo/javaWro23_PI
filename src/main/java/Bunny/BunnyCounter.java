package Bunny;

public class BunnyCounter {

    public int bunnyRec1(int n){
        if (n==0)
            return 0;
        if (n==1)
            return 1;
        return bunnyRec1(n-1)+bunnyRec1(n-2);
    }
    private int counter = 1;

    public int bunnyRec2(int n){
        if (n==0)
            return 0;
        if (n==1)
            return 1;
        counter=1;
        return bunnyRec2(n,0,1);
    }
    private int bunnyRec2(int n, int p, int pp){
        if (n==counter++)
            return p+pp;
        int temp = p;
        p+=pp;
        pp=temp;
        return bunnyRec2(n,p,pp);
    }
    public int bunnyIter(int n) {
        if (n == 0)
            return 0;
        if (n == 1)
            return 1;

        int sum = 1;
        int pp = 0;
        int p = 1;
        for (int i = 2; i < n; ++i) {
            int tmp = pp;
            pp=p;
            p=tmp+p;
        }
        return p+pp;
    }
}
