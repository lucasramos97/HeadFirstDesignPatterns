package chapter6.classes;

import chapter6.interfaces.Command;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class StereoOnCommand implements Command {

  private Stereo stereo;

  @Override
  public void execute() {
    this.stereo.on();
  }

  @Override
  public void undo() {
    this.stereo.off();
  }

}
