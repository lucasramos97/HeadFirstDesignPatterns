package chapter6.classes;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class Light {

  private String local;

  public void on() {
    System.out.println(String.format("%s light is on", this.local));
  }

  public void off() {
    System.out.println(String.format("%s light is off", this.local));
  }

  public void dim() {
    System.out.println(String.format("%s light is dim", this.local));
  }

}
