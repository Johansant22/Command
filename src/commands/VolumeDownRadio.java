package commands;

import devices.ElectronicDevice;

public class VolumeDownRadio implements Command {
    private ElectronicDevice device;

    public VolumeDownRadio (ElectronicDevice device){
        this.device = device;
    }
    @Override
    public void execute() {
        device.volumenDown();
    }

    @Override
    public void undo() {
       device.volumenUp();
    }
    
}
