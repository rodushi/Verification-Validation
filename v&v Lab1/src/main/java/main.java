public class main {
    public static void main(String[] args) {
        shop shop = shop.getShop();

        product Snacks = new product("Pasta", 80, "Food", "Fast food");
        product Boots = new product("Boots", 2000, "LifeStyle", "DailyEssentials");
        product Aloo = new product("Aloo", 35, "Grocery", "GroceryEssential");

        shop.admin.addProduct(Snacks);
        shop.admin.addProduct(Boots);
        shop.admin.addProduct(Aloo);

        guest guest = new guest();
        guest.viewProducts();

        customer Rodushi = guest.getRegistered("Rodushi", "SUST,Sylhet", "01726068707");
        Rodushi.viewProducts();
        Rodushi.addToCart(Aloo);
        Rodushi.addToCart(Snacks);
        Rodushi.buyProducts("DBBL", "9928925432");

        shop.admin.confirmDelivery();

        guest.viewProducts();
    }
}
