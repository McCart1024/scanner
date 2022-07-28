package classstructureintegrate;

import java.util.Scanner;

public class ProductMain {

    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        System.out.println("Termék neve?");
        String name=scanner.nextLine();
        System.out.println("Termék ára?");
        int price=scanner.nextInt();

        Product product=new Product(name,price);
        System.out.println(product.getName()+" , "+product.getPrice());

        product.increasePrice(150);
        System.out.println(product.getPrice());

        product.decreasePrice(50);
        System.out.println(product.getPrice());






    }
}
