package chapter6.classes;

import chapter6.interfaces.Command;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class HottubOnCommand implements Command {

  private Hottub hottub;

  @Override
  public void execute() {
    this.hottub.on();
  }

  @Override
  public void undo() {
    this.hottub.off();
  }

}
