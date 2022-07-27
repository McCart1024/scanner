package classstructureattributes;

import java.util.Scanner;

public class ClientMain {

    public static void main(String[] args) {

        Scanner systemInScanner = new Scanner(System.in);

        Client client = new Client();
        System.out.println("Neve?");
        client.name=systemInScanner.nextLine();
        System.out.println("Szuletesi eve?");
        client.year=systemInScanner.nextInt();

        systemInScanner.nextLine();

        System.out.println("Cime?");
        client.address=systemInScanner.nextLine();

        System.out.printf("A bekuldott adatok:\n Nev: "+client.name + "  \n Szuletesi ev: "+ client.year + "  \n Cim: " + client.address);


    }
}
