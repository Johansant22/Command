package devices;

public class Television implements  ElectronicDevice {
    private int volume = 0;
    private String name;
    public Television (String name) {
        this.name = name;
    }
    @Override
    public void on() {
        System.out.println(name + "Television is on");
    }
    @Override
    public void off() {
        System.out.println(name + "Television is off");;
    }
    @Override
    public void volumenUp() {
        volume++;
        System.out.println(name + "Television volume at: " + volume);
    }
    @Override
    public void volumenDown() {
        volume--;
        System.out.println(name + "Television volume at: " + volume);
    }
    
}
