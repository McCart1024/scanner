package classstructureintegrate;

import java.util.Scanner;

public class Bank {


    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        System.out.println("Számlaszám:");
        String accountNumber=scanner.nextLine();
        System.out.println("Számlatulajdonos neve:");
        String owner= scanner.nextLine();
        System.out.println("Folyószámla egyenleg:");
        int balance=scanner.nextInt();
        scanner.nextLine();

        BankAccount bankaccount=new BankAccount(accountNumber,owner,balance);

        System.out.println(bankaccount.getInfo());

        System.out.println("Befizetés összege:");
        bankaccount.deposit(scanner.nextInt());
        System.out.println(bankaccount.getInfo());

        System.out.println("Kivét összege:");
        bankaccount.withdraw(scanner.nextInt());

        System.out.println(bankaccount.getInfo());;

    }
}
