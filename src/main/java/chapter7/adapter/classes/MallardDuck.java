package chapter7.adapter.classes;

import chapter7.adapter.interfaces.Duck;

public class MallardDuck implements Duck {

  @Override
  public void quack() {
    System.out.println("Quack");
  }

  @Override
  public void fly() {
    System.out.println("I'm flying");
  }

}
