package chapter3.classes;

import chapter3.enums.CoffeeSize;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public abstract class Beverage {

  private String description = "Unknown Beverage";

  private CoffeeSize size = CoffeeSize.TALL;

  public abstract double cost();

}
