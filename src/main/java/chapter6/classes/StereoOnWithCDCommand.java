package chapter6.classes;

import chapter6.interfaces.Command;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class StereoOnWithCDCommand implements Command {

  private Stereo stereo;

  @Override
  public void execute() {
    this.stereo.on();
    this.stereo.setCd();
    this.stereo.setVolume(11);
  }

  @Override
  public void undo() {
    this.stereo.off();
  }

}
