package zadania;

public class CzyKwadratLiczbyCalowitej {
    private  boolean isSquare(int a){
        int sqrRoot=(int)Math.sqrt(a);
        if(sqrRoot*sqrRoot==a)
            return true;
        else
            return false;
    }
}
