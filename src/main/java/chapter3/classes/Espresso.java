package chapter3.classes;

public class Espresso extends Beverage {

  public Espresso() {
    super.setDescription("Espresso Coffee");
  }

  @Override
  public double cost() {
    return 1.99;
  }

}
