package chapter10.classes;

import chapter10.interfaces.State;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class NoQuarterState implements State {

  private GumballMachine gumballMachine;

  @Override
  public void insertQuarter() {
    gumballMachine.setState(gumballMachine.getHasQuarterState());
    System.out.println("You inserted a quarter");
  }

  @Override
  public void ejectQuarter() {
    System.out.println("You haven't inserted a quarter");
  }

  @Override
  public void turnCrank() {
    System.out.println("You turned but there's no quarter");
  }

  @Override
  public void dispense() {
    System.out.println("You need to pay first");
  }

}
