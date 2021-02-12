package chapter9.composite.classes;

import java.util.Iterator;
import chapter9.composite.interfaces.MenuComponent;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class MenuItem implements MenuComponent {

  private String name;
  private String description;
  private boolean vegetarian;
  private double price;

  @Override
  public String getName() {
    return name;
  }

  @Override
  public String getDescription() {
    return description;
  }

  @Override
  public boolean isVegetarian() {
    return vegetarian;
  }

  @Override
  public double getPrice() {
    return price;
  }

  @Override
  public void print() {
    StringBuilder message = new StringBuilder();
    message.append("  ");
    message.append(name);
    if (isVegetarian()) {
      message.append("(v)");
    }
    message.append(", ");
    message.append(price);
    message.append("\n");
    message.append("     -- ");
    message.append(description);
    System.out.println(message.toString());
  }

  @Override
  public Iterator<MenuComponent> getIterator() {
    return new NullIterator();
  }

}
