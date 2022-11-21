public class payment {
    private long cusId;
    private String name, cardType, cardNo;
    private double amount;

    public payment(long cusId, String name, String cardType, String cardNo, double amount) {
        this.cusId = cusId;
        this.name = name;
        this.cardType = cardType;
        this.cardNo = cardNo;
        this.amount = amount;
    }
    public double pay(){
        return amount;
    }
}
