package chapter11.remoteproxy;

public class NoQuarterState implements State {

  private static final long serialVersionUID = 4608528230808530419L;

  @Override
  public String getName() {
    return "No Quarter State";
  }

  @Override
  public String toString() {
    return getName();
  }

}
