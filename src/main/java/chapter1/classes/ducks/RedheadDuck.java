package chapter1.classes.ducks;

import chapter1.classes.behaviors.FlyWithWings;
import chapter1.classes.behaviors.Quack;

public class RedheadDuck extends Duck {
  
  public RedheadDuck() {
    super.setFlyBehavior(new FlyWithWings());
    super.setQuackBehavior(new Quack());
  }
  
  @Override
  public void display() {
    System.out.println("I'm a redhead duck!");
  }

}
