package csomag;

import java.util.InputMismatchException;
import java.util.Scanner;

public class calculator {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int answer;

        System.out.println("1. szam:");
        int firstNumber = scanner.nextInt();
        System.out.println("2. szam:");
        int secondNumber = scanner.nextInt();
        System.out.println("Milyen muveletet vegeznel rajtuk? \n osszeadas: + \n kivonas: - \n szorzas: * \n osztas: /");
        char operator = scanner.next().charAt(0);

        switch (operator) {
            case '+':
                answer = firstNumber + secondNumber;
                System.out.println(answer);
                break;
            case '-':
                answer = firstNumber - secondNumber;
                System.out.println(answer);
                break;
            case '/':
                answer = firstNumber / secondNumber;
                System.out.println(answer);
                break;
            case '*':
                answer = firstNumber * secondNumber;
                System.out.println(answer);
                break;

            default:
                System.out.println("Nem ertelmezheto muvelet.");

        }


    }
}