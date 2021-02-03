package chapter6.classes;

import chapter6.interfaces.Command;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class MacroCommand implements Command {

  private Command[] commands;

  @Override
  public void execute() {
    for (int i = 0; i < commands.length; i++) {
      commands[i].execute();
    }
  }

  @Override
  public void undo() {
    for (int i = 0; i < commands.length; i++) {
      commands[i].undo();
    }
  }

}
