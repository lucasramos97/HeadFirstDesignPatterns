package chapter9.iterator.classes;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class DinerIterator implements Iterator<MenuItem> {

  private int counter;
  private MenuItem[] items;

  public DinerIterator(MenuItem[] items) {
    this.items = items;
    counter = 0;
  }

  @Override
  public boolean hasNext() {
    return counter < items.length;
  }

  @Override
  public MenuItem next() {
    if (hasNext()) {
      MenuItem menuItem = items[counter];
      counter++;
      return menuItem;
    }
    throw new NoSuchElementException();
  }

}
