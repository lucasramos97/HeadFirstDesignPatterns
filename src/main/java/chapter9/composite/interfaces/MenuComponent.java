package chapter9.composite.interfaces;

import java.util.Iterator;

public interface MenuComponent {

  public default void add(MenuComponent menuComponent) {
    throw new UnsupportedOperationException();
  }

  public default void remove(MenuComponent menuComponent) {
    throw new UnsupportedOperationException();
  }

  public default MenuComponent getChild(int i) {
    throw new UnsupportedOperationException();
  }

  public default String getName() {
    throw new UnsupportedOperationException();
  }

  public default String getDescription() {
    throw new UnsupportedOperationException();
  }

  public default double getPrice() {
    throw new UnsupportedOperationException();
  }

  public default boolean isVegetarian() {
    throw new UnsupportedOperationException();
  }

  public default void print() {
    throw new UnsupportedOperationException();
  }

  public Iterator<MenuComponent> getIterator();

}
