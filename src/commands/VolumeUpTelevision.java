package commands;

import devices.ElectronicDevice;

public class VolumeUpTelevision implements Command {

    private ElectronicDevice device;
    public VolumeUpTelevision(ElectronicDevice device) {
        this.device = device;
    }
    @Override
    public void execute() {
        device.volumenUp();
    }

    @Override
    public void undo() {
        device.volumenDown();
    }
    
}
