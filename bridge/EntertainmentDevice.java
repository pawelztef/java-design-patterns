//Implementor
//With the Bridge Design Pattern you create 2 layers of abstracton.
//In this example we will hava an abstract class representing 
//different types of devices. We'll also have an abstract class that will
//reperesent different types of remote controlls.
abstract class EntertainmentDevice {
    
    public int deviceState;
    public int maxSetting;
    public int volumeLevel = 0;
    public abstract void buttonFivePressed();
    public abstract void buttonSixPressed();
    
    public void deviceFeedback() {
        if(deviceState > maxSetting || deviceState < 0) { deviceState = 0; }
        System.out.println("On channel " + deviceState);
    }
    
    public void buttonSevenPressed() {
        volumeLevel++;
        System.out.println("Volume at: " + volumeLevel);
    }
    
    public void buttonEightPressed() {
        volumeLevel--;
        System.out.println("Volume at: " + volumeLevel);
    }
    
    
}