package creational.factory;

public class Main {

    public static void main(String[] args) {

        PaymentMode mode = PaymentFactory.createPayment("CC");
        mode.makePayment();
    }
}
