package chapter10.classes;

import chapter10.interfaces.State;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class WinnerState implements State {

  private GumballMachine gumballMachine;

  @Override
  public void insertQuarter() {
    System.out.println("Please wait, we're already giving you a gumball");
  }

  @Override
  public void ejectQuarter() {
    System.out.println("Sorry, you already turned the crank");
  }

  @Override
  public void turnCrank() {
    System.out.println("Turning twice doesn't get you another gumball!");
  }

  @Override
  public void dispense() {
    System.out.println("YOU'RE A WINNER! You get two gumballs for your quarter");
    if (gumballMachine.getCount() == 0) {
      gumballMachine.setState(gumballMachine.getSoldOutState());
    } else {
      for (int i = 0; i < 2; i++) {
        gumballMachine.releaseBall();
        if (gumballMachine.getCount() > 0) {
          gumballMachine.setState(gumballMachine.getNoQuarterState());
        } else {
          System.out.println("Oops, out of gumballs!");
          gumballMachine.setState(gumballMachine.getSoldOutState());
        }
      }
    }
  }

}
