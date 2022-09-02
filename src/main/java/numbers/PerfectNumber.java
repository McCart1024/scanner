package numbers;

import java.util.ArrayList;
import java.util.List;

public class PerfectNumber {

    public int sumOfDigits(int number){
        String[] stringNumber=String.valueOf(number).split("");
        int sum=0;
        for (int i=0;i<stringNumber.length;i++){
            sum+=Integer.parseInt(stringNumber[i]);
        }

//        char [] charArray=String.valueOf(number).toCharArray();
//        for (int i=0;i<String.valueOf(number).length();i++){
//            sum+=Integer.valueOf(String.valueOf(charArray[i]));
//        }
        return sum;
    }

    public static void main(String[] args) {
        PerfectNumber perfectNumber=new PerfectNumber();
        System.out.println(perfectNumber.sumOfDigits(226851));

        System.out.println(perfectNumber.isPerfectNumber(8128));

        System.out.println(perfectNumber.perfectNumber(8200));
    }

    public boolean isPerfectNumber(int number){

        int sum=0;
        for (int i=1;i<number;i++){
            if (number%i==0){
                sum+=i;
            }
        }

        if (sum==number){
            return true;
        }else {
            return false;
        }


    }

    public List<Integer> perfectNumber(int number){

        List<Integer> perfectNumbers =new ArrayList<>();


        for (int i=1;i<number;i++){
            int sum=0;
            for (int j=1;j<i;j++){

                if (i%j==0){
                    sum+=j;

                }

            }
            if (sum==i){
                perfectNumbers.add(i);
            }
        }
        return perfectNumbers;

    }
}
