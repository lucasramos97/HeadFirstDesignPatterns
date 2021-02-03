package chapter6.classes;

import chapter6.interfaces.Command;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class GarageDoorDownCommand implements Command {

  private GarageDoor garageDoor;

  @Override
  public void execute() {
    this.garageDoor.down();
  }

  @Override
  public void undo() {
    this.garageDoor.up();
  }

}
