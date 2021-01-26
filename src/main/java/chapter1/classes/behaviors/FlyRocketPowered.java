package chapter1.classes.behaviors;

import chapter1.interfaces.FlyBehavior;

public class FlyRocketPowered implements FlyBehavior {

  public void fly() {
    System.out.println("I'm flying with a rocket!");
  }

}
