package behaviourial.chainofresponsibility;

public class RoleHandler extends BaseHandler{
    @Override
    public boolean handle(String name,String password,String role) {
        System.out.println("Inside RoleHandler");
        if ("Role".equals(role)) {
            this.handleNext(name, password, role);
        }
        return false;
    }
}
