package chapter1.classes.ducks;

import chapter1.classes.behaviors.FlyWithWings;
import chapter1.classes.behaviors.MuteQuack;

public class DumbDuck extends Duck {
  
  public DumbDuck() {
    super.setFlyBehavior(new FlyWithWings());
    super.setQuackBehavior(new MuteQuack());
  }
  
  @Override
  public void display() {
    System.out.println("I'm a dumb duck!");
  }

}
