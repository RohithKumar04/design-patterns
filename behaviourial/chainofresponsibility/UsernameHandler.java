package behaviourial.chainofresponsibility;

public class UsernameHandler extends BaseHandler{

    @Override
    public boolean handle(String name, String password, String role) {
        System.out.println("Inside UsernameHandler");
        if ("Rohith".equals(name)) {
            this.handleNext(name, password, role);
        }
        return false;
    }
}
