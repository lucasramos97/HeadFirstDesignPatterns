package chapter6.classes;

import chapter6.enums.CeilingFanSpeed;
import chapter6.interfaces.Command;

public class CeilingFanOnCommand implements Command {

  private CeilingFan ceilingFan;
  private CeilingFanSpeed prevSpeed;

  public CeilingFanOnCommand(CeilingFan ceilingFan) {
    this.ceilingFan = ceilingFan;
  }

  @Override
  public void execute() {
    this.prevSpeed = this.ceilingFan.getSpeed();
    this.ceilingFan.execute();
  }

  @Override
  public void undo() {
    switch (this.prevSpeed) {

      case HIGH:
        this.ceilingFan.high();
        break;

      case MEDIUM:
        this.ceilingFan.medium();
        break;

      case LOW:
        this.ceilingFan.low();
        break;

      case OFF:
        this.ceilingFan.off();
        break;

      default:
        break;
    }
  }

}
