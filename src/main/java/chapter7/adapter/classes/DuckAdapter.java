package chapter7.adapter.classes;

import chapter7.adapter.interfaces.Duck;
import chapter7.adapter.interfaces.Turkey;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class DuckAdapter implements Turkey {

  private Duck duck;

  @Override
  public void gobble() {
    System.out.println("Qua... Gobble gobble");
  }

  @Override
  public void fly() {
    this.duck.fly();
    System.out.println("... a short distance");
  }

}
