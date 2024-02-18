package behaviourial.chainofresponsibility;

public class PasswordHandler extends BaseHandler{

    public PasswordHandler() {
    }

    @Override
    public boolean handle(String name,String password,String role) {
        System.out.println("Inside PasswordHandler");
        if ("Password".equals(password)) {
            this.handleNext(name, password, role);
        }
        return false;
    }
}
