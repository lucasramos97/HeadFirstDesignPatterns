package chapter1.classes.ducks;

import chapter1.classes.behaviors.FlyNoWay;
import chapter1.classes.behaviors.Squeak;

public class RubberDuck extends Duck {
  
  public RubberDuck() {
    super.setFlyBehavior(new FlyNoWay());
    super.setQuackBehavior(new Squeak());
  }
  
  @Override
  public void display() {
    System.out.println("I'm a rubber duck!");
  }

}
