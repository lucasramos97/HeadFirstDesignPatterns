package chapter3.classes;

import chapter3.enums.CoffeeSize;

public class Milk extends CondimentDecorator {

  private Beverage beverage;

  public Milk(Beverage beverage) {
    this.beverage = beverage;
    this.setSize(this.beverage.getSize());
  }

  @Override
  public String getDescription() {
    return this.beverage.getDescription() + ", Milk";
  }

  @Override
  public double cost() {

    if (this.beverage.getSize().equals(CoffeeSize.TALL)) {
      return 0.1 + this.beverage.cost();
    }

    if (this.beverage.getSize().equals(CoffeeSize.GRANDE)) {
      return 0.15 + this.beverage.cost();
    }

    if (this.beverage.getSize().equals(CoffeeSize.VENTI)) {
      return 0.2 + this.beverage.cost();
    }

    return 0 + this.beverage.cost();

  }

}
