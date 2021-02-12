package chapter9.iterator.classes;

import java.util.Iterator;
import chapter9.iterator.interfaces.Menu;

public class Waitress {

  private Menu[] menus;

  public Waitress(Menu... menus) {
    this.menus = menus;
  }

  public void printMenu() {
    System.out.println("MENU\n-----");
    for (int i = 0; i < menus.length; i++) {
      eachMenu(menus[i]);
    }
  }

  public void printBreakfastMenu() {
    if (menus.length > 0) {
      System.out.println("MENU\n----");
      eachMenu(menus[0]);
    } else {
      System.out.println("Breakfast Menu not found!");
    }
  }

  public void printLunchMenu() {
    if (menus.length > 1) {
      System.out.println("MENU\n----");
      eachMenu(menus[1]);
    } else {
      System.out.println("Lunch Menu not found!");
    }
  }

  public void printDinnerMenu() {
    if (menus.length > 2) {
      System.out.println("MENU\n----");
      eachMenu(menus[2]);
    } else {
      System.out.println("Dinner Menu not found!");
    }
  }

  public void printVegetarianMenu() {
    System.out.println("VEGETARIAN MENU\n-----");
    for (int i = 0; i < menus.length; i++) {
      printOnlyVegetarianMenuItemByIterator(menus[i]);
    }
  }

  public boolean isItemVegetarian(String name) {

    for (int i = 0; i < menus.length; i++) {
      if (isVegetarianMenuItemByIterator(menus[i].getIterator(), name)) {
        return true;
      }
    }

    return false;
  }

  private void eachMenu(Menu menu) {
    Iterator<MenuItem> iterator = menu.getIterator();
    System.out.println(menu.getName());
    printMenuItemByIterator(iterator);
    System.out.println();
  }

  private void printMenuItemByIterator(Iterator<MenuItem> iterator) {
    while (iterator.hasNext()) {
      MenuItem menuItem = iterator.next();
      System.out.println(menuItem);
    }
  }

  private void printOnlyVegetarianMenuItemByIterator(Menu menu) {
    Iterator<MenuItem> menuIterator = menu.getIterator();
    System.out.println(menu.getName());
    while (menuIterator.hasNext()) {
      MenuItem menuItem = menuIterator.next();
      if (menuItem.isVegetarian()) {
        System.out.println(menuItem);
      }
    }
    System.out.println();
  }

  private boolean isVegetarianMenuItemByIterator(Iterator<MenuItem> iterator, String name) {
    while (iterator.hasNext()) {
      MenuItem menuItem = iterator.next();
      if (menuItem.getName().equals(name) && menuItem.isVegetarian()) {
        return true;
      }
    }
    return false;
  }

}
