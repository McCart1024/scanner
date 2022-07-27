package csomag;

import java.util.Scanner;

public class scanner {
    public static void main(String[] args) {

        System.out.println("What is your name?");
        Scanner scanner=new Scanner(System.in);
        String name=scanner.nextLine();
        System.out.println("Hello "+ name+"!");

        System.out.println("korod?");
        Scanner scanner2=new Scanner(System.in);
        int age=scanner2.nextInt();
        int birthDate=2022-age;
        System.out.println("született: "+birthDate);

    }
}
