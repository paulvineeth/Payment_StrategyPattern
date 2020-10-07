public class CardPayment implements PaymentType{
    private String cardNo, cvv;
    CardPayment(String cardNo, String cvv){
        this.cardNo = cardNo;
        this.cvv = cvv;
    }
    @Override
    public void whatPayment() {
        System.out.println("This is Card Payment");
    }
}
