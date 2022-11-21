public class admin extends productViewer {
    private long Id;
    private String name;

    public admin(String name) {
        this.name = name;
        this.Id = System.currentTimeMillis();
    }

    public String addProduct(product product){
        shop.getShop().products.add(product);
        return shop.getShop().products.size()+" products are in stock";
    }
    public String deleteProduct(product product){
        shop.getShop().products.remove(product);
        return shop.getShop().products.size()+" products are in stock";
    }

    public String modifyProduct(long Id, String name, double price, String group, String subgroup){
        for(product product: shop.getShop().products) if(product.getId() == Id){
            product.setPrice(price);
            product.setName(name);
            product.setGroup(group);
            product.setSubgroup(subgroup);
            return "Success";
        }
        return "Failed";
    }

    public String makeShipment(cart cart){
        for(product product:cart.products)
            deleteProduct(product);
        return cart.products.size()+"product(s) Shipped";
    }

    public String confirmDelivery(){
        return "Delivered";
    }



}
