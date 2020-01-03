public class Test {
    public static void main(String...args) {
        RemoteButton TV = new TVRemoteMute(new TVDevice(1, 200));
        RemoteButton TV2 = new TVRemotePause(new TVDevice(1, 200));

        System.out.println("Test TV with mute.");
        TV.buttonFivePressed();
        TV.buttonSixPressed();
        TV.buttonNinePressed();

        System.out.println("Test TV with pause.");
        TV2.buttonFivePressed();
        TV2.buttonSixPressed();
        TV2.buttonNinePressed();
        TV2.deviceFeedback();

    }
}