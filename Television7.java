class Television7 implements Remote7 {
    private boolean isOn;
    private int currentChannel;

    public Television7() {
        this.isOn = false;
        this.currentChannel = 1;
    }

    @Override
    public void powerOn() {
        if (!isOn) {
            isOn = true;
            System.out.println("TV is now on.");
        } else {
            System.out.println("TV is already on.");
        }
    }

    @Override
    public void powerOff() {
        if (isOn) {
            isOn = false;
            System.out.println("TV is now off.");
        } else {
            System.out.println("TV is already off.");
        }
    }

    @Override
    public void changeChannel(int channel) {
        if (isOn && channel > 0) {
            currentChannel = channel;
            System.out.println("Channel changed to " + channel);
        } else if (!isOn) {
            System.out.println("Cannot change channel. TV is off.");
        } else {
            System.out.println("Invalid channel number.");
        }
    }
}