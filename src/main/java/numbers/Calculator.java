package numbers;

import java.util.ArrayList;
import java.util.List;

public class Calculator {

    public int findMinMaxSum(int[] arr){

        List<Integer>source=new ArrayList<>();
        for(int actual:arr){
            source.add(actual);
        }

        List<Integer> numbers=new ArrayList<>();
        while(numbers.size()<5) {
            int min=source.get(0);
            int temp=0;
            for (int i = 0; i < source.size(); i++) {
                if(min<source.get(i)){
                    min=source.get(i);
                    temp=i;
                }
            }
            numbers.add(min);
            source.remove(temp);
        }
        int result=0;
        for(Integer actual:numbers){
            result+=actual;
        }
        return result;
    }

    public static void main(String[] args) {
        int[] arr={1,3, 5, 7, 9};
        int[] arr2={1, 1, 3, 5, 26, 99};
        Calculator calculator=new Calculator();
        System.out.println(calculator.findMinMaxSum(arr2));
    }
}
