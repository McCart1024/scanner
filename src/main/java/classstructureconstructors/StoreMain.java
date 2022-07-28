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


        Store store2=new Store("barack");

        System.out.println(store2.getProduct()+" , "+store2.getStock());

        store2.store(4);
        System.out.println(store2.getStock());
        store2.disPatch(2);
        System.out.println(store2.getStock());

        store2.store(5);
        System.out.println(store2.getStock());
        store2.disPatch(2);
        System.out.println(store2.getStock());
    }

}
