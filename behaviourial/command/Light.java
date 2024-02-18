package behaviourial.command;

public class Light {

    private boolean status;

    public Light() {
        this.status=false;
    }

    public boolean isStatus() {
        return status;
    }

    public boolean switchLights() {
        status = !status;
        return status;
    }
}
