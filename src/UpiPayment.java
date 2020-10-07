public class UpiPayment implements PaymentType {
    private String upiNumber;
    UpiPayment(String upiNumber){
        this.upiNumber = upiNumber;
    }
    @Override
    public void whatPayment() {
        System.out.println("This UPI");
    }
}
