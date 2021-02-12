package chapter9.composite.classes;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;
import chapter9.composite.interfaces.MenuComponent;

public class CompositeIterator implements Iterator<MenuComponent> {

  private Deque<Iterator<MenuComponent>> deque;

  public CompositeIterator(Iterator<MenuComponent> iterator) {
    deque = new ArrayDeque<>();
    deque.push(iterator);
  }

  @Override
  public boolean hasNext() {
    if (!deque.isEmpty()) {
      Iterator<MenuComponent> menuComponentIterator = deque.peek();
      if (!menuComponentIterator.hasNext()) {
        deque.pop();
        return hasNext();
      }
      return true;
    }
    return false;
  }

  @Override
  public MenuComponent next() {
    if (hasNext()) {
      Iterator<MenuComponent> menuComponentIterator = deque.peek();
      MenuComponent menuComponent = menuComponentIterator.next();
      if (menuComponent instanceof Menu) {
        deque.push(menuComponent.getIterator());
      }
      return menuComponent;
    }
    return null;
  }

}
