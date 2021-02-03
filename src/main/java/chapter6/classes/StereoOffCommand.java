package chapter6.classes;

import chapter6.interfaces.Command;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class StereoOffCommand implements Command {

  private Stereo stereo;

  @Override
  public void execute() {
    this.stereo.off();
  }

  @Override
  public void undo() {
    this.stereo.on();
    this.stereo.setCd();
    this.stereo.setVolume(11);
  }

}
