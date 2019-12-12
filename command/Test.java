public class Test {
    public static void main(String... args) {
        Light light = new Light();
        RemoteControl rc = new RemoteControl();
        Command lightsOn = new LightOnCommand(light);
        Command lightsOff = new LightOffCommand(light);
        rc.setCommand(lightsOn);
        rc.pressButton();
        rc.setCommand(lightsOff);
        rc.pressButton();
    }
}