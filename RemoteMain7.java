public class RemoteMain7 {
    public static void main(String[] args) {
        Remote7 myRemote = new Television7();

        myRemote.powerOn();
        myRemote.changeChannel(5);
        myRemote.changeChannel(10);
        myRemote.powerOff();
        myRemote.changeChannel(3);
    }
}
