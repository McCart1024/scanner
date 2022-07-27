package classstructuremethods;

public class ClientMain {

    public static void main(String[] args) {

        Client client=new Client();
        client.setName("Kocsis Alfonz");
        client.setYear(1923);
        client.setAddress("Kukutyin koz 36,5.");

        System.out.println("Ugyfel adatai:");
        System.out.println(" Neve: " + client.getName());
        System.out.println(" Szuletett: " + client.getYear() + ".");
        System.out.println(" Cime: " + client.getAddress());

        client.migrate("Amarilla setany 86/B.");

        System.out.println("\nUj cim: " + client.getAddress());

    }
}
