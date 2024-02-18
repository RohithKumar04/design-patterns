package behaviourial.chainofresponsibility;

public class Main {


    public static void main(String[] args) {

        BaseHandler handlers = new UsernameHandler();

        handlers.setNextHandler(new PasswordHandler())
                .setNextHandler(new RoleHandler());

        if(handlers.handle("Rohith", "Password", "CTC")) {
            System.out.println("Sucesss");
        }

    }
}
