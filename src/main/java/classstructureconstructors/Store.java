package classstructureconstructors;

public class Store {

    private String product;
    private int stock;


    public Store(){

    }

    public Store(String product){
        this.setProduct(product);
        setStock(0);
    }

    public String getProduct() {
        return product;
    }

    public void setProduct(String product) {
        this.product = product;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public void store(int amount){
        setStock(stock+amount);

    }

    public void disPatch(int amount){
        stock-=amount;
    }
}
