package classstructureio;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {

        System.out.println("Add meg az első (egész) számot!");
        Scanner scanner=new Scanner(System.in);
        int a= scanner.nextInt();
        System.out.println("Add meg a második (egész) számot!");
        int b=scanner.nextInt();
        System.out.println(+a+" + "+b);
        System.out.println(a+b);

    }
}
