public class PaymentMain {
    public static void main(String args[]){
        Transaction t = new Transaction(new UpiPayment("984572625"), 1200, "123");
        t.getPaymentType().whatPayment();
    }
}

