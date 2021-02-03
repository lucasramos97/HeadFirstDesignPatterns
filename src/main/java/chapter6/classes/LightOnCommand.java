package chapter6.classes;

import chapter6.interfaces.Command;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class LightOnCommand implements Command {

  private Light light;

  @Override
  public void execute() {
    this.light.on();
  }

  @Override
  public void undo() {
    this.light.off();
  }

}
