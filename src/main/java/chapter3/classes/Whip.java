package chapter3.classes;

import chapter3.enums.CoffeeSize;

public class Whip extends CondimentDecorator {

  private Beverage beverage;

  public Whip(Beverage beverage) {
    this.beverage = beverage;
    this.setSize(this.beverage.getSize());
  }

  @Override
  public String getDescription() {
    return this.beverage.getDescription() + ", Whip";
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
