package chapter6.classes;

import chapter6.interfaces.Command;

public class RemoteControl {

  private Command[] commandsOn;
  private Command[] commandsOff;
  private Command undoCommand;

  public RemoteControl() {
    commandsOn = new Command[7];
    commandsOff = new Command[7];
    undoCommand = new NoCommand();

    for (int i = 0; i < 7; i++) {
      commandsOn[i] = new NoCommand();
      commandsOff[i] = new NoCommand();
    }

  }

  public void setCommand(int slotNumber, Command commandOn, Command commandOff) {
    this.commandsOn[slotNumber - 1] = commandOn;
    this.commandsOff[slotNumber - 1] = commandOff;
  }

  public void onButtonWasPushed(int slotNumber) {
    this.commandsOn[slotNumber - 1].execute();
    this.undoCommand = this.commandsOn[slotNumber - 1];
  }

  public void offButtonWasPushed(int slotNumber) {
    this.commandsOff[slotNumber - 1].execute();
    this.undoCommand = this.commandsOff[slotNumber - 1];
  }

  public void undoButtonWasPushed(int slotNumber) {
    this.undoCommand.undo();
  }

  @Override
  public String toString() {

    StringBuilder msg = new StringBuilder();
    String lastClass = getClassName(commandsOff[0].getClass().getName());

    msg.append("------ Remote Control ------");
    for (int i = 0; i < 7; i++) {
      String commandsOnClassName = getClassName(commandsOn[i].getClass().getName());
      String commandsOffClassName = getClassName(commandsOff[i].getClass().getName());

      String calculateSpacing = calculateSpacing(commandsOnClassName, lastClass);

      msg.append(String.format("\n[slot %d] On command: %s %s Off command: %s", i + 1,
          commandsOnClassName, calculateSpacing, commandsOffClassName));
    }

    msg.append("\n");
    return msg.toString();
  }

  private String getClassName(String pathClass) {
    String[] pathClassSplt = pathClass.split("[.]");
    return pathClassSplt[pathClassSplt.length - 1];
  }

  private String calculateSpacing(String currentClass, String lastClass) {

    StringBuilder value = new StringBuilder();
    int lengthDifference = 0;
    boolean add;

    if (currentClass.length() < lastClass.length()) {

      lengthDifference = lastClass.length() - currentClass.length();
      add = true;

    } else if (currentClass.length() > lastClass.length()) {

      lengthDifference = currentClass.length() - lastClass.length();
      add = false;

    } else {
      return "----------";
    }

    if (add) {
      for (int i = 0; i < 20 + lengthDifference; i++) {
        value.append("-");
      }
    } else {
      for (int i = 0; i < 20 - lengthDifference; i++) {
        value.append("-");
      }
    }

    return value.toString();

  }

}
