package chapter1.classes.behaviors;

import chapter1.interfaces.QuackBehavior;

public class Quack implements QuackBehavior {

  public void quack() {
    System.out.println("Quack!");
  }
  
}
