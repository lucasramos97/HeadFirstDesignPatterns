package chapter6.classes;

import chapter6.enums.CeilingFanSpeed;
import lombok.Getter;

public class CeilingFan {

  private String local;

  @Getter
  private CeilingFanSpeed speed;

  public CeilingFan(String local) {
    this.local = local;
    this.speed = CeilingFanSpeed.OFF;
  }

  public void execute() {
    switch (this.speed) {

      case HIGH:
        this.off();
        break;

      case MEDIUM:
        this.high();
        break;

      case LOW:
        this.medium();
        break;

      case OFF:
        this.low();
        break;

      default:
        break;
    }
  }

  public void high() {
    this.speed = CeilingFanSpeed.HIGH;
    System.out.println(String.format("%s ceiling fan is on high", this.local));
  }

  public void medium() {
    this.speed = CeilingFanSpeed.MEDIUM;
    System.out.println(String.format("%s ceiling fan is on medium", this.local));
  }

  public void low() {
    this.speed = CeilingFanSpeed.LOW;
    System.out.println(String.format("%s ceiling fan is on low", this.local));
  }

  public void off() {
    this.speed = CeilingFanSpeed.OFF;
    System.out.println(String.format("%s ceiling fan is off", this.local));
  }

}
