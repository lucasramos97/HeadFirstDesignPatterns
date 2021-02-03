package chapter6.main;

import chapter6.classes.CeilingFan;
import chapter6.classes.CeilingFanOffCommand;
import chapter6.classes.CeilingFanOnCommand;
import chapter6.classes.GarageDoor;
import chapter6.classes.GarageDoorDownCommand;
import chapter6.classes.GarageDoorUpCommand;
import chapter6.classes.Hottub;
import chapter6.classes.HottubOnCommand;
import chapter6.classes.Light;
import chapter6.classes.LightDimCommand;
import chapter6.classes.LightOffCommand;
import chapter6.classes.LightOnCommand;
import chapter6.classes.MacroCommand;
import chapter6.classes.NoCommand;
import chapter6.classes.RemoteControl;
import chapter6.classes.Stereo;
import chapter6.classes.StereoOffCommand;
import chapter6.classes.StereoOnCommand;
import chapter6.classes.StereoOnWithCDCommand;
import chapter6.classes.StereoOnWithDVDCommand;
import chapter6.classes.TV;
import chapter6.classes.TVOnCommand;
import chapter6.interfaces.Command;

public class RemoteLoader {

  public static void main(String[] args) {

    RemoteControl remoteControl = new RemoteControl();

    Light livingRoomLight = new Light("Living Room");
    Light kitchenLight = new Light("Kitchen");
    CeilingFan ceilingFan = new CeilingFan("Living Room");
    GarageDoor garageDoor = new GarageDoor();
    Stereo stereo = new Stereo("Living Room");
    TV tv = new TV("Living Room");
    Hottub hottub = new Hottub();

    Command livingRoomLightOn = new LightOnCommand(livingRoomLight);
    Command livingRoomLightOff = new LightOffCommand(livingRoomLight);
    Command livingRoomLightDim = new LightDimCommand(livingRoomLight);
    Command kitchenLightOn = new LightOnCommand(kitchenLight);
    Command kitchenLightOff = new LightOffCommand(kitchenLight);

    Command ceilingFanOn = new CeilingFanOnCommand(ceilingFan);
    Command ceilingFanOff = new CeilingFanOffCommand(ceilingFan);

    Command garageDoorUp = new GarageDoorUpCommand(garageDoor);
    Command garageDoorDown = new GarageDoorDownCommand(garageDoor);

    Command stereoOnWithCD = new StereoOnWithCDCommand(stereo);
    Command stereoOff = new StereoOffCommand(stereo);
    Command stereoOn = new StereoOnCommand(stereo);
    Command stereoOnWithDvd = new StereoOnWithDVDCommand(stereo);

    Command tvOn = new TVOnCommand(tv);

    Command hottubOn = new HottubOnCommand(hottub);

    Command macroCommand = new MacroCommand(
        new Command[] {livingRoomLightDim, stereoOn, tvOn, stereoOnWithDvd, hottubOn});

    remoteControl.setCommand(1, livingRoomLightOn, livingRoomLightOff);
    remoteControl.setCommand(2, kitchenLightOn, kitchenLightOff);
    remoteControl.setCommand(3, ceilingFanOn, ceilingFanOff);
    remoteControl.setCommand(4, garageDoorUp, garageDoorDown);
    remoteControl.setCommand(5, stereoOnWithCD, stereoOff);
    remoteControl.setCommand(6, macroCommand, new NoCommand());

    System.out.println(remoteControl);
    remoteControl.onButtonWasPushed(1);
    remoteControl.offButtonWasPushed(1);
    remoteControl.undoButtonWasPushed(1);
    remoteControl.onButtonWasPushed(2);
    remoteControl.offButtonWasPushed(2);
    remoteControl.onButtonWasPushed(3);
    remoteControl.onButtonWasPushed(3);
    remoteControl.onButtonWasPushed(3);
    remoteControl.undoButtonWasPushed(3);
    remoteControl.onButtonWasPushed(3);
    remoteControl.offButtonWasPushed(3);
    remoteControl.undoButtonWasPushed(3);
    remoteControl.onButtonWasPushed(4);
    remoteControl.offButtonWasPushed(4);
    remoteControl.onButtonWasPushed(6);
    remoteControl.undoButtonWasPushed(6);

  }

}
