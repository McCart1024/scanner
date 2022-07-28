package classstructureconstructors;

public class StoreMain {

    public static void main(String[] args) {

        Store store=new Store("alma");

        System.out.println(store.getProduct()+" , "+ store.getStock());

        store.store(50);
        System.out.println(store.getStock());

        store.store(20);
        System.out.println(store.getStock());

        store.disPatch(20);
        System.out.println(store.getStock());

        store.disPatch(10);
        System.out.println(store.getStock());

    }

}
