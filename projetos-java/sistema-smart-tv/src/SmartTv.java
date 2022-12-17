public class SmartTv {

    boolean on = false;
    int channel = 1;
    int volume = 25;

    public void turnOn() {
        on = true;
    }

    public void turnOff() {
        on = false;
    }

    public void turnVolumeUp() {
        volume++;
    }

    public void turnVolumeDown() {
        volume--;
    }

    public void changeChannel(int newchannel) {
        this.channel = newchannel;
    }
}
