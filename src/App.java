import java.util.ArrayList;
import java.util.List;

import commands.TurnOffAllDevice;
import commands.TurnOffRadio;
import commands.TurnOffTelevision;
import commands.TurnOnRadio;
import commands.TurnOnTelevision;
import commands.VolumeDownRadio;
import commands.VolumeDownTelevision;
import commands.VolumeUpRadio;
import commands.VolumeUpTelevision;
import devices.ElectronicDevice;
import devices.Radio;
import devices.Television;

public class App {
    public static void main(String[] args) throws Exception {

    ElectronicDevice televisionOne = new Television("LG ");
        TurnOnTelevision onCommand = new TurnOnTelevision(televisionOne);

        DeviceButton onPressed;
        onPressed = new DeviceButton(onCommand);
        onPressed.press();

        TurnOffTelevision offCommand = new TurnOffTelevision(televisionOne);
        onPressed = new DeviceButton(offCommand);
        onPressed.press();

        VolumeUpTelevision volUpCommand = new VolumeUpTelevision(televisionOne);
        onPressed = new DeviceButton(volUpCommand);
        onPressed.press();
        onPressed.press();
        onPressed.press();

        VolumeDownTelevision volumeDownTelevision = new VolumeDownTelevision(televisionOne);
        onPressed = new DeviceButton(volumeDownTelevision);
        onPressed.press();

    ElectronicDevice radioOne = new Radio("Radio 1 ");
        TurnOnRadio onCommandRadio = new TurnOnRadio(radioOne);

        DeviceButton onPressedButton;
        onPressedButton = new DeviceButton(onCommandRadio);
        onPressedButton.press();

        TurnOffRadio offCommandRadio = new TurnOffRadio(radioOne);
        onPressedButton = new DeviceButton(offCommandRadio);
        onPressedButton.press();

        VolumeUpRadio volumeUpCommandRadio = new VolumeUpRadio(radioOne);
        onPressedButton = new DeviceButton(volumeUpCommandRadio);
        onPressedButton.press();
        onPressedButton.press();
        onPressedButton.press();

        VolumeDownRadio volumeDownCommandRadio = new VolumeDownRadio(radioOne);
        onPressedButton = new DeviceButton(volumeDownCommandRadio);
        onPressedButton.press();
    
    Television televisionTwo = new Television("SAMSUNG ");
    Radio radioTwo = new Radio("Pioner ");
        List<ElectronicDevice> allDevice = new ArrayList<>();
        allDevice.add(televisionTwo);
        allDevice.add(radioTwo);

        TurnOffAllDevice turnOffAllDevice = new TurnOffAllDevice(allDevice);

        DeviceButton turnThemOff = new DeviceButton (turnOffAllDevice);

        turnThemOff.press();
        turnThemOff.pressUndo();
    
    }  

    
}
