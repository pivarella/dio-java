public class User {
    public static void main(String[] args) throws Exception {
        
        SmartTv smartTV = new SmartTv();

        System.out.println("Power OFF:" + smartTV.powerOff);
        System.out.println("Channel:" + smartTV.channel);
        System.out.println("Volume:" + smartTV.volume);

        smartTV.powerOn();
        smartTV.changeChannel(10);
        smartTV.turnUP();

        System.out.println("Power OFF:" + smartTV.powerOff);
        System.out.println("Channel:" + smartTV.channel);
        System.out.println("Volume:" + smartTV.volume);
    }
}
