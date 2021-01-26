package chapter1.classes.behaviors;

import chapter1.interfaces.QuackBehavior;

public class Squeak implements QuackBehavior {

  public void quack() {
    System.out.println("Squeak!");
  }
  
}
