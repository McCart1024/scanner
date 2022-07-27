package classstructuremethods;

import java.util.Scanner;

public class NoteMain {

    public static void main(String[] args) {

        Note note=new Note();
        Scanner scanner=new Scanner(System.in);

        /*
        note.setName("Alajos Piroska");
        note.setTopic("A hazi lekvarkeszites fortelyai");
        note.setText("Fozni kell.");
        */

        System.out.println("Nev:");
        note.setName(scanner.nextLine());
        System.out.println("Tema:");
        note.setTopic(scanner.nextLine());
        System.out.println("Jegyzet szovege:");
        note.setText(scanner.nextLine());

        System.out.println(note.getNoteText());


    }
}
