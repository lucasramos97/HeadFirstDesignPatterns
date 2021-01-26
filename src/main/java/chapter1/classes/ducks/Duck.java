package chapter1.classes.ducks;

import chapter1.interfaces.FlyBehavior;
import chapter1.interfaces.QuackBehavior;
import lombok.Setter;

public abstract class Duck {

  @Setter
  private FlyBehavior flyBehavior;
  
  @Setter
  private QuackBehavior quackBehavior;
  
  public void performFly() {
    this.flyBehavior.fly();
  }
  
  public void performQuack() {
    this.quackBehavior.quack();
  }
  
  public void display() {
    System.out.println("I'm a duck!");
  }
  
}
