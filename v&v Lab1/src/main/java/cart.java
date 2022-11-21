import java.util.ArrayList;

public class cart {
    private long Id;
    private int noOfProducts;
    ArrayList<product>products;
    private double totalPrice;

    public cart() {
        this.Id = System.currentTimeMillis();
        noOfProducts = 0;
        totalPrice = 0;
        products = new ArrayList<product>();
    }

    public String addProduct(product product){
        this.products.add(product);
        this.noOfProducts++;
        this.totalPrice += product.getPrice();
        return noOfProducts+" products valued "+totalPrice;
    }

    public String removeProduct(product product){
        this.products.remove(product);
        this.noOfProducts--;
        this.totalPrice -= product.getPrice();
        return noOfProducts+" products valued "+totalPrice;
    }

    public double getPrice(){
        return this.totalPrice;
    }

    public void clear(){
        noOfProducts  = 0;
        totalPrice = 0;
        products.clear();
    }
}
