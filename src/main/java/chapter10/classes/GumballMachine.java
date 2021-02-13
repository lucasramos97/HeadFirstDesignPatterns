package chapter10.classes;

import chapter10.interfaces.State;
import lombok.Getter;
import lombok.Setter;

public class GumballMachine {

  @Getter
  private State soldOutState;

  @Getter
  private State noQuarterState;

  @Getter
  private State hasQuarterState;

  @Getter
  private State soldState;
  
  @Getter
  private State winnerState;

  @Setter
  private State state;

  @Getter
  private int count;

  public GumballMachine(int count) {

    soldOutState = new SoldOutState(this);
    noQuarterState = new NoQuarterState(this);
    hasQuarterState = new HasQuarterState(this);
    soldState = new SoldState(this);
    winnerState = new WinnerState(this);

    this.count = count;
    if (count > 0) {
      state = noQuarterState;
    } else {
      state = soldOutState;
    }
  }

  public void insertQuarter() {
    state.insertQuarter();
  }

  public void ejectQuarter() {
    state.ejectQuarter();
  }

  public void turnCrank() {
    state.turnCrank();
    state.dispense();
  }

  public void releaseBall() {
    System.out.println("A gumball comes rolling out the slot...");
    if (count != 0) {
      count -= 1;
    }
  }

  @Override
  public String toString() {
    StringBuilder result = new StringBuilder();
    result.append("\nMighty Gumball, Inc.");
    result.append("\nJava-enabled Standing Gumball Model #2004\n");
    result.append("Inventory: ");
    result.append(count);
    result.append(" gumball");
    if (count != 1) {
      result.append("s");
    }
    result.append("\nMachine is ");
    if (state instanceof SoldOutState) {
      result.append("sold out");
    } else if (state instanceof NoQuarterState) {
      result.append("waiting for quarter");
    } else if (state instanceof HasQuarterState) {
      result.append("waiting for turn of crank");
    } else if (state instanceof SoldState) {
      result.append("delivering a gumball");
    }
    result.append("\n");
    return result.toString();
  }
}


