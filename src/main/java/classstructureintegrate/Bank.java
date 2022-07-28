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

        BankAccount bankaccount=new BankAccount(accountNumber,owner,balance);

        bankaccount.deposit(500000);
        System.out.println(bankaccount.getInfo());;

        bankaccount.withdraw(350000);
        System.out.println(bankaccount.getInfo());

    }
}
