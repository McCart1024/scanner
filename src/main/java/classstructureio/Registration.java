package classstructureio;

import java.util.Scanner;

public class Registration {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        System.out.println("Username:");
        String nickName=scanner.nextLine();
        System.out.println("Email address:");
        String mailAddress=scanner.nextLine();
        System.out.println("username: "+nickName+" , e-mail: "+mailAddress);
    }
}
