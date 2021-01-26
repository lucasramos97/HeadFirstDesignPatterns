package chapter1.classes.ducks;

import chapter1.classes.behaviors.FlyWithWings;
import chapter1.classes.behaviors.Quack;

public class MallardDuck extends Duck {
  
  public MallardDuck() {
    super.setFlyBehavior(new FlyWithWings());
    super.setQuackBehavior(new Quack());
  }
  
  @Override
  public void display() {
    System.out.println("I'm a mallard duck!");
  }

}
