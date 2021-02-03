package chapter6.classes;

import chapter6.interfaces.Command;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class LightOffCommand implements Command {

  private Light light;

  @Override
  public void execute() {
    this.light.off();
  }

  @Override
  public void undo() {
    this.light.on();
  }

}
