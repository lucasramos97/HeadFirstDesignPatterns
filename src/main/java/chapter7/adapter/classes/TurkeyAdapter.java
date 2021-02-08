package chapter7.adapter.classes;

import chapter7.adapter.interfaces.Duck;
import chapter7.adapter.interfaces.Turkey;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class TurkeyAdapter implements Duck {

  private Turkey turkey;

  @Override
  public void quack() {
    System.out.println("Gobb... Quack");
  }

  @Override
  public void fly() {
    for (int i = 0; i < 5; i++) {
      this.turkey.fly();
    }
  }

}
