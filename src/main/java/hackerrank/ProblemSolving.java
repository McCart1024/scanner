package hackerrank;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ProblemSolving {

    public static int simpleArraySum(List<Integer> ar) {
        int[] arr = {1, 2, 3, 4, 10, 11};
        StringBuilder sb = new StringBuilder();
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sb.append(arr[i]);
            sum += arr[i];
            if (arr[i] != arr[arr.length - 1]) {
                sb.append("+");
            }
        }
        sb.append("=");
        sb.append(sum);
        System.out.println(sb.toString());
        return sum;
    }

    public static List<Integer> compareTriplets(List<Integer> a, List<Integer> b) {
        List<Integer> result=new ArrayList<>();
        int min=Math.min(a.size(),b.size());
        int resultA=0;
        int resultB=0;
        for(int i=0;i<min;i++){
            if(a.get(i)>b.get(i)){
                resultA++;
            }
            if(a.get(i)<b.get(i)){
                resultB++;
            }
        }
        result.add(resultA);
        result.add(resultB);

        return result;
    }

    public long aVeryBigSum(List<Long> ar) {
        long sum=0;
        for(Long actual:ar){
            sum+=actual;
        }
        return sum;

    }

    public int diagonalDifference(List<List<Integer>> arr) {

        int sumA=0;
        int sumB=0;

        for(int i=0;i<arr.size();i++){
            for(int j=0; j<arr.size(); j++){
                if(i==j){
                    sumA+=arr.get(i).get(j);
                }
                if(i+j==arr.size()-1){
                    sumB+=arr.get(i).get(j);
                }
            }
        }
        return Math.abs(sumA-sumB);
    }

    public void plusMinus(List<Integer> arr) {
        double positive=0 , negative=0;
        double nulls=0;
        for(int actual:arr){
            if (actual < 0) {
                negative++;
            }
            else if (actual>0) {
                positive++;
            } else {
                nulls++;
            }
            }
        int length=arr.size();
        System.out.println(Math.round(positive/length*1000000)/1000000d);
        System.out.println(Math.round(negative/length*1000000)/1000000d);
        System.out.println(Math.round(nulls/length*1000000)/1000000d);
    }

    public static void main(String[] args) {
        List<Long> numbers= Arrays.asList(1000000001l, 1000000002l, 1000000003l, 1000000004l, 1000000005l);
        ProblemSolving problemSolving=new ProblemSolving();
        System.out.println(problemSolving.aVeryBigSum(numbers));
        System.out.println(Math.round(2/6d*1000000)/1000000d);

        List<Integer> ints=Arrays.asList(-4, 3, -9, 0, 4, 1);
        problemSolving.plusMinus(ints);






    }
}
