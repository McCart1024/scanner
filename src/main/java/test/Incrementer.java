package test;


import java.util.Arrays;
import java.util.List;

public class Incrementer {

        public int inc(int i) {
            final int i6;

            return i + 1;
        }

        public static void main(String[] args) {

            List<Integer> intt= Arrays.asList(1,2,3,4,5,5,9);
            System.out.println(intt);

            long k = 10; int i = (int) k;

            int i2 = 5;
            System.out.println(new Incrementer().inc(i2));
        }
    }

