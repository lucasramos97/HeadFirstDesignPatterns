package chapter11.remoteproxy;

public class SoldOutState implements State {

  private static final long serialVersionUID = 1L;

  @Override
  public String getName() {
    return "Sold Out State";
  }

  @Override
  public String toString() {
    return getName();
  }

}
