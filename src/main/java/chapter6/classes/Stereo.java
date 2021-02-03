package chapter6.classes;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class Stereo {

  private String local;

  public void on() {
    System.out.println(String.format("%s stereo is on", this.local));
  }

  public void setCd() {
    System.out.println(String.format("%s stereo is set for CD input", this.local));
  }

  public void setDvd() {
    System.out.println(String.format("%s stereo is set for DVD input", this.local));
  }

  public void setVolume(int volume) {
    System.out.println(String.format("%s stereo volume set to %d", this.local, volume));
  }

  public void off() {
    System.out.println(String.format("%s stereo is off", this.local));
  }

}
