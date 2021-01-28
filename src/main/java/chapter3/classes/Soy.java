package chapter3.classes;

import chapter3.enums.CoffeeSize;

public class Soy extends CondimentDecorator {

  private Beverage beverage;

  public Soy(Beverage beverage) {
    this.beverage = beverage;
    this.setSize(this.beverage.getSize());
  }

  @Override
  public String getDescription() {
    return this.beverage.getDescription() + ", Soy";
  }

  @Override
  public double cost() {

    if (this.beverage.getSize().equals(CoffeeSize.TALL)) {
      return 0.15 + this.beverage.cost();
    }

    if (this.beverage.getSize().equals(CoffeeSize.GRANDE)) {
      return 0.2 + this.beverage.cost();
    }

    if (this.beverage.getSize().equals(CoffeeSize.VENTI)) {
      return 0.25 + this.beverage.cost();
    }

    return 0 + this.beverage.cost();

  }

}
