package chapter1.classes.ducks;

import chapter1.classes.behaviors.FlyNoWay;
import chapter1.classes.behaviors.MuteQuack;

public class DecoyDuck extends Duck {
  
  public DecoyDuck() {
    super.setFlyBehavior(new FlyNoWay());
    super.setQuackBehavior(new MuteQuack());
  }
  
  @Override
  public void display() {
    System.out.println("I'm a decoy duck!");
  }
  
}
