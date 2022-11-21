public class guest extends productViewer {
    public customer getRegistered(String name, String address, String phoneNum) {
        customer customer = new customer(name, address, phoneNum);
        shop.getShop().customers.add(customer);
        return customer;
    }
}
