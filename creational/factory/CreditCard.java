package creational.factory;

public class CreditCard implements PaymentMode{
    @Override
    public void makePayment() {
        System.out.println("Credit card payment - Successfully");
    }
}
