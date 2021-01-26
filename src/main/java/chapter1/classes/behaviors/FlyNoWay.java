package chapter1.classes.behaviors;

import chapter1.interfaces.FlyBehavior;

public class FlyNoWay implements FlyBehavior {

  public void fly() {
    System.out.println("I don't fly!");
  }

}
