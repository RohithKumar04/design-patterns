package behaviourial.command;

public class LivingRoom {

    private Light light;

    public void setLight(Light light) {
        this.light=light;
    }

    public Light getLight() {
        return light;
    }

    public void executeCommand(Command command) {
        command.execute();
    }

    //Not a Good practise as toggleLight needs ot be repeated multiple times when there are multiple rooms, Which violates SRA
//    public void toggleLight() {
//        light.switchLights();
//    }
}
