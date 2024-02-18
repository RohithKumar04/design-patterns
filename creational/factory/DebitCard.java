package creational.factory;

public class DebitCard implements PaymentMode{
    @Override
    public void makePayment() {
        System.out.println("Debit card payment - successfully");
    }
}
