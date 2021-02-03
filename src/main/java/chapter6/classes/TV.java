package chapter6.classes;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class TV {

  private String local;

  public void on() {
    System.out.println(String.format("%s TV is on", this.local));
  }

  public void off() {
    System.out.println(String.format("%s TV is off", this.local));
  }

}
