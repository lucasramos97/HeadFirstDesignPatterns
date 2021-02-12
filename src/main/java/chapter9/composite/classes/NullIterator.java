package chapter9.composite.classes;

import java.util.Iterator;
import chapter9.composite.interfaces.MenuComponent;

public class NullIterator implements Iterator<MenuComponent> {

  @Override
  public boolean hasNext() {
    return false;
  }

  @Override
  public MenuComponent next() {
    return null;
  }

}
