package chapter9.composite.classes;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import chapter9.composite.interfaces.MenuComponent;

public class Menu implements MenuComponent {

  private String name;
  private String description;
  private List<MenuComponent> menuComponents;

  public Menu(String name, String description) {
    this.name = name;
    this.description = description;
    menuComponents = new ArrayList<>();
  }

  @Override
  public String getName() {
    return name;
  }

  @Override
  public String getDescription() {
    return description;
  }

  @Override
  public void add(MenuComponent menuComponent) {
    menuComponents.add(menuComponent);
  }

  @Override
  public void remove(MenuComponent menuComponent) {
    menuComponents.remove(menuComponent);
  }

  @Override
  public MenuComponent getChild(int i) {
    return menuComponents.get(i);
  }

  @Override
  public void print() {
    StringBuilder message = new StringBuilder();
    message.append("\n");
    message.append(name);
    message.append(", ");
    message.append(description);
    message.append("\n");
    message.append("---------------------");
    System.out.println(message.toString());
    Iterator<MenuComponent> menuComponentIterator = menuComponents.iterator();
    while (menuComponentIterator.hasNext()) {
      menuComponentIterator.next().print();
    }
  }

  @Override
  public Iterator<MenuComponent> getIterator() {
    return new CompositeIterator(menuComponents.iterator());
  }

}
