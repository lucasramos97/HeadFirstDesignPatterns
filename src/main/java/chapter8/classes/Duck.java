package chapter8.classes;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
public class Duck {

  private String name;

  @Getter
  private int weight;

  @Override
  public String toString() {
    return name + " weights " + weight;
  }

}
