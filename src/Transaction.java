public class Transaction {
    private PaymentType pt;
    private int amount;
    private String transactionId;
    Transaction(PaymentType pt, int amount, String transactionId){
        this.pt = pt;
        this.amount = amount;
        this.transactionId = transactionId;
    }
    PaymentType getPaymentType(){
        return pt;
    }
}
