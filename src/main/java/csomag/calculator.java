package csomag;

import java.util.Scanner;

public class calculator {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        double answer;
        boolean bool=false;

        System.out.println("1. szam:");
        double firstNumber = scanner.nextDouble();
        System.out.println("2. szam:");
        double secondNumber = scanner.nextDouble();

        do {


            System.out.println("Milyen muveletet vegeznel rajtuk? \n osszeadas: + \n kivonas: - \n szorzas: * \n osztas: /");
            char operator = scanner.next().charAt(0);

            switch (operator) {
                case '+':
                    answer = firstNumber + secondNumber;
                    System.out.println(answer);
                    bool = true;
                    break;
                case '-':
                    answer = firstNumber - secondNumber;
                    System.out.println(answer);
                    bool = true;
                    break;
                case '/':
                    answer = (firstNumber / secondNumber);
                    System.out.println(answer);
                    bool = true;
                    break;
                case '*':
                    answer = firstNumber * secondNumber;
                    System.out.println(answer);
                    bool = true;
                    break;

                default:
                    System.out.println("Nem ertelmezheto muvelet. Probald ujra.");
            }


        } while (!bool);

    }
}