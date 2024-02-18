package behaviourial.command;

public class Main {

    public static void main(String[] args) {

        LivingRoom livingRoom = new LivingRoom();
        livingRoom.setLight(new Light());

        System.out.println(livingRoom.getLight().isStatus());

        // Entire logic is swifted to Business logic rather than Class logic
        livingRoom.executeCommand(new SwitchLightsCommand(livingRoom.getLight()));

        System.out.println(livingRoom.getLight().isStatus());

        //Not a good practice
//        System.out.println(livingRoom.getLight().isStatus());
//        livingRoom.toggleLight();
//        System.out.println(livingRoom.getLight().isStatus());
    }
}
