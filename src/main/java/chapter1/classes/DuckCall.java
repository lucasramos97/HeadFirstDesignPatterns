package chapter1.classes;

import chapter1.classes.behaviors.Quack;
import chapter1.interfaces.QuackBehavior;
import lombok.Setter;

public class DuckCall {
  
  @Setter
  private QuackBehavior quackBehavior;
  
  public DuckCall() {
    this.quackBehavior = new Quack();
  }
  
  public void performQuack() {
    this.quackBehavior.quack();
  }
  
  public void display() {
    System.out.println("I'm a duck call!");
  }

}
