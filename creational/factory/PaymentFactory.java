package creational.factory;

public class PaymentFactory {

    public static PaymentMode createPayment(String mode) {
        return switch (mode) {
            case "CC" -> new CreditCard();
            case "DC" -> new DebitCard();
            default -> new Upi();
        };
    }
}
