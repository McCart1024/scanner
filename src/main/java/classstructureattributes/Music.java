package classstructureattributes;

import java.util.Scanner;

public class Music {

    public static void main(String[] args) {
        Song song = new Song();
        Scanner systemInScanner=new Scanner(System.in);

        System.out.println("Ki az eloado?");
        song.band=systemInScanner.nextLine();
        System.out.println("Mi a cime?");
        song.title=systemInScanner.nextLine();
        System.out.println("Milyen hosszu (perc)?");
        song.length=systemInScanner.nextInt();

        System.out.println("A dal adatai: "+ song.band+" - "+ song.title +" ( " + song.length +" perc)");

    }
}
