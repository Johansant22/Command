package devices;

public class Radio implements ElectronicDevice {
    private int volume = 0;
    private String name;
    public Radio (String name) {
        this.name = name;
    }
    @Override
    public void on() {
        System.out.println(name + "Radio is on");
    }
    @Override
    public void off() {
        System.out.println(name + "Radio is off");;
    }
    @Override
    public void volumenUp() {
        volume++;
        System.out.println(name + "Radio volume at: " + volume);
    }
    @Override
    public void volumenDown() {
        volume--;
        System.out.println(name + "Radio volume at: " + volume);
    }
    
}