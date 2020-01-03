// This is abstract class that will represent numerous ways to work with each
// device.
public abstract class RemoteButton {
    // Reference to a generic device using aggregation.
    private EntertainmentDevice theDevice;
    
    public RemoteButton(EntertainmentDevice newDevice) {
        theDevice = newDevice;
    }
    
    public void buttonFivePressed() {
        theDevice.buttonFivePressed();
    }
    
    public void buttonSixPressed() {
        theDevice.buttonSixPressed();
    }
    
    public void deviceFeedback() {
        theDevice.deviceFeedback();
    }
    
    public abstract void buttonNinePressed();
}