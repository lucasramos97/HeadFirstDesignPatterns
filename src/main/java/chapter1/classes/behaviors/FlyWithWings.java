package chapter1.classes.behaviors;

import chapter1.interfaces.FlyBehavior;

public class FlyWithWings implements FlyBehavior {
  
  public void fly() {
    System.out.println("I'm flying like a duck!");
  }

}
