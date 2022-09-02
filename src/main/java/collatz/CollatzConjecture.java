package collatz;


import java.util.ArrayList;
import java.util.List;

public class CollatzConjecture {

    public List<Integer> collatzConjecture(int number){

        List<Integer> numbers=new ArrayList<>();
        if (number==0){
            return numbers;
        }

        numbers.add(number);

        int i=number;




        while (i!=1){

            if (i % 2 == 0) {
                numbers.add(i / 2);
            } else {
                numbers.add(i * 3 + 1);
            }
            i=numbers.get(numbers.size()-1);
        }

        int lastElement=numbers.get(numbers.size()-1);

//        if (lastElement==1) {
//            int k=lastElement*3+1;
//            int k2=k/2;
//
//            numbers.add(k);
//            numbers.add(k2);
//            numbers.add(lastElement);
//        }
        return numbers;
    }


    public static void main(String[] args) {


        CollatzConjecture collatzConjecture=new CollatzConjecture();

        int max=1;
        int maxSize=1;

        for(int i=1;i<=2000;i++){
//            System.out.println(i+ " -"+collatzConjecture.collatzConjecture(i).size()+" - " + collatzConjecture.collatzConjecture(i));
            System.out.printf("%3d  - %3d - ",i,collatzConjecture.collatzConjecture(i).size());
            System.out.print(collatzConjecture.collatzConjecture(i)+"\n");




            if (collatzConjecture.collatzConjecture(i).size()>collatzConjecture.collatzConjecture(max).size()){
                max=i;
                maxSize = collatzConjecture.collatzConjecture(i).size();
            }
        }
        System.out.println(max);
        System.out.println(collatzConjecture.collatzConjecture(max));
        System.out.println(maxSize);
//
//        System.out.println(collatzConjecture.collatzConjecture(313).size());
//        System.out.println(collatzConjecture.collatzConjecture(1249).size());




}
}
