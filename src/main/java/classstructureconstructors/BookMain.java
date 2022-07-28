package classstructureconstructors;

import java.util.Scanner;

public class BookMain {


    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        Book firstBook=new Book("Elek Béla","A mindenségsemmisége");

        System.out.println(firstBook.getAuthor() +" : "+ firstBook.getTitle());

        System.out.println("Regisztrációs szám:");
        firstBook.register(scanner.nextLine());
        System.out.println("Reg szám: "+firstBook.getRegNumber());

    }
}
