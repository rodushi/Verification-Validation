import java.util.ArrayList;

public class shop {
    private static shop onlineShop = null;
    admin admin;
    ArrayList<product> products;
    ArrayList<customer> customers;

    public shop() {
        admin = new admin("Manager");
        products = new ArrayList<product>();
        customers = new ArrayList<customer>();

    }

    public static shop getShop() {
        return onlineShop == null ? onlineShop = new shop() : onlineShop ;
    }

    public ArrayList<product> getProducts() {
        return products;
    }

    public admin getAdmin() {
        return admin;
    }

    public ArrayList<customer> getCustomers() {
        return customers;
    }

}
