public class customer extends productViewer {
    private long Id;
    private String name, address, phnNo;
    private cart cart;

    public customer(String name, String address, String phnNo) {
        this.name = name;
        this.address = address;
        this.phnNo = phnNo;
        this.Id = System.currentTimeMillis();
        cart = new cart();
    }

    public String addToCart(product product){
        return cart.addProduct(product);
    }

    public String deleteFromCart(product product){
        return cart.removeProduct(product);
    }
    public String makePayment(double amount, String cardType, String cardNo){
        payment payment = new payment(Id, name, cardType, cardNo, amount);
        return "Paid "+payment.pay()+"$ with "+cardType;
    }

    public String buyProducts(String cardType, String cardNo){
        String paymentStatus = makePayment(cart.getPrice(), cardType, cardNo);
        shop.getShop().admin.makeShipment(cart);
        cart.clear();
        return  paymentStatus;
    }
}
