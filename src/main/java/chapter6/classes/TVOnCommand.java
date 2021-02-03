package chapter6.classes;

import chapter6.interfaces.Command;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class TVOnCommand implements Command {

  private TV tv;

  @Override
  public void execute() {
    this.tv.on();
  }

  @Override
  public void undo() {
    this.tv.off();
  }

}
