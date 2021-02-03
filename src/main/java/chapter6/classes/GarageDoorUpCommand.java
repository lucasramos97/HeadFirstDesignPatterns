package chapter6.classes;

import chapter6.interfaces.Command;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class GarageDoorUpCommand implements Command {

  private GarageDoor garageDoor;

  @Override
  public void execute() {
    this.garageDoor.up();
  }

  @Override
  public void undo() {
    this.garageDoor.down();
  }

}
