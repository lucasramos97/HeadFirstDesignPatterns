package chapter9.iterator.classes;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class MenuItem {

  private String name;
  private String description;
  private boolean vegetarian;
  private double price;

  @Override
  public String toString() {
    return String.format("%s, %.2f -- %s", name, price, description);
  }

}
