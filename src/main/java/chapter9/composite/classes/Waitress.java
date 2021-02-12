package chapter9.composite.classes;

import java.util.Iterator;
import chapter9.composite.interfaces.MenuComponent;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class Waitress {

  private MenuComponent allMenus;

  public void printMenu() {
    allMenus.print();
  }

  public void printVegetarianMenu() {
    Iterator<MenuComponent> menuComponentIterator = allMenus.getIterator();
    System.out.println("VEGETARIAN MENU\n----");
    while (menuComponentIterator.hasNext()) {
      MenuComponent menuComponent = menuComponentIterator.next();
      try {
        if (menuComponent.isVegetarian()) {
          menuComponent.print();
        }
      } catch (UnsupportedOperationException e) {
      }
    }
  }

}
