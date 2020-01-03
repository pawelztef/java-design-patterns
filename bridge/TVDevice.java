//Here is implementation of EntertainmentDevice abstract class.
//I'm specifiying what makes it different from other divaces.
public class TVDevice extends EntertainmentDevice {
    public TVDevice(int newDeviceState, int newMaxSetting) {
        deviceState = newDeviceState;
        maxSetting = newMaxSetting;
    }
    
    public void buttonFivePressed() {
        System.out.println("Channel Down");
        deviceState--;
    }
    public void buttonSixPressed() {
        System.out.println("Channel Up");
        deviceState++;
    }
}