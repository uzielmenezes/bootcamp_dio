public class User {
    public static void main(String[] args) throws Exception {
        SmartTv smartTv = new SmartTv();

        System.out.println("TV turned on? " + smartTv.on);
        System.out.println("Which channel? " + smartTv.channel);
        System.out.println("Which volume? " + smartTv.volume);

        smartTv.turnOn();
        System.out.println("TV turned on? " + smartTv.on);
        smartTv.turnOff();
        System.out.println("TV turned on? " + smartTv.on);
        smartTv.turnOn();
        System.out.println("TV turned on? " + smartTv.on);

        smartTv.turnVolumeDown();
        smartTv.turnVolumeDown();
        smartTv.turnVolumeDown();
        System.out.println("Which volume? " + smartTv.volume);
        smartTv.turnVolumeUp();
        smartTv.turnVolumeUp();
        System.out.println("Which volume? " + smartTv.volume);

        smartTv.changeChannel(255);
        System.out.println("Which channel? " + smartTv.channel);
        smartTv.changeChannel(11);
        System.out.println("Which channel? " + smartTv.channel);

    }
}
