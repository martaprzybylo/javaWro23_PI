package Conventer;

public class NumbersConventer {
    public String binaryToDecimal(String binaryNumber){
        int power = 0;
        int sum = 0;
        char [] binaryCharArray = binaryNumber.toCharArray();
        for (int i = binaryCharArray.length-1; i>=0; i--){
            int curentBit = Character.getNumericValue(binaryCharArray[i]);
            sum += curentBit* Math.pow(2, power++);
        }
        return Integer.toString(sum);

    }
}
