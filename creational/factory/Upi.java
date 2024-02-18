package creational.factory;

public class Upi implements PaymentMode{

    @Override
    public void makePayment() {
        System.out.println("UPI payment - successfully");
    }
}
