package hackerrank;

import java.util.Scanner;

public class Test {

    public static void main(String[] args) {

        System.out.printf("%s%n", "================================");
        System.out.printf("%-15s %03d%n", "java", 100);
        System.out.printf("%-15s %03d%n", "ccp", 65);
        System.out.printf("%-15s %03d%n", "python", 50);
        System.out.printf("%s%n", "================================");

        System.out.println();

        Scanner scanner = new Scanner(System.in);
//
//        System.out.println();
//
//        System.out.printf("%s%n","================================");
//        for(int i=0;i<3;i++){
//            String s=scanner.next();
//            int x=scanner.nextInt();
//
//            System.out.printf("%-15s%03d%n",s,x);
//        }
//        System.out.printf("%s%n","================================");


        int N = scanner.nextInt();
        for (int i =1 ; i < 11; i++) {
            System.out.println(N + " x " + i + " = " + N * i);
        }
    }
}