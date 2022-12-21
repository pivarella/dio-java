public class SmartTv {

    boolean powerOff = true;
    int channel = 1;
    int volume = 20;

    public void powerOn() {
        powerOff = false;
    }

    public void powerOff() {
        powerOff = true;
    }
    
    public void turnUP() {
        volume++;
    }
    
    public void turnDown() {
        volume--;
    }
    
    public void changeChannel(int newChannel) {
        channel = newChannel;
    }

    public void channelUp() {
        channel++;
    }
    
    public void channelDown() {
        channel--;
    }
}
