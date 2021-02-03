package chapter6.classes;

import chapter6.interfaces.Command;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class StereoOnWithDVDCommand implements Command {

  private Stereo stereo;

  @Override
  public void execute() {
    this.stereo.setDvd();
    this.stereo.setVolume(12);
  }

  @Override
  public void undo() {
    this.stereo.off();
  }

}
