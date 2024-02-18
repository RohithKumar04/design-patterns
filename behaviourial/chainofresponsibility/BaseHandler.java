package behaviourial.chainofresponsibility;

public abstract class BaseHandler{

    private BaseHandler nextHandler;

    public BaseHandler setNextHandler(BaseHandler nextHandler) {
        this.nextHandler=nextHandler;
        return nextHandler;
    }

    public abstract boolean handle(String name, String password, String role);

    public void handleNext(String name, String password, String role) {

//        boolean proceed = handle(name, password, role);

        if (nextHandler != null) {
            nextHandler.handle(name, password, role);
        }
    }
}
